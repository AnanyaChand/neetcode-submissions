class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].matches("-?[0-9]+")){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                int output;
                if(tokens[i].equals("/")){
                    output=b/a;
                }else{
                    if(tokens[i].equals("+")){
                        output=b+a;
                    }
                    else if(tokens[i].equals("-")){
                        output=b-a;
                    }
                    else {
                        output=b*a;
                    }
                }  
                stack.push(output);
            }
        }
        return stack.pop();
    }
}
