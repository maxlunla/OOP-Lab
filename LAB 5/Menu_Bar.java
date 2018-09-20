import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class Menu_Bar {
	private JFrame fr;
	private JMenuBar mb;
	private JMenu m1, m2;
	private JMenuItem mi1, mi2, mi3, mi4, mi5, mi6, msi1, msi2, msi3;
	private JCheckBoxMenuItem cbm;
	public void init() {
		fr = new JFrame("Menu Demo");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Help");
		fr.setJMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		mi1 = new JMenuItem("New");
		mi2 = new JMenuItem("Open");
		mi3 = new JMenuItem("Print");
		mi4 = new JMenuItem("Exit");
		mi5 = new JMenu("Software");
		mi6 = new JMenuItem("Hardware");
		msi1 = new JMenuItem("Unix");
		msi2 = new JMenuItem("Linux");
		msi3 = new JMenuItem("Solaris");
		cbm = new JCheckBoxMenuItem("Check it", true);
		m1.add(mi1);
		m1.add(mi2);
		m1.addSeparator();
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
		m2.add(mi5);
		m2.add(mi6);
		m2.add(cbm);
		mi5.add(msi1);
		mi5.add(msi2);
		mi5.add(msi3);
		fr.setSize(200, 150);
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		Menu_Bar mm = new Menu_Bar();
		mm.init();
	}
}
