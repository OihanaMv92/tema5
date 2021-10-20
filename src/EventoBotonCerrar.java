import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoBotonCerrar extends Frame implements WindowListener,
ActionListener
{
	private static final long serialVersionUID = 1L;
	Button btnBoton = new Button("Cerrar");
	public EventoBotonCerrar()
	{
		setLayout(new FlowLayout());
		setTitle("Botón que cierra la ventana");
		add(btnBoton);
		addWindowListener(this);
		//Añadir el listener al botón
		btnBoton.addActionListener(this);
		setSize(100,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoBotonCerrar();
	}
	//A continuación debemos colocar el método de la clase
	//abstracta ActionListener
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}
//Fin de la clase EventoBotonCerrar