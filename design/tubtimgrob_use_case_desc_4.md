
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

