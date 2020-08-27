import java.util.Stack;
public class ParanthesisBalance {
public static boolean isBalanced(String str) {
	char []ch=str.toCharArray();
	Stack<Character> s=new Stack<Character>();
	for(char c:ch) {
		if(c=='{' || c=='(' || c=='[')
		{
			s.push(c);
			continue;
		}
		if(s.isEmpty())
			return false;
		switch(c) {
		case ')' :
			s.pop();
			if(c=='{'|| c=='[')
				return false;
			break;
		case '}': 
            s.pop(); 
            if (c == '(' || c== '[') 
                return false; 
            break; 

        case ']': 
            s.pop(); 
            if (c == '(' || c == '{') 
                return false; 
            break; 
		}
	}
	
	return s.isEmpty();
}
	public static void main(String[] args) {
		
		System.out.println(isBalanced("{{(})}"));

	}

}
