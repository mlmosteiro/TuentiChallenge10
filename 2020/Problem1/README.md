# Challenge 1 - Rock, Paper, Scissors
@mlmosteiro

## Proposed solution
In these case the problem is solved comparing the values of both players with the rules of the game. In this case the rules are defined in a Enum.
###### Rules
- **Rock** loses against Paper
- **Scissors** loses against Rock
- **Paper** loses against Scissors

After parsing the input, the logic is quite simple:
1. Check if the values are different,if they are not, then the result is a draw. 
2. Define player1's value
3. Define if player2's value is equal to the value against which player1 loses. 
4. If it is equal, that means that player2 wins, otherwise player1 wins. 
 
