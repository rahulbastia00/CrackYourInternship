class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int n = path.length();
        
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            
            if (path.charAt(i) == '/') {
                continue;
            }
            
            while (i < n && path.charAt(i) != '/') {
                str.append(path.charAt(i++));
            }
            
            String dir = str.toString();
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!dir.equals(".")) {
                stack.push(dir);
            }
        }
        
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.insert(0, "/" + stack.pop());
        }
        
        return ans.length() > 0 ? ans.toString() : "/";
    }
}
