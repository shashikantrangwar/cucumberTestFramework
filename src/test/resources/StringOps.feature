Feature: All String Operations
Scenario Outline: Add two Strings String1 and String2
Given I have a StringOpsClient
When I concatenate <String1> and <String2>
Then The result of concatenation is <String3>

Examples:
| String1 | String2 | String3 |
| "a"    | "b"      |  "ab"  |
| "b"    | "c"     |  "bc" |
| "ab"  |  "c"    |  "abc" |