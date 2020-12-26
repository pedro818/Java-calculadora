package calculadoras;

import javax.swing.*; //elementos del formulario
import java.awt.*; //
import java.awt.event.*; // manejar los eventos que van a ser lo de los botones

public class Calculadoras extends JFrame implements ActionListener{ // extends heredade Jframe Action listener para los botones

	//creando nuestro formulario
	JPanel base = (JPanel) this.getContentPane(); 
	
	//creando la pantalla (textfield)
	JTextField pantalla = new JTextField(); 
	
	//creando botones
	
	JButton buno = new JButton("1"); // lo que esta en comilla " es lo kiero que diga
	JButton bdos = new JButton("2");
	JButton btres = new JButton("3");
	JButton bcuatro = new JButton("4");
	JButton bcinco = new JButton("5");
	JButton bseis = new JButton("6");
	JButton bsiete = new JButton("7");
	JButton bocho = new JButton("8");
	JButton bnueve = new JButton("9");
	JButton bcero = new JButton("0");
	JButton bmas = new JButton("+");
	JButton bmenos = new JButton("-");
	JButton bpor = new JButton("*");
	JButton bdiv = new JButton("/");
	JButton bigual = new JButton("=");
	JButton bborrar = new JButton("Borrar");
	
 	public Calculadoras() { //constructor le voy a dar propiedades
 	
 		//propiedades del formulario
 		base.setLayout(null); //acomodar manualmente los elementos los botones serian
 		setSize(350,450); //anchos 350 y vertical 450
 		setTitle("Calculadora"); 
 		setVisible(true); //si no le ponemos true la calculadora no se va a ver
 		
 		
 		//propiedades de pantalla
 		pantalla.setBounds(22, 8, 288, 70); //x, y, ancho, alto
 		add(pantalla);
 		
 		//propiedades de botones
 		buno.setBounds(22, 83, 60, 60); //x, y se calcula sumando el y del anterior mas el alto, despues ancho y el alto
 		buno.setFont(new Font("tahoma",Font.BOLD,20));// tipo de letra, negrita
 		add(buno);
 		buno.addActionListener(this); //que este a la escucha cuando haga click y lo atrape
 		
 		
 		bdos.setBounds(87, 83, 60, 60);
 		bdos.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bdos);
 		bdos.addActionListener(this);
 		
 		btres.setBounds(152, 83, 60, 60);
 		btres.setFont(new Font("tahoma",Font.BOLD,20));
 		add(btres);
 		btres.addActionListener(this);
 		
 		bborrar.setBounds(217, 83, 92, 60);
 		bborrar.setFont(new Font("tahoma",Font.BOLD,13));
 		add(bborrar);
 		bborrar.addActionListener(this);
 		
 		
 		bcuatro.setBounds(22, 148, 60, 60);
 		bcuatro.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bcuatro);
 		bcuatro.addActionListener(this);
 		
 		bcinco.setBounds(87, 148, 60, 60);
 		bcinco.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bcinco);
 		bcinco.addActionListener(this);
 		
 		bseis.setBounds(152, 148, 60, 60);
 		bseis.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bseis);
 		bseis.addActionListener(this);
 		
 		bsiete.setBounds(22, 213, 60, 60);
 		bsiete.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bsiete);
 		bsiete.addActionListener(this);
 		
 		bocho.setBounds(87, 213, 60, 60);
 		bocho.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bocho);
 		bocho.addActionListener(this);
 		
 		bnueve.setBounds(152, 213, 60, 60);
 		bnueve.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bnueve);
 		bnueve.addActionListener(this);
 		
 		bcero.setBounds(87, 278, 60, 60);
 		bcero.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bcero);
 		bcero.addActionListener(this);
 		
 		bmas.setBounds(217, 148, 92, 60);
 		bmas.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bmas);
 		bmas.addActionListener(this);
 		
 		bmenos.setBounds(217, 213, 92, 60);
 		bmenos.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bmenos);
 		bmenos.addActionListener(this);
 		
 		bpor.setBounds(22, 278, 60, 60);
 		bpor.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bpor);
 		bpor.addActionListener(this);
 		
 		bdiv.setBounds(152, 278, 60, 60);
 		bdiv.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bdiv);
 		bdiv.addActionListener(this);
 		
 		bigual.setBounds(22, 343, 288, 60);
 		bigual.setFont(new Font("tahoma",Font.BOLD,20));
 		add(bigual);
 		bigual.addActionListener(this);
 		
 		
 		
 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculadoras(); //instanciar un objeto tipo clase
	}
	
	public void actionPerformed(ActionEvent e) { //ese e puede recibir cualquier nombre w y t j k se encarga de capturar el evento que suceda en los botones y de donde venga el evento
		
		if(e.getSource() == buno) { //
			
			if(pantalla.getText() == "") { //si la pantalla esta vacia poner 1
			
				pantalla.setText("1"); //poner en la pantalla el valor 1 setText poner el texto, es un string
			}
			else { // si lo hay , tomar lo que hay y agregarle lo del boton
				pantalla.setText(pantalla.getText() + "1");
			}
	}
		
	if(e.getSource() == bdos) {
			
			if(pantalla.getText() == "") {
			
				pantalla.setText("2");
			}
			else {
				pantalla.setText(pantalla.getText() + "2");
			}
	}

	if(e.getSource() == btres) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("3");
		}
		else {
			pantalla.setText(pantalla.getText() + "3");
		}
}
		
	if(e.getSource() == bcuatro) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("4");
		}
		else {
			pantalla.setText(pantalla.getText() + "4");
		}
}
		
	if(e.getSource() == bcinco) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("5");
		}
		else {
			pantalla.setText(pantalla.getText() + "5");
		}
}
	
	
	if(e.getSource() == bseis) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("6");
		}
		else {
			pantalla.setText(pantalla.getText() + "6");
		}
}
		
	if(e.getSource() == bsiete) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("7");
		}
		else {
			pantalla.setText(pantalla.getText() + "7");
		}
}

	if(e.getSource() == bocho) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("8");
		}
		else {
			pantalla.setText(pantalla.getText() + "8");
		}
}
	
	if(e.getSource() == bnueve) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("9");
		}
		else {
			pantalla.setText(pantalla.getText() + "9");
		}
}
	
	if(e.getSource() == bcero) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("0");
		}
		else {
			pantalla.setText(pantalla.getText() + "0");
		}
}
	
	if(e.getSource() == bmas) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("+");
		}
		else {
			pantalla.setText(pantalla.getText() + "+");
		}
}
	
	if(e.getSource() == bmenos) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("-");
		}
		else {
			pantalla.setText(pantalla.getText() + "-");
		}
}
	
	
	if(e.getSource() == bpor) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("*");
		}
		else {
			pantalla.setText(pantalla.getText() + "*");
		}
}
	
	if(e.getSource() == bdiv) {
		
		if(pantalla.getText() == "") {
		
			pantalla.setText("/");
		}
		else {
			pantalla.setText(pantalla.getText() + "/");
		}
}
	
	if(e.getSource() == bborrar) { //si el boton borrar es clickeado
		
		pantalla.setText(""); //poner en blanco la pantalla
		
}
	
	if(e.getSource() == bigual) {
		
		String cadena = pantalla.getText(); // me traigo lo que hay en la pantalla y lo guardo en la variable cadena
	
		
		for(int i=0; i< cadena.length(); i++) { //cadena.lenght mide el largo de la cadena
			
			char caracter = cadena.charAt(i); //guardar caracter de la cadena por cada vuelta 
			
			if(caracter == '+'){ // los char van con comillas simples
 			
				String primeraparte = cadena.substring(0,i);// que saque los valores antes del + por ej 12 + 24 sacaria el 12
				String segundaparte = cadena.substring(i+1,cadena.length()); // sacaria el 24 hasta el largo de la cadena 
				
				double resultado = Double.parseDouble(primeraparte) + Double.parseDouble(segundaparte);
				
				pantalla.setText(Double.toString(resultado));// resultado se vuelve a convertir en String para poder ponerla en la pantalla
				
			}
			
			if(caracter == '-'){
				
				String primeraparte = cadena.substring(0,i);
				String segundaparte = cadena.substring(i+1,cadena.length());
				
				double resultado = Double.parseDouble(primeraparte) - Double.parseDouble(segundaparte);
				
				pantalla.setText(Double.toString(resultado));
				
			}
			
			if(caracter == '*'){
				
				String primeraparte = cadena.substring(0,i);
				String segundaparte = cadena.substring(i+1,cadena.length());
				
				double resultado = Double.parseDouble(primeraparte) * Double.parseDouble(segundaparte);
				
				pantalla.setText(Double.toString(resultado));
				
			}
			
			if(caracter == '/'){
				
				String primeraparte = cadena.substring(0,i);
				String segundaparte = cadena.substring(i+1,cadena.length());
				
				double cero = Double.parseDouble(segundaparte); //lo convierto a valor numerico
				
				if(cero == 0) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
				}
				else {
				double resultado = Double.parseDouble(primeraparte) / Double.parseDouble(segundaparte);
				
				pantalla.setText(Double.toString(resultado));
				}
			}
			
			
			
		}
	}
	
	
	
	}
}