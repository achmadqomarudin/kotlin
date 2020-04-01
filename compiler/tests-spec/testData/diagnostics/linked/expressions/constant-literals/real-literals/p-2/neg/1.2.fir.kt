/*
 * KOTLIN DIAGNOSTICS SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-100
 * MAIN LINK: expressions, constant-literals, real-literals -> paragraph 2 -> sentence 1
 * NUMBER: 2
 * DESCRIPTION: Real literals with a not allowed exponent mark at the beginning.
 */

// TESTCASE NUMBER: 1
val value_1 = <!UNRESOLVED_REFERENCE!>E0<!>

// TESTCASE NUMBER: 2
val value_2 = <!UNRESOLVED_REFERENCE!>e000<!>

// TESTCASE NUMBER: 3
val value_3 = <!UNRESOLVED_REFERENCE!>E<!><!AMBIGUITY!>+<!>0

// TESTCASE NUMBER: 4
val value_4 = <!UNRESOLVED_REFERENCE!>e00<!>

// TESTCASE NUMBER: 5
val value_5 = <!UNRESOLVED_REFERENCE!>e<!><!AMBIGUITY!>+<!>1

// TESTCASE NUMBER: 6
val value_6 = <!UNRESOLVED_REFERENCE!>e22<!>

// TESTCASE NUMBER: 7
val value_7 = <!UNRESOLVED_REFERENCE!>E<!><!AMBIGUITY!>-<!>333

// TESTCASE NUMBER: 8
val value_8 = <!UNRESOLVED_REFERENCE!>e4444<!>

// TESTCASE NUMBER: 9
val value_9 = <!UNRESOLVED_REFERENCE!>e<!><!AMBIGUITY!>-<!>55555

// TESTCASE NUMBER: 10
val value_10 = <!UNRESOLVED_REFERENCE!>e666666<!>

// TESTCASE NUMBER: 11
val value_11 = <!UNRESOLVED_REFERENCE!>E7777777<!>

// TESTCASE NUMBER: 12
val value_12 = <!UNRESOLVED_REFERENCE!>e<!><!AMBIGUITY!>-<!>88888888

// TESTCASE NUMBER: 13
val value_13 = <!UNRESOLVED_REFERENCE!>E<!><!AMBIGUITY!>+<!>999999999
