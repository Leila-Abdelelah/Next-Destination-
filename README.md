# Next-Destination-

Next Destination is a simple recommender for travel destinations that helps users find their ideal travel spots based on their preferences. Users can input different details like their budget, preferred weather, and favorite activities, and the app will suggest suitable destinations. The app will provide recommendations using a predefined list of destinations. 


# 1. GIT 

For this project, I used Git for version control, which helped me track changes and manage different tasks. I worked with branching to isolate tasks and merging to bring everything together. I also experimented with Git’s "time travel" commands like git reset to revisit earlier states of the project.   

https://github.com/Leila-Abdelelah/Next-Destination-/branches


# 2. UML Diagrams 

I created four diagrams to visualize the system: a Use-Case Diagram to show user interactions, a Class Diagram to outline the structure of the code, an Activity Diagram to break down the flow of processes and a Component diagram. These diagrams helped me understand the big picture and refine the design.

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/UML-final


# 3. Requirements 

I wrote down detailed requirements for the project and managed them in tools like Notion and Jira. These requirements are linked to project goals like user preferences, budget filters, and weather conditions.  

Jira: https://github.com/Leila-Abdelelah/Next-Destination-/blob/main/Requirements/Screenshot%202024-12-09%20at%2015.33.53.png

Notion: https://www.notion.so/13cd1816b542813f8395eac6657ce70b?v=3ac8bce2b72f4aeb9d35f1c72e57fc37&pvs=4


# 4. Analysis 

I made a checklist of key points from the analysis phase and applied them to evaluate my project. The analysis report covers areas like scalability, performance, and user satisfaction. It also includes some prompts I used to get ideas for improving my project.   

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/Analysis


# 5. Domain-Driven Design (DDD) 

I worked on identifying different domains using Event Storming and mapped them into a Core Domain Chart. The relationships between these domains are visualized in a diagram, showing how the parts of the system connect and interact.   

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/DDD-final


# 6. Metrics

I used Checkstyle to check the style and structure of my code. Checkstyle follows the Google Java Style Guide, and it helped me find areas where my code could be improved. For example, it flagged missing Javadoc comments, lines that were too long, and small issues like trailing spaces or parameters that had the same name as class variables. These kinds of problems can make code harder to read or maintain.
I used the Checkstyle Extension in VS Code so I could run the checks directly while working on my project. 

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/Metrics


# 7. Clean Code Development 

I applied clean code practices like meaningful variable names, small and focused functions, and avoiding duplication. A cheat sheet summarizing these principles is also included. 

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/CleanCodeDevelopment-final


# 8. Refactoring

I focused on improving the clarity and structure of my code to make it easier to read, maintain, and extend. One of the main changes was breaking down complex methods into smaller, more focused helper methods. For example, a method that handled multiple tasks was split into separate methods, each with a clear purpose. This made the code more organized and allowed for better reusability and easier testing of individual components.
Another improvement was reducing hard-coded values by moving them to constants. This change made the code more consistent and easier to update since all modifications could be made in one central place.

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/Refactoring


# 9. Build Management 

I used Gradle to manage the build process for this project. It automates tasks like compiling code, running tests, and generating documentation, making the development process more efficient.
Running ./gradlew build compiles the code and ensures it’s ready to run. Tests are integrated directly into the build process with ./gradlew test. This helps catch issues early. Gradle also makes it easy to create Javadocs with ./gradlew javadoc, so I can generate clear and useful documentation for the code.
Key Files:
The main Gradle build setup is in build.gradle.kts: https://github.com/Leila-Abdelelah/Next-Destination-/blob/main/app/build.gradle.kts, and I used the Gradle Wrapper files (gradlew: https://github.com/Leila-Abdelelah/Next-Destination-/blob/main/gradlew, gradlew.bat: https://github.com/Leila-Abdelelah/Next-Destination-/blob/main/gradlew.bat) to ensure compatibility across environments.


# 10. Continuous Delivery

I set up a CI/CD pipeline using GitHub Actions to automate important tasks like building the project, running tests, and generating documentation. Every time I push code or create a pull request, these tasks run automatically to make sure everything works correctly.
The pipeline automatically runs ./gradlew build to compile the code, ensures all the unit tests pass with ./gradlew test and creates documentation using ./gradlew javadoc. The pipeline is triggered on every push to the main branch. If something fails (like a test), the pipeline will stop, so I know immediately if there’s an issue.

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/.github/workflows


# 11. Unit Tests

I wrote unit tests to make sure the core functionality of the project works as expected. These tests are written using JUnit 5 and are automatically run during the build process. This way, I can quickly spot any bugs or problems.
I added tests for the Destination class. For example, the toString method is checked to ensure it formats information correctly, and all the getter methods (like getCity() or getWeather()) are tested to return the right values.
The tests are included in the GitHub Actions pipeline. If any test fails, the pipeline stops, so I know something needs fixing.

https://github.com/Leila-Abdelelah/Next-Destination-/blob/main/src/test/DestinationTest.java


# 12. IDE

I focused on improving my workflow by getting fluent with Visual Studio Code, which is the IDE I use for my project. I explored its features, extensions, and shortcuts to make coding more efficient. My favorite shortcuts include Ctrl + P (quickly opening files), Ctrl + / (commenting/uncommenting lines), and Alt + Shift + Down (duplicating a line or block of code). These shortcuts saved me a lot of time during development and made navigating the project much smoother.
I also set up useful extensions like Prettier for code formatting.


# 13. AI coding

I set up an AI-assisted coding environment using Cursor. The setup was simple once I generated an OpenAI API key and configured it in the tool. I started by experimenting with basic functions, like generating a function to reverse a string. Cursor not only provided the function but also generated a test case in the main method, which made testing quick and seamless.
As I refined my requirements, the AI iteratively improved the code, such as adding a letter-counting feature and later modifying it to calculate the total number of letters. I found Cursor particularly helpful for integrating new logic into existing classes and debugging. There were initial challenges, like figuring out how to input the API key and phrasing prompts clearly. This task showed me how AI tools can speed up development and make coding more efficient.

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/AI-Coding


# 14. Functional Programming

I explored key concepts using Clojure to better understand functional programming principles. One of the most interesting aspects was working with final data structures, which can’t be accidentally changed. Any updates create a new version instead. This made my code more reliable because I didn’t have to worry about unintended side effects when modifying data.
I also practiced creating side-effect-free functions that simply take inputs and return outputs without altering any external state. Higher-order functions were great for tasks like filtering destinations based on weather or sorting them by budget. Using closures and anonymous functions helped me write quick, reusable logic for small tasks, such as applying budget filters dynamically. This showed me how functional programming can simplify code while making it more predictable and easier to debug.

https://github.com/Leila-Abdelelah/Next-Destination-/tree/main/FunctionalProgramming


# 15. AI coding

This task was united with Task #13.



