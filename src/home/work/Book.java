package home.work;

public class Book {
        private int id;
        public String name;
        public String author;
        public String publishing;
        public int publication_date;
        private int number_of_pages;
        private int price;
        private String type_of_binding;

        public Book(int id, String name, String author, String publishing, int publication_date, int number_of_pages, int price, String type_of_binding) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publishing = publishing;
            this.publication_date = publication_date;
            this.number_of_pages = number_of_pages;
            this.price = price;
            this.type_of_binding = type_of_binding;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getPublishing() {
            return publishing;
        }
        public void setPublishing(String publishing) {
            this.publishing = publishing;
        }
        public int getPublication_date() {
            return publication_date;
        }
        public int getNumber_of_pages() {
            return number_of_pages;
        }
        public void setNumber_of_pages(int number_of_pages) {
            this.number_of_pages = number_of_pages;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public String getType_of_binding() {
            return type_of_binding;
        }
        public void setType_of_binding(String type_of_binding) {
            this.type_of_binding = type_of_binding;
        }
    }


