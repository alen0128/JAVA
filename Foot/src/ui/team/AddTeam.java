package ui.team;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Team;

import service.TeamService;

public class AddTeam extends javax.swing.JFrame {
	public AddTeam() {
		ts = new TeamService();
		initComponents();
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jTextName = new javax.swing.JTextField();
		jTextMasterplace = new javax.swing.JTextField();
		jTextCoach = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButtonAdd = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u6dfb\u52a0\u7403\u961f");
		setBounds(new java.awt.Rectangle(300, 300, 0, 0));

		jLabel1.setFont(new java.awt.Font("YouYuan", 0, 24));
		jLabel1.setText("\u7403\u961f\u540d\u79f0\uff1a");

		jLabel2.setFont(new java.awt.Font("YouYuan", 0, 24));
		jLabel2.setText("\u7403\u961f\u4e3b\u573a\uff1a");

		jLabel3.setFont(new java.awt.Font("YouYuan", 0, 24));
		jLabel3.setText("\u4e3b\u6559\u7ec3\uff1a");

		jButtonAdd.setFont(new java.awt.Font("YouYuan", 0, 18));
		jButtonAdd.setText("\u6dfb\u52a0");
		jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = jTextName.getText();
				String masterplace = jTextMasterplace.getText();
				String coach = jTextCoach.getText();
				res = ts.findTeam(name);

				if (name.isEmpty()) {
					JOptionPane.showMessageDialog(null, "添加失败,球队名称不能为空!", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (!res.isEmpty()) {
					JOptionPane.showMessageDialog(null, "添加失败,球队已存在!", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					ts.addTeam(name, masterplace, coach);
					JOptionPane.showMessageDialog(null, "添加成功!", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				}
				jTextName.setText("");
				jTextMasterplace.setText("");
				jTextCoach.setText("");
			}
		});

		jButtonBack.setFont(new java.awt.Font("YouYuan", 0, 18));
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
								.addGap(23, 23, 23)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		124,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jTextMasterplace,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		199,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		124,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jTextName,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		199,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		124,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jTextCoach,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		199,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButtonAdd,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		138,
																		Short.MAX_VALUE)
																.addGap(57, 57,
																		57)
																.addComponent(
																		jButtonBack,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		138,
																		Short.MAX_VALUE)))
								.addContainerGap(44, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(34, 34,
																		34)
																.addComponent(
																		jTextName,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		35,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		35,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jTextMasterplace,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		35,
																		Short.MAX_VALUE)
																.addGap(27, 27,
																		27))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		35,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextCoach,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														35, Short.MAX_VALUE)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(37, 37, 37)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButtonAdd,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														41,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButtonBack,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														41,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(30, 30, 30)));

		pack();
		setLocationRelativeTo(null);
	}

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddTeam().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButtonAdd;
	private javax.swing.JButton jButtonBack;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JTextField jTextCoach;
	private javax.swing.JTextField jTextMasterplace;
	private javax.swing.JTextField jTextName;
	private service.TeamService ts = null;
	private List<Team> res;
}