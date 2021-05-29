package proyectoMetodos.frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu {

	private JFrame frame;
	private MenuUnidad1 m1;
	private MenuUnidad2 m2;
	private MenuUnidad3 m3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JOptionPane.showMessageDialog(null, "\t\t********** UNAM **********\n\n"
				+ "FACULTAD DE ESTUDIOS SUPERIORES ACATL�N\n\n	"
				+ "\tMAC\n\n"
				+ "Materia: M�TODOS NUMERICOS\n\n"
				+ "Integrantes\n"
				+ "Perez Rosales Eduardo\n"
				+ "Pizano Castillo Cecilia\n"
				+ "Fecha Enero 2021");
		JOptionPane.showMessageDialog(null, "INTRODUCCI�N A LOS M�TODOS NUM�RICOS:\n"
				+ "Los m�todos num�ricos son t�cnicas mediante las cuales es posible\n "
				+ "formular problemas matem�ticos de tal forma que puedan resolverse usando\n"
				+ "operaciones aritm�ticas. Son algoritmos mediante los cuales se obtiene, de\n"
				+ "manera aproximada, la soluci�n de ciertos problemas realizando c�lculos aritm�ticos\n"
				+ "y l�gicos (operaciones aritm�ticas elementales, c�lculo de funciones, tablas de\n"
				+ "valores, c�lculo proposicional, etc.).");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		m1 = new MenuUnidad1();
		
		JLabel lblNewLabel = new JLabel("Escoge una unidad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(137, 11, 163, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ecuaciones no lineales");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Introducci�n a la unidad 1
				JOptionPane.showMessageDialog(null, "SOLUCI�N NUM�RICA DE ECUACIONES NO LINEALES DE UNA SOLA VARIABLE\n"
										+ "Los valores de x que solucionan cualquier ecuaci�n f(x)=0 son\n"
										+ "llamados ra�ces o soluciones. Muchas ecuaciones no admiten que su \n"
										+ "solucion pueda ser expresada a traves de m�todos exactos. \n"
										+ "Para aproximar una soluci�n, se utilizar�n tecnicas iterativas, \n"
										+ "es decir, m�todos que inician de una aproximaci�n inicial \n"
										+ "de la ra�z de f y posteriormente construiremos una sucesi�n \n"
										+ "de n�meros reales que converja hacia la soluci�n con cada iteraci�n");
				m1.setVisible(true);
			}
		});
		btnNewButton.setBounds(95, 42, 250, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSistemasDeEcuaciones = new JButton("Sistemas de Ecuaciones Lineales");
		btnSistemasDeEcuaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Introducci�n a la Unidad 2
				JOptionPane.showMessageDialog(null, "SISTEMAS DE ECUACIONES LINEALES (SEL)\n"
										+ "Un sistema de ecuaciones lineales es un conjunto de dos\n"
										+ "o mas ecuaciones de grado 1 con dos o m�s inc�gnitas relacionadas \n"
										+ "entre s�. La soluci�n de un sistema de ecuaciones lineales \n"
										+ "es un conjunto de valores que satisfacen todas las ecuaciones \n"
										+ "al mismo tiempo. Cada sistema de ecuaciones lineales puede expresarse\n"
										+ "como una multiplicacion de matrices Ax=b, donde A es la\n"
										+ "matriz de coeficientes del sistema, x es el vector de \n"
										+ "inc�gnitas y b es el vector de t�rminos independientes. Solucionar \n"
										+ "el sistema consiste en encontrar los valores de los componentes \n"
										+ "del vector x que satisfacen dicho producto.");
				m2 = new MenuUnidad2();
				m2.setVisible(true);
			}
		});
		btnSistemasDeEcuaciones.setBounds(95, 100, 250, 23);
		frame.getContentPane().add(btnSistemasDeEcuaciones);
		//*******
		

		JButton btnFactorizacionLU = new JButton("Factorizaci�n LU");
		btnFactorizacionLU .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "FACTORIZACI�N LU\n"
						+ "El esquema de descomposici�n LU es una transformaci�n\n"
						+ "de una matriz A como producto de dos matrices\n"
						+ " \tA = LU\n"
						+ "donde L es una matriz triangular inferior y U es una\n"
						+ "matriz triangular superior. Lo que genera dos \n"
						+ "sistemas, y para obtener la soluci�n del sistema \n"
						+ "se resuelve por medio de sustituci�n progresiva\n"
						+ "y sustituci�n regresiva, los sistemas generados\n");
				m3 = new MenuUnidad3();
				m3.setVisible(true);
			}
		});
		btnFactorizacionLU.setBounds(95, 160, 250, 23);
		frame.getContentPane().add(btnFactorizacionLU );
		
		
	}
}
