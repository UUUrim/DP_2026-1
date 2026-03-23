package hw.ch01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearSortedIterator implements Iterator<Book> {
    private int index;
    private Book[] sortedBooks;

    public YearSortedIterator(BookShelf bookshelf) {
        int length = bookshelf.getLength();
        sortedBooks = new Book[length];
        for (int i = 0; i < length; i++) {
            sortedBooks[i] = bookshelf.getBookAt(i);
        }

        // 출판 년도를 기준으로 내림차순 정렬
        Arrays.sort(sortedBooks, (a,b) -> b.getYear() - a.getYear());
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < sortedBooks.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = sortedBooks[index];
        index++;
        return book;
    }
}
