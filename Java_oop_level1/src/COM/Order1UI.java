package COM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import COM.Order1;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Order1UI extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final double SUBTOTAL = 0;
	protected static final double DISDISdisdiscountRate = 0;
	protected static final double TOTAL = 0;
	private JPanel contentPane;
	private JTextField orderNo;
	private JTextField unitPrice;
	private JTextField quantity;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order1UI frame = new Order1UI();
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
	public Order1UI() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564,400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(255, 128, 255));
		panel.setBounds(20, 10, 500, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("商品訂單折扣管理系統");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 26));
		lblNewLabel.setBounds(45, 10, 300, 40);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 192));
		panel_1.setBounds(20, 80, 200, 200);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("訂單編號：");
		lblNewLabel_1.setFont(new Font("新細明體", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(10, 10, 100, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("商品單價：");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.ITALIC, 16));
		lblNewLabel_1_1.setBounds(10, 45, 100, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("數        量：");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.ITALIC, 16));
		lblNewLabel_1_2.setBounds(10, 80, 100, 30);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("會        員：");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.ITALIC, 16));
		lblNewLabel_1_3.setBounds(10, 115, 100, 30);
		panel_1.add(lblNewLabel_1_3);
		
		orderNo = new JTextField();
		orderNo.setBounds(90, 10, 100, 30);
		panel_1.add(orderNo);
		orderNo.setColumns(10);
		
		unitPrice = new JTextField();
		unitPrice.setBounds(90, 45, 100, 30);
		panel_1.add(unitPrice);
		unitPrice.setColumns(10);
		
		quantity = new JTextField();
		quantity.setBounds(90, 80, 100, 30);
		panel_1.add(quantity);
		quantity.setColumns(10);
					
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBounds(230, 80, 300, 200);
		contentPane.add(panel_2);
		panel_2.setLayout(null);		
		
		JRadioButton member = new JRadioButton("Y");
		buttonGroup.add(member);
		member.setBounds(90, 116, 45, 30);
		panel_1.add(member);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("N");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(145, 115, 45, 30);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JTextArea output = new JTextArea();
		output.setBounds(240, 90, 280, 180);
		contentPane.add(output);
		
		/*****************event******************/
		JButton btnNewButton = new JButton("確認!!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				/*
				 * 1.讀取-->orderNo,unitPrice,quantity-->getText():String
				 * 2.orderNo,unitPrice,quantity-->轉整數
				 * 3.new Order(編號,單價,數量,會員);
				 * 4.caculate()-->計算所有資料
				 * 5.output-->輸出setText("");
				 */
				String order_no=orderNo.getText();
				String unit_price=unitPrice.getText();
				String Quantity=quantity.getText();
								
				int OrderNO=Integer.parseInt(order_no);
				int UnitPrice=Integer.parseInt(unit_price);
				int QUANTITY=Integer.parseInt(Quantity);
								
				Order1 order=new Order1(OrderNO,UnitPrice,QUANTITY,member.isSelected());
				order.calculate();
				output.setText(order.show2());
				
				
				
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.ITALIC, 20));
		btnNewButton.setBounds(10, 155, 182, 40);
		panel_1.add(btnNewButton);
		

	}
}
