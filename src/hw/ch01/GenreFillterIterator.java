package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

    public class GenreFillterIterator implements Iterator<Book> {
        private BookShelf bookShelf;
        private int index;
        private String genre;

        public GenreFillterIterator(BookShelf bookShelf, String genre) {
            this.bookShelf = bookShelf;
            this.index = 0;
            this.genre = genre;
        }

        @Override
        public boolean hasNext() {
            while (index < bookShelf.getLength()) {
                Book book = bookShelf.getBookAt(index);
                if (book.getGenre().equals(genre)) {    // 장르가 일치하는 책인지 확인
                    return true;
                }
                index++;
            }
            return false;
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Book book = bookShelf.getBookAt(index);
            index++;
            return book;
        }
}
