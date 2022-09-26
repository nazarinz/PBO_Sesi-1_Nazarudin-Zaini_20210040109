import javax.swing.JOptionPane;

public class Pbo_sesi1{
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Belajar Java");
        JOptionPane.showMessageDialog(null, "Sangat mudah sekali");
        JOptionPane.showMessageDialog(null, "dan sangat menyenangkan");

        String input = JOptionPane.showInputDialog("Anda Sedang Belajar Apa?");
        JOptionPane.showMessageDialog(null, "Belajar "+input+ " sangat mudah");
    }
}

