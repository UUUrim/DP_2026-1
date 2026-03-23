package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========컴퓨터공학전공 이예서==========");

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        System.out.println("========소설 장르 책========");
        Iterator<Book> it_genre = bookShelf.iteratorByGenre("소설");
        while (it_genre.hasNext()) {
            Book book = it_genre.next();
            System.out.println(book.getName() + ", " + book.getGenre() + ", " + book.getYear() + "년, " + (int) book.getPrice() + "원");
        }
        System.out.println();

        System.out.println("========출판 년도 역순 책 정렬========");
        Iterator<Book> it_year = bookShelf.iteratorByYear();
        while (it_year.hasNext()) {
            Book book = it_year.next();
            System.out.println(book.getName() + ", " + book.getGenre() + ", " + book.getYear() + "년, " + (int) book.getPrice() + "원");
        }
        System.out.println();
    }
}
