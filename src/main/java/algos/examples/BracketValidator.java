package algos.examples;

import algos.adt.stack.LinkedListStack;

public class BracketValidator
{
    private LinkedListStack<Character> opening = new LinkedListStack<>();

    public boolean validate(String input)
    { 
        for (Character c  : input.toCharArray())
        { 
            switch(c){
                // opening brackets
                case '(':
                    opening.push(c);
                    break;
                case '[':
                    opening.push(c);
                    break;
                case '{':
                    opening.push(c);
                    break;
                // closing brackets
                case ')':
                    if (opening.getSize() == 0 || opening.pop() != '(') return false;
                    break;
                case ']':
                    if (opening.getSize() == 0 || opening.pop() != '[') return false;
                    break;
                case '}':
                    if (opening.getSize() == 0 || opening.pop() != '{') return false;
                    break;
            }
        }

        return opening.getSize() == 0;
    }
}