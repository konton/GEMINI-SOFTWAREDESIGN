
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
