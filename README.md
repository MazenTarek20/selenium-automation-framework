# Selenium WebDriver Test Automation Framework

A production-ready test automation framework built with **Java** and **Selenium WebDriver 4**, 
covering a wide range of browser automation scenarios using best practices in test design and structure.

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| Selenium WebDriver 4 | Browser automation engine |
| TestNG | Test execution and assertions |
| REST Assured | API-level link/image validation |
| Apache Commons IO | Screenshot file handling |
| Maven | Dependency and build management |
| GeckoDriver (Firefox) | Browser driver |

---

## 📁 Project Structure

```
selenium-automation-framework/
├── Selenium/
│   └── test/java/
│       ├── BrowserActions.java       # Window management & navigation
│       ├── ElementActions.java       # Element interactions & locators
│       ├── SeleniumsActions.java     # Advanced action chains
│       ├── Alerts.java               # Alert & dialog handling
│       ├── Frames.java               # iFrame navigation
│       ├── Windows.java              # Multi-window/tab management
│       ├── CheckAndRadio.java        # Checkbox & radio button handling
│       ├── DropDown.java             # Dropdown selection strategies
│       ├── DynamicLocator.java       # Dynamic XPath element location
│       ├── ScreenShots.java          # Screenshot capture utilities
│       ├── RestAssured.java          # Broken link & image validation
│       ├── BrowserOptions.java       # Headless & browser configuration
│       ├── JS.java                   # JavaScriptExecutor interactions
│       └── Waits.java                # Implicit, explicit & fluent waits
├── pom.xml
└── README.md
```

---

## ✨ Key Features

### Browser & Navigation Control
- Window maximization, resizing, positioning, and full-screen mode
- Forward, backward, and refresh navigation
- Retrieving page URL, title, and page source

### Element Interactions
- Multi-strategy locators: ID, CSS Selector, XPath, Name, Tag
- **Selenium 4 Relative Locators** (`above`, `below`, `near`, `toLeftOf`, `toRightOf`)
- Chained locators using `ByAll` and `ByChained`

### Advanced Action Chains
- Hover, drag-and-drop, double-click, right-click
- Click-and-hold, keyboard key press and key combinations
- Full `Actions` class implementation

### Synchronization & Waits
- Implicit waits
- Explicit waits with `WebDriverWait` and `ExpectedConditions`
- Fluent waits with custom polling intervals

### UI Component Handling
- JavaScript Alerts: accept, dismiss, prompt input
- iFrame switching and nested frame traversal
- Multi-window and multi-tab management
- Dropdowns via Selenium's `Select` class (by value, text, index)
- Checkbox and radio button interactions

### Screenshot Capture
- Full-page and element-level screenshots
- Screenshot saving using Apache Commons IO

### API-Level Validation (REST Assured)
- Broken link detection by HTTP status code
- Image source validation across pages

### Browser Configuration
- Headless browser execution
- Custom browser arguments and options via `FirefoxOptions`

---

## 🧠 What This Framework Demonstrates

- Clean separation of concerns across test modules
- Practical implementation of the full **Selenium WebDriver 4** API
- Combining **UI automation** with **API testing** (REST Assured) in a single framework
- Scalable structure suitable as a foundation for **Page Object Model (POM)** or larger test suites

---

## 📌 Notes

- Primary test site: [The Internet Herokuapp](https://the-internet.herokuapp.com) — a standard platform for Selenium practice scenarios
- Screenshots are saved to the `test/resources/` directory
- Selenium Manager handles driver binary management automatically (no manual driver setup required)
