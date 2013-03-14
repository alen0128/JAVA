/*
 * Shoot.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.match;

import java.util.ArrayList;
import java.util.List;
import service.ShootService;
import domain.Player;
import domain.Shoot;

/**
 * 
 * @author __USER__
 */
public class ShootInfo extends javax.swing.JFrame {

	public ShootInfo() {
		initComponents();
		ss = new ShootService();
		res = ss.displayShootByAll();
		ss.sortShoot(res);
		res = ss.displayShootByAll();
		printInfo(res);
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButtonBack = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5c04\u624b\u699c");

		jButtonBack.setText("\u8fd4\u56de");
		jButtonBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBackActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										375,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(13, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(331, Short.MAX_VALUE)
								.addComponent(jButtonBack).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 232,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jButtonBack)
						.addGap(14, 14, 14)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	public void printInfo(List<Shoot> res) {
		String data[][] = new String[res.size()][5];
		int index = 0;

		for (Shoot t : res) {
			data[index][0] = t.getRank();
			data[index][1] = t.getName();
			data[index][2] = t.getTeamname();
			data[index][3] = t.getNumber();
			data[index++][4] = String.valueOf(t.getBallnumber());
		}

		jTable1.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "名次", "姓名", "球队", "球衣号码", "进球数" }));

		jScrollPane1.setViewportView(jTable1);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ShootInfo().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBack;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;

	private List<Shoot> res = new ArrayList<Shoot>();
	private ShootService ss = null;
	// End of variables declaration//GEN-END:variables

}