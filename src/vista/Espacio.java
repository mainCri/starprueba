package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import modelo.EstrellaMutable;


public class Espacio extends JPanel{
    private JButton moveLeftButton;
    private JButton moveRightButton;
    private JButton moveUpButton;
    private JButton moveDownButton;

    private JFrame frame;
    private JPanel panel;
    private List<EstrellaMutable> estrellas;

    /**
     * @param estrellas
     */
    public Espacio(List<EstrellaMutable> estrellas) {
        this.estrellas = estrellas;
        frame = new JFrame("Panel de Estrellas");
        this.initComponent();
    }


    public void initComponent (){
        // Obtener la resolución de pantalla del sistema
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Configurar el tamaño del panel para que sea de pantalla completa
        /*panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                super.setBackground(Color.BLACK);
                for (EstrellaMutable estrella : estrellas) {
                    g.drawImage(estrella.getInmutable().getImagen(), estrella.getX(), estrella.getY(),
                    20, 20,null,null);
                    
                }
            }
        };*/

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (EstrellaMutable estrella : estrellas) {
                g.drawImage(estrella.getInmutable().getImagen(), estrella.getX(), estrella.getY(), 20, 20, null);
            }
        }

        panel.setPreferredSize(screenSize); // Establecer el tamaño del panel para que sea de pantalla completa
        frame.add(panel);

        // Crear botones de movimiento
        moveLeftButton = new JButton("Izquierda");
        moveRightButton = new JButton("Derecha");
        moveUpButton = new JButton("Arriba");
        moveDownButton = new JButton("Abajo");
        
        moveLeftButton.setBackground(Color.ORANGE);
        moveDownButton.setBackground(Color.ORANGE);
        moveRightButton.setBackground(Color.ORANGE);
        moveUpButton.setBackground(Color.ORANGE);

        // Crear un panel para contener los botones de movimiento
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.add(moveLeftButton);
        buttonPanel.add(moveRightButton);
        buttonPanel.add(moveUpButton);
        buttonPanel.add(moveDownButton);
        

        // Agregar el panel de botones de movimiento al BorderLayout.SOUTH del panel principal
        panel.setLayout(new BorderLayout());
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.setUndecorated(true); // Eliminar la decoración de la ventana (bordes, barra de título, etc.)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar la ventana a pantalla completa
        frame.setVisible(true);

        panel.setFocusable(true);
        panel.requestFocusInWindow();
    }

    public void addMoveLeftButtonActionListener(ActionListener listener) {
        moveLeftButton.addActionListener(listener);
    }

    public void addMoveRightButtonActionListener(ActionListener listener) {
        moveRightButton.addActionListener(listener);
    }

    public void addMoveUpButtonActionListener(ActionListener listener) {
        moveUpButton.addActionListener(listener);
    }

    public void addMoveDownButtonActionListener(ActionListener listener) {
        moveDownButton.addActionListener(listener);
    }

    public void repintarPanel() {
        panel.repaint();
    }

    public int getWidth() {
        return panel.getWidth();
    }
    
    public int getHeight() {
        return panel.getHeight();
    }

    public Object getPanel() {
        return null;
    }

}
