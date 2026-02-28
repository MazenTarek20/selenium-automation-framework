# Selenium WebDriver Test Automation Framework

A comprehensive Selenium WebDriver test automation framework built with Java, demonstrating various browser automation techniques and best practices.

# 📋 Table of Contents

    Overview
    Features
    Technologies Used
    Project Structure
    Prerequisites
    Installation
    Running Tests
    Test Categories
    Contributing

# 🎯 Overview

This project is a test automation framework developed during a test automation course. It demonstrates practical implementations of Selenium WebDriver with various web elements, interactions, and automation scenarios using TestNG as the testing framework.

# ✨ Features

    **Browser Management:** Window sizing, positioning, maximizing, and full-screen operations
    **Navigation:** Forward, backward, refresh, and URL navigation
    **Element Interactions:** Click, type, clear, hover, drag-and-drop, double-click, right-click
    **Advanced Actions:** Keyboard actions, context clicks, and action chains
    **Alert Handling:** Accept, dismiss, and interact with JavaScript alerts
    **Frame Handling:** Switching between nested frames and iframes
    **Dropdown Management:** Select options from dropdown menus
    **Window Handling:** Managing multiple browser windows and tabs
    **Screenshot Capture:** Full page and element-level screenshots
    **Dynamic Locators:** XPath-based dynamic element location
    **Relative Locators:** Using Selenium 4 relative locator strategies
    **JavaScript Execution:** JavaScriptExecutor for advanced interactions
    **API Testing:** REST Assured integration for broken link/image checking
    **Browser Options:** Headless mode and browser configuration

# 🛠️ Technologies Used

    **Java:** Programming language
    **Selenium WebDriver 4:** Browser automation
    **TestNG:** Testing framework
    **Firefox WebDriver:** Browser driver (GeckoDriver)
    **REST Assured:** API testing for link validation
    **Apache Commons IO:** File operations for screenshots
    **Maven:** Dependency management

# 📁 Project Structure

selenium-automation-framework/

├── test/

│   ├── java/

│   │   ├── BrowserActions.java       # Browser window management

│   │   ├── ElementActions.java       # Element interactions

│   │   ├── SeleniumsActions.java     # Advanced Selenium actions

│   │   ├── Alerts.java               # Alert handling

│   │   ├── Frames.java               # Frame switching

│   │   ├── Windows.java              # Window management

│   │   ├── CheckAndRadio.java        # Checkbox and radio buttons

│   │   ├── DropDown.java             # Dropdown selections

│   │   ├── DynamicLocator.java       # Dynamic element location

│   │   ├── ScreenShots.java          # Screenshot functionality

│   │   ├── RestAssured.java          # API testing for links

│   │   ├── BrowserOptions.java       # Browser configuration

│   │   ├── JS.java                   # JavaScript execution

│   │   └── Waits.java                # Wait strategies

│   └── resources/

│       └── test.txt                  # Test resources

├── README.md

├── .gitignore

└── pom.xml 


# 📋 Prerequisites

Before running this project, ensure you have:
    Java Development Kit (JDK) 11 or higher
    Maven 3.6+ (for dependency management)
    Firefox browser installed
    GeckoDriver (Firefox WebDriver) - should be managed by Selenium Manager
    IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

# 🚀 Installation

    Clone the repository
bash
   git clone https://github.com/yourusername/selenium-automation-framework.git
   cd selenium-automation-framework
    Set up Maven dependencies (create a pom.xml file with required dependencies)
bash
   mvn clean install
    Configure your IDE
        Import the project as a Maven project
        Ensure JDK is properly configured
        Install TestNG plugin for your IDE

# ▶️ Running Tests

Run all tests
bash
mvn test
Run specific test class
bash
mvn test -Dtest=BrowserActions
Run from IDE
    Right-click on any test class
    Select "Run as TestNG Test"

# 🧪 Test Categories

Browser Actions (BrowserActions.java)

    Window maximization and full-screen mode
    Window positioning and sizing
    Browser navigation (back, forward, refresh)
    Getting current URL, title, and page source

Element Actions (ElementActions.java)

    Locating elements using various strategies (ID, CSS, XPath)
    Relative locators (Selenium 4 feature)
    Typing, clicking, and clearing elements
    Chained locators with ByAll and ByChained

Advanced Selenium Actions (SeleniumsActions.java)

    Hover actions
    Drag and drop
    Double-click and right-click
    Click and hold
    Keyboard actions (key press, key combinations)

Alert Handling (Alerts.java)

    Accepting and dismissing alerts
    Sending text to prompt alerts
    Reading alert text

Frame Management (Frames.java)

    Switching between nested frames
    Navigating frame hierarchies
    Returning to default content

Dropdown Handling (DropDown.java)

    Selecting options by value, text, or index
    Working with Select class

Screenshot Capture (ScreenShots.java)

    Full-page screenshots
    Element-specific screenshots
    Saving screenshots to files

API Testing (RestAssured.java)

    Checking broken links
    Validating image sources
    HTTP status code verification

Browser Configuration (BrowserOptions.java)

    Headless browser execution
    Browser version specification
    Custom browser arguments

# 📝 Notes

    This project uses the-internet.herokuapp.com as a test site for various automation scenarios
    Some tests may need URL updates or adjustments based on website changes
    Screenshots are saved to test/resources/ directory
    Tests are designed for learning purposes and demonstrate various Selenium capabilities

# 📄 License
This project is available for educational purposes.

# 🙏 Acknowledgments
    Test automation course materials : Mastering Selenium With Java: أتوميشن من الصفر الى الاحتراف
    Selenium WebDriver documentation
    The-Internet Herokuapp for providing test scenarios

Happy Testing! 🚀
