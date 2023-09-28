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
  - Lines 19-24: delete empty comment lines
  - Line 36: add if statement to check whether database is populated & add inventory only if no data currently exists
  - Line 37: move OutsourcedPart thePart = null; to beginning of outsourced part inventory
  - Lines 39 - 101: input data for outsourced parts
  - Lines 110 - 123: input data for products
- Changes to MainScreenController.java
  - Line 5: import PartRepository
  - Line 6: import ProductRepository
  - Lines 19-22: autowire PartRepository & ProductRepository
  - Lines 29-34: condense two MainScreenController constructors into one
  
Task F:
- Add buyproduct.html
- Add failedpurchase.html
- Changes to mainscreen.html:
  - Line 89: add Buy Now button to UI
- Changes to AddProductController.java
  - Line 20: import Optional utility
  - Line 30-31: inject ProductRepository
  - Lines 170-189: add @GetMapping to make Buy Now button functional

Task L:
- General code improvements:
  - Remove excess spacing and unused code
- Changes to MainScreenControllerr.java:
  - Used the Refactor command to rename MainScreenControllerr to MainScreenController
- Changes to application.properties:
  - Line 14: enable JMX