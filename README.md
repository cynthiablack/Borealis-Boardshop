## CHANGE LOG
Task C:
- Changes to mainscreen.html:
  - Line 10: connect demo.css
  - Line 15: add shop name to page title
  - Line 20: add shop name to UI
  - add classes for styling (multiple lines)
- Changes to demo.css:
  - Create CSS styles

Task D:
- Add about.html
- Changes to about.html:
  - Line 5: connect demo.css
  - Lines 6-7: connect bootstrap.css
  - Line 10: add page name to page title
  - Line 13: create div for styling
  - Line 14: add page title to UI
  - Line 15: add about text to UI
  - Line 16: add home link button to UI
- Changes to demo.css:
  - Lines 22-25: add spacing to about.html page
  - Lines 46-48: add centered-button styling to center home link button
  - Lines 59-62: font-size formatting for about.html paragraph text
- Changes to mainscreen.html:
  - Line 21: add about link button to UI & connect to mapping via Thymeleaf
- Changes to MainScreenController.java:
  - Lines 49-52: add @GetMapping to return about.html

Task E:
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
  
Task F:
- Add buyproduct.html
- Add failedpurchase.html
- Changes to mainscreen.html:
  - Line 93: add Buy Now button to UI
- Changes to AddProductController.java
  - Line 20: import Optional utility
  - Line 30-31: inject ProductRepository
  - Lines 170-189: add @GetMapping to make Buy Now button functional

Task G:
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

Task H:
- Changes to Part.java:
  - Lines 98-103: add methods to check whether inventory is above minimums and below maximum
- Changes to AddInhousePartController.java:
  - Lines 44-53: add booleans to check whether inventory is above minimums and below maximum
- Changes to AddOutsourcedPartController.java:
  - Lines 45-54: add booleans to check whether inventory is above minimums and below maximum
  
Task I:
- Changes to PartTest.java:
  - Lines 104-118: add test to check below min and at min inventory validation
  - Lines 120-134: add test to check above max and at max inventory validation
  - Lines 136-146: add test to check between min & max inventory validation

Task L:
- General code improvements:
  - Remove excess spacing and unused code
  - Used the Refactor command to rename MainScreenControllerr to MainScreenController
- Change to application.properties:
  - Line 14: enable JMX