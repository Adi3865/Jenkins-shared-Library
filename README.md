# Jenkins Shared Library
- Shared libraries in Jenkins Pipelines are reusable pieces of code that can be organized into functions and classes.
- These libraries allow you to encapsulate common logic, making it easier to maintain and share across multiple pipelines and projects.
- Shared library must be inside the **vars** directory in your github repository
- Shared library uses **groovy** syntax and file name ends with **.groovy** extension. 

#
## How to create and use shared library in Jenkins.

### How to create Shared library
- Login to your Jenkins dashboard. <a href="">Jenkins Installation</a>
- Go to **Manage Jenkins** --> **System** and search for **Global Trusted Pipeline Libraries**.

<img width="801" height="289" alt="image" src="https://github.com/user-attachments/assets/0120a846-8291-4968-8a4c-b2bf588453a0" />


  **Name:** Shared <br>
  **Default version:** \<branch name><br>
  **Project repository:** https://github.com/Adi3865/Jenkins-shared-Library.git  <br>
****

<img width="1236" height="561" alt="image" src="https://github.com/user-attachments/assets/f236e654-19cf-48e1-9dce-3297702cbf88" />


#
### How to use it in Jenkins pipeline
- Go to your declarative pipeline
- Add **@Library('Shared') _** at the very first line of your jenkins pipeline.

<img width="1236" height="561" alt="image" src="https://github.com/user-attachments/assets/275d93bb-bb6e-407e-9c14-28ff56d27565" />


**Note:** @Library() _ is the syntax to use shared library.
