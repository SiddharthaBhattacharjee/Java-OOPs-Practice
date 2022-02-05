package com.company;

/*
Program statement :
1] You have to implement a library using Java class Library
2] Methods : addBook, issueBook, returnBook ,+Add borrower, +Remove Borrower
3] Array to store available books
4] Array to store issued books
5] Array to store all books
6] Array of all issuers
 */

import java.util.Arrays;

class Library{

    public int search(String a,String[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
            else if(arr[i]==null){
                break;
            }
        }
        return -1;
    }

//    public void pushArr(String[] s, String[][] arr){
//        for(int i=arr.length-1;i>=1;i--){
//            arr[i] = arr[i-1];
//        }
//        arr[0] = s;
//    }

    public String pop(int x,String[] arr){
        String r = arr[x];
        for(int i=x;i<arr.length-1;i++){
            if(arr[i]!=null){
                arr[i] = arr[i+1];
            }
            else if(arr[i]==null){
                break;
            }
        }
        arr[arr.length-1] = null;
        return r;
    }

    String[] all_books = new String[5000];
    int ab_pointer;
    String[][] issued_books = new String[5000][2];
    int ib_pointer;
    String[] available_books = new String[5000];
    int avb_pointer;
    String[] borrowers = new String[5000];
    int b_pointer;

    public void addBook(String... arr){
        for(String book : arr){
            all_books[ab_pointer] = book;
            ab_pointer++;
            available_books[avb_pointer] = book;
            avb_pointer++;
        }
    }
    public void addBorrower(String... arr){
        for(String bow : arr){
            borrowers[b_pointer] = bow;
            b_pointer++;
        }
    }
    public void removeBorrower(String bow){
        int i = search(bow,borrowers);
        if(i>0){
            String temp = pop(i,borrowers);
            b_pointer--;
        }
    }
    public void issueBook(String book,String bow){
        int p = search(book,available_books);
        String b = pop(p,available_books);
        avb_pointer--;
        String[] sa = {book,bow};
        //pushArr(sa,issued_books);
        issued_books[ib_pointer]=sa;
        ib_pointer++;
    }

    public void returnBook(String book,String bow){
        for(int i=0;i<issued_books.length;i++){
            if(Arrays.equals(issued_books[i], new String[]{book, bow})){
                for(int j=i;j<issued_books.length-1;j++){
                    issued_books[j]=issued_books[j+1];
                }
                issued_books[issued_books.length-1] = null;

//                for(int k=0;k<available_books.length;k++){
//                    if(available_books[k]==null){
//                        available_books[k]=book;
//                        break;
                available_books[avb_pointer] = book;
                avb_pointer++;
            }
        }
    }

    public String[] getAll_books() {
        return all_books;
    }

    public String[] getAvailable_books() {
        return available_books;
    }

    public String[] getBorrowers() {
        return borrowers;
    }

    public String[][] getIssued_books() {
        return issued_books;
    }
}
public class practice_question_5_libraryClass {

    public static void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.print(arr[i]+",");
            }
            else if(arr[i]==null){
                break;
            }
        }
        System.out.println("");
    }

    public static void print2DArray(String[][] arr){
        for(int i=0;i<arr.length;i++){
            if(!Arrays.equals(arr[i], new String[]{null, null})){
                System.out.print("["+arr[i][0]+","+arr[i][1]+"] , ");
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Harry Potter","Game of Thrones","Three man in a boat","The song of Ice and Fire","Gitanjali");
        lib.addBorrower("Harry","Siddhartha","Wasim","Dipit","Anand","Binit");
        lib.removeBorrower("Anand");
        lib.issueBook("Harry Potter","Harry");
        lib.issueBook("Gitanjali","Wasim");
        lib.returnBook("Gitanjali","Wasim");
        printArray(lib.getAll_books());
        printArray(lib.getAvailable_books());
        printArray(lib.getBorrowers());
        print2DArray(lib.getIssued_books());

    }
}
