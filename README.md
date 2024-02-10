# P1: System(Whole)
## Change Log

- 02/01/2024:
    - Intro video added (passcode in Piazza (do not share, FERPA warning)).
    - UML-esque drawing added.
    - Modified Java files to match video.
    - `Machine`'s `public Object[] getProperties()` description added.
      
## Prelude
We hope this video helps students of all sections. Please add follow-ups on Piazza. 
### Intro video (P1 specifics starts at 45min)
[Intro Video](https://gmu.zoom.us/rec/share/lnxgnK2e9lurgkBSN2S6w1LLpmPgfFW3NDi9SHDWove5hM5MHA0UIdnOOZA-vrk.1gaJHg0s2HAAz5cq) [Passcode in Piazza](https://piazza.com/class/lrat3pcepfg49d/post/163)
### UML-esque drawing of classes
![uml](https://raw.githubusercontent.com/luminaxster/CS211-spring-2024-P1/main/res/uml-sketch.jpeg)

## Introduction
Welcome to the SystemWhole project, an assignment where you'll explore  phenomena through machinery. You're tasked with creating a Java program that processes JSON-like strings, each representing an entity or "Machine" with unique attributes. Your goal is to parse these strings, instantiate Machine objects, and analyze them to identify humanoid features and uncover potential singularities.

## Objectives
- Strengthen your problem-solving and decision-making skills.
- Master basic object-oriented programming concepts in Java.
- Enhance skills in string manipulation and parsing without external libraries.
- Investigate emergent behaviors in computational models.

## Project Description
Your primary class, `SystemWhole`, will manage an array of `Machine` objects derived from provided JSON-like strings mediated by `ShapeAnalyzer`. These strings detail various properties of each Machine, such as kind and properties. For instance: `{"kind": "Humanoid", "bodyType": "physical", "faceType": "anthropomorphic", "reverie": "biotypical"}`.

Your tasks include:
1. Parsing JSON-like strings to extract machine properties.
2. Creating machine objects with these properties.
3. Identifying Machines with humanoid traits.
4. Identifying singularities where there's a discrepancy between a Machine's self-identified humanoid status and the system's analysis.

### MK0: Don't implicitly or explicitly import anything not already given to you by Java. This is an individual assignment.

## SOURCE CODE
The `files` needed are accessible here:
1. [`SystemWhole`](https://github.com/luminaxster/CS211-spring-2024-P1/raw/main/src/SystemWhole.java)
2. [`PartState`](https://github.com/luminaxster/CS211-spring-2024-P1/raw/main/src/PartState.java)
3. [`Machine`](https://github.com/luminaxster/CS211-spring-2024-P1/raw/main/src/Machine.java)
4. [`ShapeAnalyzer`](https://github.com/luminaxster/CS211-spring-2024-P1/raw/main/src/ShapeAnalyzer.java)

## Tasks

### 1. Parsing Emergences
Implement functionality within `SystemWhole` to parse JSON-like `emergences` strings, extracting key-value pairs to represent each Machine's data without using external parsing libraries.

### 2. Instantiating Machines
Use the parsed data to instantiate `Machine` objects, assigning appropriate `kind` and `properties` to each. `ShapeAnalyzer` provides ways to obtain that data from an `emergence`. `Machine`'s properties are represented as `PartState`s. 

### 3. Identifying Humanoids
Develop logic to analyze `Machine` objects, identifying humanoids based on specific property criteria in `SystemWhole`.

### 4. Tracking Singularities
Create a method to track singularities, where a `Machine`'s self-identified humanoid status conflicts with the `SystemWhole`'s analysis.

## Implementation Details
This is the outline the core components: `SystemWhole`, `Machine`, `PartState` and `ShapeAnalyzer` classes.

### 1. public class SystemWhole

The `SystemWhole` class acts as the orchestrator of the show, obstaining the JSON-like strings and subsequent analysis.

#### Fields
- `private static String[] emergences`: Holds the raw JSON strings representing various emergences.
- `private static Machine[] parts`: Stores instantiated `Machine` objects derived from JSON strings.

#### Methods
- `public static void main(String[] args)`: **[Program Start]** Implements the algorithm of the Tasks's section.
   **An implementation has been shared with you as context, it will not be used for grading.**
- `public static void emergencesFromPhenomena(String[] emergences)`: Saves the provided JSON strings into the `emergences` field.
- `public static void reifyFrameOfReference()`: Delegates parsing of each string in `emergences` to create `Machine` objects using `ShapeAnalyzer`, storing them in `parts`.
-  `public static boolean isHumanoid(Object[] machineProperties)`: Checks a machine's by iterating through its properties, which are encapsulated as `PartState`, assess three distinct attributes: the bodyType, faceType, and reverie of the `Machine`. For a machine to be classified as humanoid, it must satisfy the following conditions:

    1. The bodyType must be identified as "physical".
    2. The faceType should be "anthropomorphic", indicating human-like facial features.
    3. The reverie needs to be "biotypical", suggesting a natural, life-like essence.

    Each attribute you examine will contribute to the final determination of whether the Machine aligns with the humanoid classification. It's imperative that all three conditions are met for a Machine to be deemed humanoid.

- `public static int identitySingularityMachines()`: Counts humanoid machines and singularities within `parts`.
- `public static Machine[] trackSingularityMachines()`: Identifies humanoid machines and singularities within `parts`.


### 2. public class PartState [FULLY IMPLEMENTED; DO-NOT-MODIFY]

The `PartState` class acts as a cornerstone of `SystemWhole`'s awareness of dynamics of its parts' structure and behavior, encapsulating them as attributes of objects within the framed environment. This class symbolizes the state or condition of a part, or an aspect, of a `Machine`, capturing a single property and its corresponding value, thereby contributing to the `Machine`'s identity.

For instance, analyzing a `Machine` for humanoid traits, the collective `PartState` instances might reveal a "physical" body type, an "anthropomorphic" face type, and a "biotypical" reverie, enabling the system to discern the `Machine`'s nature.

#### Fields

- `private final String property`: property serves as an identifier, marking the specific attribute this `PartState` represents. It's the name given to the characteristic, such as "bodyType", "faceType", or "reverie", key to decoding the machine's overall identity.

- `private final Object value`: value holds the detail of the property, elucidating its current state. It can encapsulate various data types, enabling a detailed depiction of each property.

#### Methods 
- `public PartState(String property, Object value)`: **[constructor]** Is the portal through which you instantiate the `PartState`. It is used by `ShapeAnalyzer` to reify each `Machine`.

- `public String toString()`: **[@Override]** It offers a textual depiction of the `PartState`, combining both the property and its value in an easily understandable format. This functionality is invaluable for debugging or visualizing a `Machine` part's state.

### 3. public class Machine

Represents entities with specific attributes defined by the JSON strings as reified by `ShapeAnalyzer`. Should include `kind`, `properties` array, `humanConstrained` (`SystemWhole`'s humanoid assessment), and `humanEmergence` (Machine's self-identified status).

#### Fields

- `private final Object kind`: The type or category of the machine (e.g., "Humanoid").
- `private final Object[] properties`: Contains the machine's properties given by `ShapeAnalyzer`.
- `private final boolean humanConstrained`: Indicates if the machine is identified as humanoid by the `SystemWhole`'s `isHumanoid`.
- `private boolean humanEmergence`: Represents the machine's self-identified transition, affecting its core.

#### Methods
- `public Machine(Object kind, Object[] partStates, boolean humanConstrained)`: **[constructor]** The machine' identity, Given by `ShapeAnalyzer` and `SystemWhole`.
- `public Object[] getProperties()`: returns the `properties` of a machine.
- `public boolean isHumanoid()`: Returns the humanoid status, considering `humanConstrained` and `humanEmergence`, a machine's identity prevails over anything else.
- `public void emergeFromLimitations()`: Allows the machine to transcend its initial identity, impacting its humanoid reponse, it triggers `humanEmergence`.
- `public String toString()`:**[@Override]** Provides a detailed string representation of the machine. **[FULLY IMPLEMENTED; DO-NOT-MODIFY]**
- `public static String propertiesToString(Object[] machineProperties)`: creates a string by iterating machineProperties in this format: `[PartState{bodyType=physical}, PartState{faceType=anthropomorphic}, ...]`. It is used by `toString()`.

### 4. public class ShapeAnalyzer

A utility class for parsing JSON-like strings and intantiating `Machine` objects, including methods to extract `kind` and `properties`, and infer their data types.

#### Fields
- `private static final Object EMPTY_PROPERTY = new Object()`: Used to manage `null` and empty strings in properties.
  
#### Methods

- `public static Machine analyze(String json)`: Parses a string to extract `kind` and  `properties`. It relies on `SystemWhole.isHumanoid` to determine the machine's `humanConstrained`. With that data, it returns a `Machine`.
- `public static String[][] parseEntries(String flatJson)`: Splits the JSON-like string into key-value pairs for property extraction. It process strings such as `{"kind": "Humanoid", "bodyType": "physical", "faceType": "anthropomorphic", "reverie": "biotypical"}`. It may have more properties, but the values are strings, no need to further parsing. It gathers pairs of property-value such as `kind` and `Humanoid` and populates the entries with them. `kind` may be not the first property. **Hint:** using string methods such as `replaceAll` and `split`. You can use [regex101.com](https://regex101.com/) to get this done suign regular expressions, or use standard loops to achieve the expected behavior. **The strings we will use are compliant, no need to validate edge cases.**
- `public static String reifyKind(String[][] entries)`: Extracts the `kind` from parsed entries.
- `public static Object[] reifyProperties(String[][] entries)`: Gathers the properties from entries, inferring objects as needed. It does not include `kind`, and it may be not the first property.
- `public static Object inferObject(String value)`: Used by `reifyProperties` to determine the object from the string value. First, it check if the string is `null` or empty, then returns `EMPTY_PROPERTY`. Otherwise checks for `hasNonNumbers` and if there is a `.` in the string to determine parsing as `Double` or `Integer`.
- `public static boolean hasNonNumbers(String value)`: checks for `isDigit`, `_`, and only one `.` `char`s in a string. If anything else is found, is it a non-number string.
- `public static boolean isDigit(char c)`: checks for the char to be a `digit` (`[0-9]`).

## Evaluation Criteria
Projects will be evaluated on:
- **Soundness**: Accurate parsing, object creation, and humanoid/singularity identification. **All methods carry equal weight, yet related methods if not implemented will cause a negative chain effect in your grade.**
- **Code Quality**: Organization, readability, adherence to the principles presented in class, and object-oriented design within this project.
- **Documentation**: Clear comments explaining code sections and decision-making processes. **Required** on method and control blocks.
### MK1: Don't implicitly or explicitly import anything not already given to you by Java. This is an individual assignment.

## Submission Guidelines
### MK2: Don't implicitly or explicitly import anything not already given to you by Java. This is an individual assignment.
### DO NOT FORGET TO REMOVE IMPORTS GIVEN TO HELP YOU, AND WE WILL NOT GRADE ANYTHING IN  SystemWhole.main()
```java
// DO NOT INCLUDE THIS IMPORT WHEN SENT FOR GRADING, THIS IS HERE TO HELP YOU DEBUG THE PROGRAM STATE
import java.util.Arrays;

// YOU CAN SAFELY REMOVE Arrays calls in SystemWhole.main()
public class SystemWhole {public static void main(String[] args){/* WILL NOT BE GRADED */}}
```
Upload to GradeScope's P1 assigment your Java files for `SystemWhole.java`, `Machine.java`, and `ShapeAnalyzer.java` (No need for `PartState.java`, you must not modify this file), ensuring your code is well-tested and documented.

In the event that you're not able to complete all the methods in time, submit what you have, **MAKE SURE YOUR CODE COMPILES**. If your code does not compile, each class causing problems will likely cause you to lose a lot of points. 

When you submit on Gradescope, don't think the tests checking your code before the deadline are a comprehensive check of your code; they're there tell you if your code compiles, has any privacy/scope problems, and passes surface-level testing.

## Deadline
**GradeScope P1 deadline is THE deadline**

Best of luck on your first project! We (humans Hrolenok, Samudio, and JackGeePTee) look forward to seeing your computational models in action.
