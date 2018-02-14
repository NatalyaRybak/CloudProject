
/**
 * @author Natalya Rybak
 * get info (names) of students,create array and get this info;
 */
public class StudentInfo {

	private String[] names;

	/**
	 * @param names (get from the keyboard);
	 */
	StudentInfo(String[] names) {
		this.names = copyNames(names);
	}

	/** 
	 * @param source
	 * @return
	 */
	private String[] copyNames(String[] source) {
		int l = source.length;
		String[] target = new String[l];
		for (int i = 0; i < l; i++)
			target[i] = source[i];
		return target;
	}

	public String toString() {
		String res = new String();
		for (int i = 0; i < names.length; i++)
			res += names[i] + "\n";

		return res;
	}

	/** search names started with entered letter;
	 * @param startLetter
	 * @return
	 */
	public String searchNames(char startLetter) {
		String res = new String();
		for (int i = 0; i < names.length; i++)
			if (names[i].charAt(0) == startLetter)
				res += names[i] + "\n";

		return res;
	}

}
