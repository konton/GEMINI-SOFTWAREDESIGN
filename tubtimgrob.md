## Team Members

 - Chotikarn Chalermjirarat 6288009
 - Pranungfun Prapaenee 6288034
 - Parin Sewamontree 6288042
 - Non Somboonsakdikul 6288044
 - Konton Hongthong 6288078
 - Krittitee Nildam 6288099
 ---
 
 # Functional Requirements / Non-Functional Requirements

**1995 - gemini_srs**
# CHAPTER 2 -General Description


**2.3 Access Modes**
| Functional Requirements | Non-functional Requirements |
|--|--|
| The system must have an **Observing access mode** as a normal mode for collecting the science data, selection of instrument parameters, and quick-look data reduction. |**Monitoring access mode** should not affect the performance of an ongoing observation.|
|The system must have a **Monitoring access mode** for read-only case of the observing mode that can be invoked  | **Testing access mode** should not affect the performance of an ongoing observation. |
| The system must have **Operation access mode** for direct control of the telescope and instruments | **Administrative access mode** should not affect the performance of an ongoing observation.|
|The system must have **Planning access mode** which cannot have an actual access to the telescope. |    
|The system must have a telescope simulator for planning observations in the **Planning access mode**.| 

**2.5 User-level requirements**

**2.5.8 User Needs**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The accessibility of the system must be based-on the User class according to the SRS User-level requirements. |The user interface of **the Astronomer** and **Science Observer Telescope Operator**  **class** should be simple, safe, controls grouped for convenience of observation activity, easy-to-control, and fast response to unsafe conditions. |
The system should have the ability to monitor all subsystems as needed and must also allow full access to all subsystems.||

**2.5.9.1 Astronomers and observers**

| Functional Requirements | Non-functional Requirements |
|--|--|
The system must have a user interface that will fulfill the operational requirements in the different modes and status information.| The system must have a user interface that is simple to learn and secure to use.
The system must submit the observing commands via user interface for later execution.|The Observing astronomers shall have no privileges as far as the direct control of the telescope is concerned.
The system must be able to break and resequence the observing commands queue.| The existence of the scheduling queue shall be transparent to the on-site observer during the initial phases of telescope operation.
The system must allow operation staff to enable direct interactive operation.|

**2.5.9.2 Operation Staff**

| Functional Requirements | Non-functional Requirements |
|--|--|
| Operations staff will control the Gemini 8m Telescopes indirectly via a scheduler program or directly via commands |  |
The system must allow the operations staff to access to operation tables in update mode, and to change the operational status of units.|
The system must allow the observing astronomers to access to operation tables in read mode.|
The system must allow Software development and maintenance staff to modify everything in the system.|

**2.6 Operational context**

**2.6.4 Multi-user context**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The system must allow the independent users of the telescope site to access any part of the whole setup with a simple login and configuration operation.| Several user stations may be working at the same time with the Gemini 8m Telescopes software.
Other users need to go through the procedures set up by Operation and get permission before monitoring the Gemini 8m telescope.| Multi-point monitoring also allows a local observer to be monitored and advised by a remote supervisor.|
||Monitoring shall not affect the performance of ongoing observations

**2.7 Observing mode requirements**

**2.7.1 Interactive observing**

| Functional Requirements | Non-functional Requirements |
|--|--|
||  The system must support interactive operation through the observatory control system.
|| Interaction will normally be via an automatic sequencer.

**2.7.2 Queue-based**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The observing program must be fully automated, requiring very little human interaction during the observation.| The system must have software to support the flexible scheduling, both manually and via a scheduler
The systems should be a full telescope simulator to enable the astronomer to test observing pro- grams for completeness, errors, and functionality.| The available observing time should be maximized by queuing all of the observing that is possible with the currently available instruments.
All control software must provide support for simulated use within the virtual telescope.|
|The software requirement assists in object selection both within an observing program and across observing programs to optimize observing efficiency.

**2.7.3 Remote operations**

| Functional Requirements | Non-functional Requirements |
|--|--|
||All software should be developed to permit remote operations.
||All observing facilities should work both on-site and off-site.
||Team observing, with multiple observers at different sites should be supported.
||The operations must be restricted to specific remote sites.

**2.7.4 Service**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The system must allow communication, instructions, and comments from the astronomer.|The observing program must be automated, requiring little human interaction during the observation.
|This programming environment should be available both to the astronomer, and to the observer.|Service observing requires switching during the night among telescope modes and instruments.

**2.8 Observing Support**

**2.8.2 Flexible Scheduling**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Flexible scheduling requires the possibility to change telescope scheduling quickly, exchanging observing programs.

**2.9 General software requirements**

**2.9.1 Control information flow**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The syntax of control flow commands is to be consistent across the system, whether accessing workstation software or IOC software.
||All subsystems must respond to a common set of commands to test operational status, inquiries as to version, perform self-tests, etc.
||The support structure for communicating commands must be reliable, with a uniform ACK/NAK protocol adopted across all systems. Timeouts must be supported at approximately 500 msec.
||Handshaking of commands between IOCs must occur within 100-200 msec, signaling acceptance of each command.
||For commands allowing delayed replies, timeouts for that reply must also be supported.
||Peak control information within the system is expected to be 100 TPS.

**2.9.2 Astronomical data flow**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Data from detectors must be stored in the most effective method permitted by available technology.

**2.9.3 Video information flow**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The system must allow for fast transmission of rough images every 0.5 sec. This may be assisted through the use of data-loss compression techniques.
||There is the need for transmission of images matching the original resolution. This high-quality transmission must require less than 20 sec, and can only be assisted with loss-less compression.
||The allocation system must ensure that the system cannot remain deadlocked with respect to this resource allocation.

**2.10 Operation Privileges, Protections, and Procedures**

| Functional Requirements | Non-functional Requirements |
|--|--|
Protection against accidental interference is to be implemented using an Access Mode Allocation system that dynamically identifies and assigns resources as needed.|Procedures must be implemented for convenience and system integrity, to simplify and codify common tasks.

**2.11 General performance and reliability requirements**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The Gemini software should have no hard restrictions on the number of simultaneous users, but should allow for policy decisions that do restrict the amount of simultaneous access.
||Every command must be accepted/rejected within 2 sec and before the corresponding action occurs.
||Status display update must be within 4 sec at the local stations.
||Requests of subsystems for status information must be answered within 5 sec and be possible in maintenance level operation.
||Requirements for response times within the user interfaces are given in the User Interface requirements section.
||All software bugs should be logged and then fixed as soon as possible after detection.

**2.12 Test and Checkout Requirements**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The system, Gemini 8m Telescopes control software, shall also provide for execution of self-test sequences of the Gemini 8m Telescopes system and subsystems.|The telescope and instrument software shall contain built-in test (BIT) facilities to verify Gemini 8m Telescopes system and Gemini 8m Telescopes software performances.

**2.13 Contingencies**

**2.13.1 Fault notification**

| Functional Requirements | Non-functional Requirements |
|--|--|
|Subsystems must notify the user when faults occur.|
|The notification must also be capable of being electronically logged.

**2.13.2 Fault tolerance**

| Functional Requirements | Non-functional Requirements |
|--|--|
||In the case of IOC failure, no transfer of control to another IOC will be possible, due to the local connections and interfaces to the control electronics.

**2.13.3 Redundancy**

| Functional Requirements | Non-functional Requirements |
|--|--|
Full redundancy is not a requirement of the Gemini 8m Telescopes and it will be acceptable to have to replace units in case of failure.|Full redundancy is not a requirement of the Gemini 8m Telescopes and it will be acceptable to have to replace units in case of failure.

**2.14 Constraints**

**2.14.1 User constraints**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The user interfaces should clearly reflect access modes and operating levels.

**2.14.3 Software constraints**

| Functional Requirements | Non-functional Requirements |
|--|--|
|Gemini software developers should maintain accurate change logs showing software modifications as they are applied to the system software.|All Gemini software is to be developed using standard methodologies and development environments.
||Gemini software should be developed in evolutionary fashion, using the CVS version control system
||All Gemini subsystem packages must provide modules for the testing and diagnosis of the subsystem
||All instrumentation control software must provide full access to all instrument functionality.

**1995 - gemini_srs**
# CHAPTER 3 -General Requirements

**3.1 Data Specifications**

**3.1.1 Control Information Flow**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Gemini subsystems should be as self-contained and autonomous as possible.
|| Control information must be transferred, typically in the form of commands and replies from users, to telescopes and instruments. 
||No request for information shall produce a delay of control activities or locking, even if the corresponding equipment is not available or faulty.
||Delay times for the exchange of control information must stay within precise time limits.

**3.1.2 Astronomical Data Flow**

**3.1.2.1 Data Flow**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Detector data must be acquired and stored in the most effective way technology will allow.
||Intermediate storage of raw data in memory on different nodes and in different formats should be kept to a minimum.
||The raw data in memory must be at least two copies - one to secure data as acquired and one to do assessment of data quality on-line.

**3.1.2.2 Format of Data Acquisition**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The raw data will be acquired and stored as such for quick look evaluations.

**3.1.2.3 Transport Data Format**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Astronomical data will have to be transported between GEMINI and the home institutes of visiting astronomers in FITS format.

**3.2 Operation**

**3.2.1.2 Protections**

| Functional Requirements | Non-functional Requirements |
|--|--|
|Protections must also be enforced among users and the operational software.

**3.2.3 Capacity**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The system must support off-site observing modes. The system will provide for a single off-site data acquisition |The Gemini 8m Telescopes control software shall allow simultaneous operation of up to six active control nodes and up to two more monitoring nodes without appreciable degradation of performance.
||the Gemini 8m Telescopes computers and software shall be capable of coping with the load of 10 active nodes, should the case arise.

**3.2.5 Procedures**

| Functional Requirements | Non-functional Requirements |
|--|--|
|There must be automatic procedures to implement startup and shutdown of the telescope and instruments.
|The system must have Reconfiguration procedures to change the observing environment
|The system must allow Operations staff to change the environment, meaning selecting a suitable combination of instruments.

**3.3 External Interface Requirements**

**3.3.2 Hardware interfaces**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The standard software must be adequate for the real-time requirements and must offer drivers to the standard electronics.

**3.3.3 Software interfaces**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The Gemini 8m Telescopes software must cover all aspects of control and data acquisition related to the telescope, instruments, and auxiliary instrumentation.
|The Gemini 8m Telescopes software must interface to the external software and clearly the interfaces are fully part of the Gemini 8m Telescopes software.

**3.3.3.2 On-line access to catalogs and previous data**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The output format of the Gemini 8m Telescopes data must be compatible with the GEM-INI archive requirements.

**3.3.3.3 Access To Other Packages**
| Functional Requirements | Non-functional Requirements |
|--|--|
|The Gemini 8m Telescopes software must be able to interface with all commercial software packages available on the Gemini 8m Telescopes and integrated into the Gemini 8m Telescopes operation.

**3.3.4.1 LAN**
| Functional Requirements | Non-functional Requirements |
|--|--|
||Local coordination and synchronization needs within a subsystem.

**3.4 General Constraints**

**3.4.1 User constraints**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The software shall support access to the system from any user station.

**3.4.3 Software Constraints**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The system must allow Switching to different configurations at any time with appropriate procedures|Individual instruments must be able to run fully independently.
|The system must procedures to reconfigure the system when subsystems are modified or removed.|Telescope software at the two telescopes must be maintained to be identical in the upper layers.
|On-line version control must be implemented.| Modifications should be confined to the operational procedures and should not affect the bulk of the existing software.
||There must be easy procedures to reconfigure the system.
||The number of main packages of software must be kept to a minimum to facilitate maintenance, but compatible with the need to have the right degree of modularity
||Commercial and public domain packages should be used whenever possible
||Existing software packages should be reused wherever possible.
||Existing software expertise should be consulted whenever possible.
||To allow for expansion and maintenance, Gemini 8m Telescopes standards must be defined for the on-line software and the development environment.
|| At boot time, the Gemini 8m Telescopes software shall check the consistency of versions of all the various software components.
||Table-driven software should be used whenever possible, to avoid unnecessary compilations.

**3.5 Attributes**

**3.5.3 Reliability And Availability**

| Functional Requirements | Non-functional Requirements |
|--|--|
|The system has retry procedures embodied in the software in case of error or failure.|The downtime due to failures should be 15 minutes per night or 1 night per month.
|The system must be able to report in a clear form if recovery fails.|On-line pre-checking of the operational status of equipment should be done prior to sending critical or time consuming commands.
|The system must be able to put itself into a safe state, whenever a safety aspect might be involved.
|A measure of fault rates should be done during commissioning to establish baseline rates for system reliability monitoring.
|The system should be able to constantly monitor active subsystems to be sure they are operating correctly before sending commands to each subsystem.

**3.5.4.1 Maintainability Requirement**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Maintenance requirements including an estimate of required resources.
||Each subsystem should have a background task running.
||Each subsystem should provide a module for fully exercising all subsystem components.

**3.5.5 Human Engineering**

| Functional Requirements | Non-functional Requirements |
|--|--|
||All Gemini Software must be designed with human engineering requirements under consideration.

**3.5.6 Security and safety**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The Gemini Control System development effort will obey and abide by both the letter and the spirit of all applicable engineering practices, laws, regulations, and policies.

**3.5.6.2 Security and safety requirements**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The Gemini system must be self-monitoring to invoke safety monitoring to prevent risk to people or damage to equipment.
||The software should be able to quickly bring the Gemini system to a safe state upon notification of such danger.
||The software should be able to quickly bring the Gemini system to a safe state upon notification of such danger.
||A system that is operating in Engineering/Maintenance mode must ignore directives from other systems, though status information should still be provided for use by other systems.
||All systems are appropriately interlocked. This interlock must not depend on any software for reliable operation.

**3.5.8 Expandability**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Software is to be designed to be easily extended and upgraded with modifications to non-changing components.
||Its documentation must be developed with this expandability in mind.

**3.5.10 Contingencies**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The security and safety of the system should be guaranteed even in the event of failure of any component, including the higher-level software.

**3.6 Life cycle aspects**

| Functional Requirements | Non-functional Requirements |
|--|--|
||The Gemini 8m Telescopes software has to be developed according to a structured and formally defined development model.


**1995 - gemini_srs**
# CHAPTER 4 -Specific Requirements

**4.1 Attributes**

**4.1.2 Modularity**

| Functional Requirements | Non-functional Requirements |
|--|--|
||A measure of fault rates should be done during commissioning to establish baseline rates for system reliability monitoring.

**4.2.1 On-line Database**

| Functional Requirements | Non-functional Requirements |
|--|--|
|Asynchronous writes are to be supported, allowing for concurrent operation. |All telescope, instrument, and detector control information is to be available at any operation level.
|The database must support both remote access and distributed data. |Access times to the database are to be in the range of 2-3 msec per access.
||Time-access critical information is available in memory.
||There is to be a consistent and logical (i.e. name based) access method.

**4.2.2.1 Remote Operations**

| Functional Requirements | Non-functional Requirements |
|--|--|
|A fundamental criteria of Gemini telescope operation must support a full implementation of remote operations. |The video data signals must be encoded digitally and transferred via the WAN to remote sites.

**4.2.3.1 Data framework**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Astronomical data are automatically stored onto the Archive medium (external software).

**4.2.3.4 Inter-function data definitions**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Sufficient information be recorded during an observation to recreate the sequence of events that occurred during the observation.

**4.2.4.1 Normal operation**

| Functional Requirements | Non-functional Requirements |
|--|--|
||There are start-up and shut-down procedures that must exist at many different levels
||All start-ups and shut-downs are to be automatically logged with time stamps
||Engineering Logging must be possible to log engineering data at up to 200 Hz rates
||Long-term logging of engineering data must be possible at slower rates

**4.2.4.2 Operation in failure mode**

| Functional Requirements | Non-functional Requirements |
|--|--|
||All errors should be reported using a common, system-wide procedure.
||Under fatal error conditions, the system falls back to a safe "backup" state requiring human intervention for restart.
||error logging should provide enough information to trace the condition back to its apparent source.
||There should be tools available to extract error (and other) logging information
||Command retries must be included in the system for most common timeouts or no response conditions.
||The system should monitor the rate of warning messages.

**4.2.5.1.1 Software methods**

| Functional Requirements | Non-functional Requirements |
|--|--|
||All Gemini supported software is to be developed using a formally defined model.

**4.2.5.1.8 Databases**

| Functional Requirements | Non-functional Requirements |
|--|--|
||Astronomical data are stored both in the Archiving system and in the data storage sub-system.
||Configuration, logging, maintenance schedules, and subsystem documentation are to be kept in the commercial relational database. 

ITCS431 Software Design and Development (2021)