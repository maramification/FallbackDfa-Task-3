# FallbackDfa-Task-3

## German University in Cairo
### Department of Computer Science
### Assoc. Prof. Haythem O. Ismail

### CSEN1002 Compilers Lab, Spring Term 2024
**Task 3: Fallback Deterministic Finite Automata**

## Overview
This project involves implementing a fallback deterministic finite automaton with actions (FDFA) abstract data type. An FDFA is defined by a sextuple (Q, Σ, δ, q0, F, A). This README provides an overview of the project requirements, setup, and usage instructions.

## Objective
Implement an FDFA with the following components:
- Q: A non-empty, finite set of states.
- Σ: A non-empty, finite set of symbols (alphabet).
- δ: The transition function, δ: Q × Σ → Q.
- q0: The start state (q0 ∈ Q).
- F: The set of accept states (F ⊆ Q).
- A: A function that maps every state in Q to an action that appends the token "lex,q" to a list, where lex is the lexeme and q is the state name.

## Requirements

1. **Assumptions:**
   - The set of states Q is always of the form {0, ..., n}, for some n ∈ N.
   - The alphabet Σ is always a subset of the Latin alphabet (excluding 'e').
   - q0 is not an accept state (q0 /∈ F).
   - A(q) appends the token "lex,q" to a list, where lex is as indicated in Lecture 2 of CSEN1003, and q is the state name.

2. **Implementation:**
   - Implement a class constructor `FallbackDfa` and a method `run`.
   - `FallbackDfa` takes one parameter, a string describing an FDFA in the format `Q#A#T#I#F`:
     - `Q`: Semicolon-separated sequence of sorted integer literals representing the set of states.
     - `A`: Semicolon-separated sequence of alphabetically sorted symbols representing the input alphabet.
     - `T`: Semicolon-separated sequence of triples representing the transition function. Each triple is a comma-separated sequence `i,a,j`, where `i` is a state in Q, `a` is a symbol in A, and `j` is a state in Q.
     - `I`: Integer literal representing the initial state.
     - `F`: Semicolon-separated sequence of sorted integer literals representing the set of accept states.

   Example:
   - For an FDFA with the state diagram below, the string representation might be:
     ```
     0;1;2;3#a;b#0,a,0;0,b,1;1,a,2;1,b,1;2,a,0;2,b,3;3,a,3;3,b,3#0#1;2
     ```

3. **Operation:**
   - The `run` method simulates the operation of the constructed FDFA on a given input string and returns a semicolon-separated sequence of tokens.
   
   Example:
   - Running the above FDFA on the string `baababb` produces the output `baaba,2;bb,1`.

For any further details or clarifications, refer to the lab manual or contact the course instructor.
