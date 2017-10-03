# Warsztaty_Spring_MVC_REST

This is a Java 1.8 book cataloging app created in the REST architecture, consisting of server and client (in the future). It was created as a workshop assignment during my coding course.
This app provides all main functions needed to manage a book catalogue including all books display, book adding (in progress), editing , deleting as well as listing of book details. 
In its initial state it is controlled by http address in your browser. Up to now front end was developped for placing forms regarding book add and edit functions only. It is intended to enhance front end with html and JaVaScript views using JSON and AJAX.   

## Setup

Clone this repo to your IDE. 

## Starting the application

Right-click the project repository in your IDE, choose `Run as --> Maven Build... --> Main` type `clean install` in Goals: (for Eclipse).
To enter particular pages of the server type in your browser 
`[your server address]/Warsztaty_Spring_MVC_REST/books/`  
and
   - `bookList` - for list of books,
   - `{id}` - to view details of the selected book,
   - `addBook` - to add a new book,
   - `editBook/{id}` - to edit a book with the selected id,
   - `delBook/{title}`  - to delete a book with the selected title.

## Built With

* [Maven](https://maven.apache.org/)

## License

To be completed.
