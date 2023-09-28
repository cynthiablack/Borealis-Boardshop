## CHANGE LOG
Task C - Customize User Interface:
Prompt: _Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts._
- Changes to mainscreen.html:
  - Line 10: connect demo.css
  - Line 15: add shop name to page title
  - Line 20: add shop name to UI
  - add classes for styling (multiple lines)
- Changes to demo.css:
  - Create CSS styles

Task D - Create About page:
Prompt: _Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen._
- Add about.html
- Changes to demo.css:
  - Lines 22-25: add spacing to about.html page
  - Lines 46-48: add centered-button styling to center home link button
  - Lines 59-62: font-size formatting for about.html paragraph text
- Changes to mainscreen.html:
  - Line 21: add about link button to UI & connect to mapping via Thymeleaf
- Changes to MainScreenController.java:
  - Lines 49-52: add @GetMapping to return about.html

Task E - Add sample inventory:
Prompt: _Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database._
- Changes to BootStrapData.java
  - Line 36: add if statement to check whether part repository is populated & add inventory if no data currently exists
  - Line 37: move OutsourcedPart thePart = null; to beginning of outsourced part inventory
  - Lines 39-117: input data for outsourced parts
  - Line 127: add if statement to check whether product repository is populated & add inventory if no data currently exists
  - Lines 128-141: input data for products
- Changes to MainScreenController.java
  - Line 5: import PartRepository
  - Line 6: import ProductRepository
  - Lines 19-22: autowire PartRepository & ProductRepository
  - Lines 29-34: condense two MainScreenController constructors into one
  
Task F - Add "Buy Now" button:
Prompt: _Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
  - The “Buy Now” button must be next to the buttons that update and delete products.
  - The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
  - Display a message that indicates the success or failure of a purchase._
- Add buyproduct.html
- Add failedpurchase.html
- Changes to mainscreen.html:
  - Line 93: add Buy Now button to UI
- Changes to AddProductController.java
  - Line 20: import Optional utility
  - Line 30-31: inject ProductRepository
  - Lines 170-189: add @GetMapping to make Buy Now button functional

Task G - Track Min & Max Inventory:
Prompt: _Modify the parts to track maximum and minimum inventory by doing the following:
  - Add additional fields to the part entity for maximum and minimum inventory.
  - Modify the sample inventory to include the maximum and minimum fields.
  - Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
  - Rename the file the persistent storage is saved to.
  - Modify the code to enforce that the inventory is between or at the minimum and maximum value._
- Renamed spring-boot-h2-db102 to spring-boot-borealisboardshop-db102
- Change to application.properties:
  - Line 6: updated spring.datasource.url name
- Changes to Part.java:
  - Lines 24-26: add minInv and maxInv ints
  - Lines 36-42: add minInv and maxInv to Part constructor
  - Lines 83-87: add getters and setters for minInv and maxInv
  - Lines 89-96: add method to check whether inventory falls between minInv and maxInv
- Changes to AddInhousePartController.java:
  - Lines 40-44: use check from Part.java to determine whether inventory falls between minInv and maxInv
- Changes to AddOutsourcedPartController.java:
  - Lines 39-43: use check from Part.java to determine whether inventory falls between minInv and maxInv
- Changes to BootStrapData.java:
  - Lines 43-44, 53-54, 63-64, 73-74, 83-84, 93-94, 103-104, 113-114: add minInv and maxInv values to all parts
- Changes to InhousePartForm.html:
  - Lines 24-28: add fields for user entry of minInv and maxInv
- Changes to OutsourcedPartForm.html:
  - Lines 25-29: add fields for user entry of minInv and maxInv
- Changes to mainscreen.html:
  - Lines 42-43: add table column headings for minimum and maximum inventory values
  - Lines 52-53: add minInv and maxInv fields to parts table

Task H - Add Validation:
Prompt: _Add validation for between or at the maximum and minimum fields. The validation must include the following:
  - Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
  - Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
  - Display error messages when adding and updating parts if the inventory is greater than the maximum._
- Changes to Part.java:
  - Lines 98-103: add methods to check whether inventory is above minimums and below maximum
- Changes to AddInhousePartController.java:
  - Lines 44-53: add booleans to check whether inventory is above minimums and below maximum
- Changes to AddOutsourcedPartController.java:
  - Lines 45-54: add booleans to check whether inventory is above minimums and below maximum
  
Task I - Add Unit Testing:
Prompt: _At least two functional unit tests are added for the maximum and minimum fields. Both unit tests are added to the PartTest class in the test package._
- Changes to PartTest.java:
  - Lines 104-118: add test to check below min and at min inventory validation
  - Lines 120-134: add test to check above max and at max inventory validation
  - Lines 136-146: add test to check between min & max inventory validation

Task J - Code Cleanup:
Prompt: _The submission removes the class files for any unused validators to clean the code._
- removed DeletePartValidator file

Task L - Professionalism:
Prompt: _ Demonstrate professional communication in the content and presentation of your submission._
- General code improvements:
  - Remove excess spacing and unused code
  - Used the Refactor command to rename MainScreenControllerr to MainScreenController
  - Enforce consistent styling across all pages
- Change to application.properties:
  - Line 14: enable JMX