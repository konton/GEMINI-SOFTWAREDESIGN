
# 5 Use case descriptions
![GTCS_usecase](https://github.com/ICT-Mahidol/Gemini-2021/blob/tubtimgrob/tubtimgrob/img/GTCS_usecase.JPG)

# Use case #1: Login to the system

| **Use Case Name** | Login to the system
| --- | --- |
| **ID:** | 1 |
| **Importance Level:** | High |
|**Primary Actor:** | User|
|**Stakeholders and Interests:**|User - wants to use the Gemini system|
|**Brief Description:**| This use case describes how a user login to the system as well as user authentication.|
|**Trigger:**|Users want to login to the system|
|**Type:** | External |
---
**Preconditions:**
1. The user must have an account with ID and password in the system
---
**Normal Flow of Events:**

1.  The user comes to the login page of the Gemini system.
    
2.  The user enters their username and password to log in to the system.
    
3.  The username and password of the user account is authenticated.
    
4.  The user can log in to use the system.
---
**Postconditions:**

1.  The user has successfully logged in into the system.
---

**Alternate/Exceptional Flows:**

1.  (2.1) The user forgot the username or password.
→ Send the reset username/password verification via mail.
    
2.  (3.1) The user enters incorrect username, the user account cannot be authenticated
→ The system alert to fill the Username again.
    
3.  (3.2) The user enters incorrect password, the user account cannot be authenticated
→ The system alert to fill the Password again.
4.  (4.1) The system log in error occurs
→ Send bug reports to the administrator.
---


# Use case #2: Create a science plan

| **Use Case Name** | Create a science plan
| --- | --- |
| **ID:** | 2 |
| **Importance Level:** | High |
|**Primary Actor:** | Astronomer|
|**Stakeholders and Interests:**|The astronomer - wants to create an untested science plan|
|**Brief Description:**| This use case describes how the astronomer creates a science plan.|
|**Trigger:**|Astronomer wants to create a science plan.|
|**Type:** | External |
---
**Preconditions:**
1. The astronomer has successfully logged in into the system.

---
**Normal Flow of Events:**

1.  The astronomer gathers information for making an untested science plan (Creator, Submitter, Funding, Objective, Stars system, Schedule (date, time), Telescope location, Data processing requirements (File type, File quality, Image processing)
    
2.  The astronomer creates an untested science plan.
---
**Postconditions:**

1. The untested science plan has been successfully created.
---

**Alternate/Exceptional Flows:**

1.  (1.1) The astronomer cannot created a complete untested science plan because the some information (Creator, Submitter, Funding, Objective, Stars system, Schedule (date, time), Telescope location, Data processing requirements (File type, File quality, Image processing)) are missing.
	   → The astronomer re-collect the information until the data is completely gathered.
---


# Use case #3: Operate the interactive observing (Virtual telescope)

| **Use Case Name** | Operate the interactive observing
| --- | --- |
| **ID:** | 3 |
| **Importance Level:** | High |
|**Primary Actor:** | Astronomer|
|**Stakeholders and Interests:**|The astronomer - wants to operate the interactive observing mode in virtual telescope.|
|**Brief Description:**| This use case describes how the astronomer gets to operate the interactive observing mode in a virtual telescope.|
|**Trigger:**|The astronomer wants to operate the virtual telescope and interactive observing mode|
|**Type:** | External |
---
**Preconditions:**
1.  The astronomer has successfully logged in into the system.
    
2.  The untested science plan has been successfully created.
---
**Normal Flow of Events:**

1.  The astronomer launches the virtual telescope simulator.
    
2.  The astronomer choose base facility location to be simulated (at Hawaii(JACH in Hilo) or Chile(La Serena or Cerro Tololo))
    
3.  The astronomer enters the interactive observing mode.
---
**Postconditions:**

1. The astronomer successfully operates the interactive observing mode in a visual telescope.
---

**Alternate/Exceptional Flows:**

1. (3.1) The astronomer cannot enter the interactive observing mode
    → Display Display error message and re-enter the interactive observing mode.
---

# Use case #4: Test a science plan

| **Use Case Name** | Test a science plan
| --- | --- |
| **ID:** | 4 |
| **Importance Level:** | High |
|**Primary Actor:** | Astronomer|
|**Stakeholders and Interests:**|The astronomer - wants to test a science plan for the further development|
|**Brief Description:**| This use case describes how the astronomer tests the science plan.|
|**Trigger:**|The astronomer wants to test the science plan.|
|**Type:** | External |
---
**Preconditions:**
1.  The astronomer has successfully logged in into the system.
    
2.  The untested science plan has been successfully created.
    
3.  The astronomers successfully operate the interactive observing mode in a virtual telescope.
---
**Normal Flow of Events:**

1.  The astronomer chooses which science plan to test.
    
2.  The astronomer operate the interactive observing (Visual telescope)
    
3.  The astronomer enters observing commands into the simulator.
    
4.  The astronomer tests a science plan via the virtual telescope and interactive observing mode.
    
5.  The astronomer gets notification of successful science plan testing.
---
**Postconditions:**

1. The astronomer got the science plan that is tested.
---

**Alternate/Exceptional Flows:**

1.  (2.1) The telescope has an issue during interactive observing mode
    → Display the error and re-operate the interactive observing

2.  (3.1) The astronomer enters the wrong observing commands into the simulator.
    → Re-enter observing commands.

3.  (4.1) There is an error occurs during the testing, the testing needs to be resetted.
    → Display the error message, then find and fix the error, then retest a science plan via the virtual telescope.

4.  (4.2) The science plan does not pass the testing.
    → Display failed testing results, then find and fix the plan, and ask the astronomer to retry testing a science plan via the virtual telescope.
---


# Use case #5: Submit a science plan

| **Use Case Name** | Submit a science plan
| --- | --- |
| **ID:** | 5 |
| **Importance Level:** | High |
|**Primary Actor:** | Astronomer|
|**Stakeholders and Interests:**| **The astronomer** - wants to send a science plan for continuing the further development. **The science observer** - provides a service that enables the astronomer to create their observation program. |
|**Brief Description:**| This use case describes how the astronomer submitted the tested science plan.|
|**Trigger:**|The astronomer wants submit a science plan|
|**Type:** | External |
---
**Preconditions:**
1.  The astronomer has successfully logged in into the system.
    
2.  The astronomer got the science plan that is tested. (The science plan has passed the testing phase)
 ---
**Normal Flow of Events:**

1.  The astronomer chooses which science plan to submit.
    
2.  The astronomer submitted the science plan to the systems.
    
3.  The Gemini system notify the science observer to validate the science plan
---
**Postconditions:**

1. The science plan is submitted in the systems.
---

**Alternate/Exceptional Flows:**

1.  (2.1) The systems do not respond to the user or have problems while they are submitting the plan.
    → Display the error message and ask the astronomer to retry submitting again or exit to the login page.
---
