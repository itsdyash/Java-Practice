//Exercise 4 :- Online Library.
import java.util.Objects;
import java.util.Scanner;
class Library {
    Scanner sc = new Scanner(System.in);
    int input;

    String [] books;
     Library() {
        books = new String[10];
        books [0]= "English";
        books [1]= "Hindi";
        books [2]= "Maths";
        books [3]= "Science";
        books [4]= "Computer";
    }
    void options(){
        System.out.println("Showing Available Buttons: \n 1. Available books:- \n 2. Add Books:-" +
                " \n 3. Issue Books:- \n 4. Return Books:- \n Enter button Number to continue...");
        input = sc.nextInt();
        switch (input) {
            case 1: {
                this.available();
                options();
            }
            break;
            case 2: {
                this.addBooks();
                options();
            }
            break;
            case 3: {
                this.issueBooks();
                options();
            }
            break;
            case 4: {
                this.returnBooks();
                options();
            }
            break;
            default:
                System.out.println("Unexpected value: " + input);
        }

    }
    void available(){
        System.out.println("Available books : ");

        for(int i =0;i<10;i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }
    void addBooks(){
        System.out.println("Enter Book name you want to add: ");
        String newbook;
        newbook = sc.next();
        for(int i =0;i<books.length;i++) {
            if (Objects.equals(newbook, books[i])) {
                System.out.println("book is already in the Library");
                return;
            }
            else if (books[i] == null) {
                books[i] = newbook;
                System.out.println(newbook + " book added.");
                return;
            }

            }
        System.out.println("Space not available");
        }
    void issueBooks(){
        System.out.println("Enter the book you want to Issue : ");
        String newbook;
        newbook = sc.next();
        for(int i =0;i<books.length;i++) {
            if (Objects.equals(newbook, books[i])) {
                System.out.println("book is issued");
                books[i] = newbook + "(Issued)";
                return;
            }
            else if(newbook == null){
                System.out.println("Book is not Available");
                return;
            }

        }
    }
    void returnBooks(){
        System.out.println("Enter the book you want to Return: ");
        String newbook;
        newbook = sc.next();
        String n1= newbook;
        for(int i =0;i<books.length;i++) {
            if (Objects.equals(n1, books[i])) {
                System.out.println("Book is Already Available in the Library");
                return;
                }
            }
        String n2 = newbook + "(Issued)";
        for(int i =0;i<books.length;i++) {
            if (Objects.equals(n2, books[i])) {
                System.out.println("Book is Returned");
                books[i]=n1;
                return;
            }
        }
        System.out.println("This is a new Book Please add this book in Library");
        addBooks();
    }
}

public class onlineLib {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(".....Online Library.....");
        Scanner sc = new Scanner(System.in);
        Library obj = new Library();
        obj.options();
    }
}