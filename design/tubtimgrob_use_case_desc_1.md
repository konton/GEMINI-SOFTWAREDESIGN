
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

