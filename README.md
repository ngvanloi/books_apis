# Books API Project

This is a RESTful API for managing a collection of books. It allows users to create, update, retrieve, delete, and list books. The API is implemented using **Java 17**, **Spring Boot**, and follows standard REST conventions.

---

## Features

- **Create or Update a Book:**  
  Add a new book or update an existing book using its ISBN.

- **Retrieve a Book:**  
  Get the details of a specific book by its ISBN.

- **List All Books:**  
  Retrieve a list of all books in the collection.

- **Delete a Book:**  
  Remove a book from the collection by its ISBN.

---

## API Endpoints

### Create or Update Book
**PUT** `/books/{isbn}`  
Request Body:
```json
{
  "title": "Book Title",
  "author": "Author Name"
}
```
Responses:
- `201 Created` if a new book is created.
- `200 OK` if an existing book is updated.

---

### Retrieve Book
**GET** `/books/{isbn}`  
Responses:
- `200 OK` with the book details.
- `404 Not Found` if the book does not exist.

---

### List All Books
**GET** `/books`  
Responses:
- `200 OK` with a list of books.
- Empty list `[]` if no books exist.

---

### Delete Book
**DELETE** `/books/{isbn}`  
Responses:
- `204 No Content` whether the book exists or not.

---

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring MVC**
- **MockMvc** for testing
- **JUnit** for unit testing
- **Jackson** for JSON serialization/deserialization

---

## Running the Application

1. **Prerequisites:**  
   - Java 17 installed.
   - Maven installed.

2. **Clone the Repository:**  
   ```bash
   git clone https://github.com/ngvanloi/books_apis.git
   cd books_apis
   ```

3. **Run the Application:**  
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API:**  
   The API will be available at `http://localhost:8080`.

---

## Testing

This project includes comprehensive tests to ensure the functionality of the API.  

To run the tests, execute:  
```bash
mvn test
```

### Example Tests

- **Create a Book:**  
  Verifies that a new book can be created successfully with `HTTP 201`.

- **Update a Book:**  
  Ensures an existing book can be updated with `HTTP 200`.

- **Retrieve Non-existent Book:**  
  Checks that `HTTP 404` is returned when retrieving a non-existent book.

- **Delete Book:**  
  Verifies that deleting an existing book or a non-existent book always returns `HTTP 204`.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---