class GenerateParanthesis {
   public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    // Helper method to perform backtracking
    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: If the current string is of the maximum length (2 * n), add it to the result
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // If the number of open parentheses is less than the maximum allowed, add an open parenthesis
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // If the number of close parentheses is less than the number of open parentheses, add a close parenthesis
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
