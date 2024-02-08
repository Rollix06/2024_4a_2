import java.util.*;
import javax.swing.*;

public class Lettura {

	public static String leggiString(String mess) {

		String s = "";

		System.out.println(mess);
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		return s;
	}

	public static int leggiInt(String mess) {
		int x = 0;
		System.out.println(mess);
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		return x;
	}

	public static String leggiStringG(String mess) {

		String s = JOptionPane.showInputDialog(null, mess);
		if (s == null)
			s = "";

		return s;
	}

	public static int leggiIntG(String mess) {
		String s = JOptionPane.showInputDialog(null, mess);
		if (s == null)
			return -1;
		return Integer.parseInt(s);
	}

	public static int menu(String mess, int n, String imma) {
		Integer[] opz;
		opz = new Integer[n];
		int x = 0;
		for (int i = 0; i < n; i++)
			opz[i] = i;
		try {
			x = (Integer) JOptionPane.showInputDialog(null, mess, "Menu", JOptionPane.QUESTION_MESSAGE,
					new ImageIcon(imma), opz, opz[0]);
		} catch (Exception e) {
		}
		return x;
	}

	public static char leggiCharG(String mess) {

		String s;
		s = JOptionPane.showInputDialog(null, mess);
		char c = ' ';
		try {
			c = s.charAt(0);
		} catch (Exception e) {
		}
		return c;

	}
	
	
	public static boolean leggiBoolG(String mess) {
		String s;
		s=JOptionPane.showInputDialog(null,mess+"true-false");
		boolean b = false;
	    try {
	        b = Boolean.parseBoolean(s);
	    } catch (Exception e) {
	    }
	    return b;
	}
		
	
	
	
	
	
	
	
	
	
}