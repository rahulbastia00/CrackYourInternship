class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {


            int longestPrefixLength = strs[0].length();
            for (int i = 1; i < strs.length; i++) {
                int index = 0;
                while (index < longestPrefixLength && index < strs[i].length()) {
                    if (strs[0].charAt(index) == strs[i].charAt(index)) {
                        index = index + 1;
                        continue;
                    }
                    break;
                }
                if (index < longestPrefixLength) {
                    longestPrefixLength = index;
                }
            }
            StringBuilder commonPrefix = new StringBuilder();
            for (int i = 0; i < longestPrefixLength; i++) {
                commonPrefix.append(strs[0].charAt(i));
            }
            return commonPrefix.toString();
    }
}
