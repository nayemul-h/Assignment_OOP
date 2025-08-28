Q1
---------
Consider a BankAccount class that stores account number, holder name, and balance. You then introduce two specific types of accounts: SavingsAccount and CheckingAccount.
→
The base class should have a method deposit(double amount) and withdraw(double amount).
→
Overload the withdraw method so that one version allows normal withdrawals, but another version allows withdrawal with a transaction fee.
→
Override the withdraw method in SavingsAccount to prevent withdrawals if balance goes below a minimum limit, and override it in CheckingAccount to allow overdraft up to a certain limit.
Test your program by creating multiple accounts and performing deposits and withdrawals to see how overloading and overriding behave differently.

[Q2]
------------
You are building a system for a college to track students and their activities. Start with a Student class containing roll number, name, and department. From this class, derive two subclasses: UndergraduateStudent and GraduateStudent.
→
In the base class, write a method calculateGrade(int marks) which simply converts marks into grade (A, B, C, etc.).
→
Overload the calculateGrade method to accept an array of marks and return an average grade.
→
Override the method in GraduateStudent so that the grade calculation is stricter (e.g., fewer marks required for failing).
→
Add another method participate() in Student which prints “Student participates in general activities.” Override it in both UndergraduateStudent and GraduateStudent so that undergraduates participate in clubs, while graduates participate in research seminars.
Finally, in the main method, create both undergraduate and graduate objects, test overloaded versions of calculateGrade, and observe how overriding changes behavior for participate