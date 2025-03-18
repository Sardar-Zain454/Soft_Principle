# Achieving Code Reusability Through Pure-Fabricated Pattern

## With Principle Package Description

In this project, I create a simple fabricated class that is **not related** to domain-specific classes. The fabricated class will take the salary data of **Employees**, **Clerks**, and **Managers** in the form of an array object. This class will then sort the data and search it if required. 

Instead of creating separate functionalities for each role in their respective domain classes, a single class is used to handle the sorting and searching operations. This leads to:
- **Code Reusability**
- **Simplified Search and Sorting Process**
- **Reduced Amount of Code**

By centralizing the sorting and searching logic, we avoid the need to repeat similar functionalities across different domain classes.

## Without Principle Package Description

Without using the principle of the pure-fabricated pattern, we would have separate classes for each role (Employee, Clerk, Manager). Each class would have its own methods for sorting and searching, resulting in:

- **Code Duplication**: The sorting and searching functionalities would be repeated across all domain classes.
- **Messy Code Base**: The codebase would become cluttered with multiple implementations of the same logic.
- **Poor Code Reusability**: Each role would implement its own methods for sorting and searching, leading to less reusability.

For example, each role (Employee, Clerk, Manager) would have its own set of methods, multiplying the total number of methods. If there are 2 methods per role, then for 3 roles, this results in 6 methods. This creates unnecessary complexity and redundancy in the codebase.

## Project Files

You can view or download the project files from the following link:

[Google Drive - Project Files](https://drive.google.com/file/d/1Xpby47DrNGpXHEP8ymVhEBopbOYD6ioV/view?usp=drive_link)
