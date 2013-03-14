package ui.team;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import service.TeamService;
import domain.Team;

public class DisplayTeam extends javax.swing.JFrame {
	public DisplayTeam() {
		initComponents();

		ts = new TeamService();
		res = ts.findAll();
		printTeam(res);
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u7403\u961f\u4e00\u89c8\u8868");

		jLabel1.setFont(new java.awt.Font("YouYuan", 0, 18));
		jLabel1.setText("\u7403\u961f\u540d\u79f0:");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}
		});

		jCheckBox1.setFont(new java.awt.Font("YouYuan", 0, 18));
		jCheckBox1.setText("\u6a21\u7cca\u67e5\u8be2");
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				flag = jCheckBox1.isSelected();
			}
		});

		jButton1.setFont(new java.awt.Font("YouYuan", 0, 18));
		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = jTextField1.getText();
				res.clear();
				if (flag) {
					res = ts.findTeamDim(name);
				} else {
					res = ts.findTeam(name);
				}

				if (res.isEmpty()) {
					JOptionPane.showMessageDialog(null, "没找到此信息", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					printTeam(res);
				}
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
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		102,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jCheckBox1)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jButton1))
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														410,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(15, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														36,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1)
												.addComponent(jCheckBox1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										275,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	public void printTeam(List<Team> res) {
		String data[][] = new String[res.size()][3];
		int index = 0;

		for (Team t : res) {
			data[index][0] = t.getName();
			data[index][1] = t.getMasterplace();
			data[index++][2] = t.getCoach();
		}

		jTable1.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "球队名称", "球队主场", "主教练" }));
		jScrollPane1.setViewportView(jTable1);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DisplayTeam().setVisible(true);
			}
		});
	}

	private JLabel jLabel1;
	private JTable jTable1;
	private JButton jButton1;
	private JCheckBox jCheckBox1;
	private JTextField jTextField1;
	private JScrollPane jScrollPane1;
	private List<Team> res;
	private Boolean flag = false;
	private TeamService ts = null;
}