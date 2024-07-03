**ShopVendor**: 
The ShopVendor package contains the VendorCustomer class, which simulates a simple shop transaction where a customer purchases items, pays the vendor, and receives the correct change in the minimum number of notes and coins using a method which will be called.
**Features**
Accepts input for item names and prices.
Calculates the total amount for the items.
Handles customer payment and computes the change.
Provides the minimum number of notes and coins for the change.
**Steps to execute the code:**
1.	The program prompts the user to enter the names and prices of 5 items.
2.	It calculates the total amount for the items.
3.	The user is then prompted to enter the amount given to the vendor.
4.	If the given amount is less than the total amount, the program requests the user to provide the remaining amount.
5.	The program calculates the change to be returned to the customer.
6.	The changeToBeGiven method calculates and prints the minimum number of notes and coins required to make up the change.
**Notes**:
•	The program ensures that the item price is greater than 0.
•	The change is computed using the denominations: 5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, and 1.
