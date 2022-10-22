package stk;

public class CharStack {

	int p;
	int t;

	char[] stk;

	char e;

	public CharStack() {
		init(32);

	}

	public CharStack(int k) {
		init(k);
	}

	private void init(int v) {
		p = 0;
		t = 0;

		stk = new char[v];

		e = ' ';

		t = stk.length;

	}

	public void push(char n) {

		if (p == t) {
			/** to resize **/
		} else if (p < t) {

			if (p == -1) {
				p = 0;
			}

			stk[p] = n;
			p++;
		}

	}

	public char pop() {

		if( p != -1){

              if (p < t) {

                       p = p - 1;

			if (p == 0) {
				
			e = stk[p];
			stk[p] = '\u0000';
                        p = -1;
                       
			} else if (p > 0) {
			e = stk[r];
			stk[p] = '\u0000';
                        p = p + 1;
			}


		} else if (p == t) {
			p = p - 1;
			e = stk[p];
                        p = p + 1;

		}
             } 

		return e;

	}

	public char peek() {

		if (p < t) {

			if (p > 0) {
			} else if (p == -1) {

			}

		} else if (p == t) {
		}

		return stk[p];
	}

	public static void main(String[] args) {
		CharStack st;

		st = new CharStack();

	}

}
