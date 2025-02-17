package BookCatlogManagement;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Book {
        private final String title;

        private final String author;

        private  boolean isRead = false;
}
