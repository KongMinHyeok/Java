package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(12, 10, 157, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 131, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Button 컴포넌트");
		lblNewLabel_2.setBounds(12, 37, 95, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(106, 62, 87, 23);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(12, 62, 87, 23);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btn3.setBounds(197, 62, 87, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("Yes 클릭...");
				}else {
				System.out.println("No 클릭");
				}
			}
		});
		btn4.setBounds(292, 62, 87, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_3 = new JLabel("TextField 컴포넌트");
		lblNewLabel_3.setBounds(12, 95, 104, 15);
		contentPane.add(lblNewLabel_3);
		
		txtf1 = new JTextField();
		txtf1.setBounds(12, 120, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(12, 151, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(12, 182, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf1Result = new JLabel("결과 :");
		lbltxtf1Result.setBounds(197, 123, 104, 15);
		contentPane.add(lbltxtf1Result);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lbltxtf1Result.setText("결과 : " + txt);
				
			}
		});
		btntxtf1.setBounds(136, 119, 60, 23);
		contentPane.add(btntxtf1);
		
		JLabel lbltxtf2Result = new JLabel("결과 :");
		lbltxtf2Result.setBounds(197, 154, 104, 15);
		contentPane.add(lbltxtf2Result);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf2.getText();
				lbltxtf2Result.setText("결과 : " + txt);
				
			}
		});
		btntxtf2.setBounds(136, 150, 60, 23);
		contentPane.add(btntxtf2);
		
		JLabel lbltxtf3Result = new JLabel("결과 :");
		lbltxtf3Result.setBounds(197, 185, 104, 15);
		contentPane.add(lbltxtf3Result);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf3.getText();
				lbltxtf3Result.setText("결과 : " + txt);
				
			}
		});
		btntxtf3.setBounds(136, 181, 60, 23);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_4 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_4.setBounds(12, 214, 116, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("취미를 고르세요");
		lblNewLabel_4_1.setBounds(21, 238, 95, 15);
		contentPane.add(lblNewLabel_4_1);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(12, 259, 55, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(67, 259, 55, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(120, 259, 55, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(173, 259, 55, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(224, 259, 55, 23);
		contentPane.add(chk5);
		
		JLabel lblchkResult = new JLabel("결과 :");
		lblchkResult.setBounds(12, 288, 272, 15);
		contentPane.add(lblchkResult);
		
		JButton btnchk = new JButton("확인");
		btnchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();    
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblchkResult.setText("결과 : " + chks.toString());
				
			}
		});
		btnchk.setBounds(301, 259, 60, 23);
		contentPane.add(btnchk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButtion 컴포넌트");
		lblNewLabel_5.setBounds(12, 313, 131, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 334, 60, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(83, 334, 60, 23);
		contentPane.add(rdFemale);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(12, 363, 272, 15);
		contentPane.add(lblGenderResult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdFemale);
		bg.add(rdMale);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String result = null;
				
				if(rdMale.isSelected()) {
					lblGenderResult.setText("결과 : 남자" );
				} else {
					lblGenderResult.setText("결과 : 여자");
				}
			}
		});
		btnGender.setBounds(151, 334, 60, 23);
		contentPane.add(btnGender);
		

	}
}
