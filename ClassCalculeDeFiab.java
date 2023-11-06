package Exercices;

public class ClassCalculeDeFiab {

	public int MethodeCalculeDeFiab(int n) {

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return MethodeCalculeDeFiab(n - 1) + MethodeCalculeDeFiab(n - 2);

	}

}
