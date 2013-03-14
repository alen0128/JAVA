/*
 * Rank.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.match;

import java.util.ArrayList;
import java.util.List;

import domain.Score;
import service.ScoreService;

/**
 * 
 * @author __USER__
 */
public class RankInfo extends javax.swing.JFrame {

	/** Creates new form Rank */
	public RankInfo() {
		initComponents();

		ss = new ScoreService();
		res = ss.displayScoreByAll();
		ss.sortScore(res);
		res = ss.displayScoreByAll();
		printScore(res);
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButtonBack = new javax.swing.JButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u79ef\u5206\u699c");

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
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														636, Short.MAX_VALUE)
												.addComponent(
														jButtonBack,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														91,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										249, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButtonBack).addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents

	public void printScore(List<Score> res) {
		String data[][] = new String[res.size()][10];
		int index = 0;

		for (Score t : res) {
			data[index][0] = t.getPlace();
			data[index][1] = t.getName();
			data[index][2] = t.getTurn();
			data[index][3] = t.getWon();
			data[index][4] = t.getEven();
			data[index][5] = t.getBeaten();
			data[index][6] = t.getGoal();
			data[index][7] = t.getLost();
			data[index][8] = t.getNet();
			data[index++][9] = String.valueOf(t.getPoint());
		}
		jTable1.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "名次", "球队名称", "轮次", "胜", "平", "负", "进球数", "失球数",
						"净胜球", "积分" }));

		jScrollPane1.setViewportView(jTable1);
	}

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RankInfo().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBack;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;

	private ScoreService ss = null;
	private List<Score> res = new ArrayList<Score>();
	// End of variables declaration//GEN-END:variables

}