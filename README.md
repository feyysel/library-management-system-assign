# Library Management System

This is a simple **Library Management System** implemented in **Java** for academic purposes.  
The system was designed using **UML** and managed with **Git & GitHub**.

## Features

- Add, remove, and view books
- Manage authors
- Register members
- Borrow and return books
- Track loans

## Tools Used

- **ArgoUML** – UML design  
- **Java** – Implementation  
- **Git & GitHub** – Version control  
- **Visual Studio Code** – IDE  

## UML Design

The UML class diagram includes:

- `Book`, `Author`, `Member`, `Librarian`, `Loan`

Relationships:

- A Book has one or more Authors
- A Member can borrow multiple Books through Loan
- A Librarian manages adding/removing Books

UML file: `UML/LibrarySystem.zargo`

## Git & GitHub Workflow

1. Initialize repository  
2. Add `.gitignore`  
3. Commit initial UML-generated Java code  
4. Create a branch `LoanManagement`  
5. Implement `borrowBook()` and `returnBook()` methods  
6. Push branch, create Pull Request, merge into `main`

## Authors

| Name          | ID         |
|---------------|----------- |
| Feysel Awel   | DDU1601168 |
| Hayat Kedir   | RMD1254    |
| Ruth Yeneneh  | RMD211     |
| Hilina Feleke  |RMD1305    |
| Saliha Mohammed|RMD2130    |
| Weynishet Dejene|RMD2494    |

## License

This project is for academic purposes.
