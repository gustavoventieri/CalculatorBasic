import javax.swing. *;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame{
    JButton soma, menos, div, multi, desab, ocultar, limpar, habili, exibir, fechar;
    JLabel  txt1, txt2, res1, res2, pessoa; 
    JTextField v1, v2; 
 
    public  Main(){
    super("Calculadora Basica");
    Container tela = getContentPane();
    
    //implantando icone 
    ImageIcon icon = new ImageIcon("img/***");
    //puxando icone
    setIconImage(icon.getImage());
    //limpando espaçõs em branco ou sujeiras
        setLayout(null);
        
        txt1 = new JLabel("primeiro valor");
        txt2 = new JLabel("segundo valor");
        res1 = new JLabel("Resultado: ");
        res2 = new JLabel("");
        pessoa = new JLabel("Desenvolvido por: Gustavo Mendes Ventieri Mariano");
        
        txt1.setBounds(50, 20, 100, 20);
        txt2.setBounds(50, 60, 100, 20);
        
        res1.setBounds(50, 103, 100, 20);
        res2.setBounds(120, 103, 200, 20);
        
        pessoa.setBounds(105, 300, 500, 20);
        res1.setForeground(Color.red);
        
        v1 = new JTextField(15);
        v2 = new JTextField(15);
        
        v1.setBounds(135,22,120,20);
        v2.setBounds(135,62, 120, 20);
        // operadores logicos 
        soma = new JButton("+");
        menos = new JButton("-");
        div = new JButton("/");
        multi = new JButton("*");
        limpar =  new JButton("Limpar");
        
        v1.setForeground(Color.red);
        v2.setForeground(Color.red);
        pessoa.setForeground(Color.red);
        
        soma.setBounds(360, 22, 50, 20);
        menos.setBounds(360, 42, 50, 20);
        div.setBounds(360, 62, 50, 20);
        multi.setBounds(360, 82, 50, 20 );
        limpar.setBounds(360, 102, 80, 20);
        //"tools bar" barra com equipamentos
        habili =  new JButton("Habilitar");
        desab = new JButton("Desabilitar");
        ocultar = new JButton("Ocultar");
        exibir = new JButton("Exibir");
        
        habili.setBounds(50,200,100, 20);
        desab.setBounds(150, 200, 100, 20);
        ocultar.setBounds(280, 200, 80, 20);
        exibir.setBounds(360, 200, 80, 20);
 
        fechar = new JButton("Fechar");
        // comando ativado pelas teclas ALT + T
        habili.setMnemonic(KeyEvent.VK_T); 
        // comando ativado pelas teclas ALT + K
        desab.setMnemonic(KeyEvent.VK_A);
        fechar.setBounds(360, 240, 80, 20);
        
        soma.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double vr1, vr2, res;
            vr1 = Double.parseDouble(v1.getText());
            vr2 = Double.parseDouble(v2.getText());
            res = vr2 + vr1;
            res2.setText("A soma é: " + res);
        }
        });
        menos.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double vr1, vr2, res;
            vr1 = Double.parseDouble(v1.getText());
            vr2 = Double.parseDouble(v2.getText());
            res = vr2 - vr1;
            res2.setText("A subtração é: " + res);
        }
        });
        div.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double vr1, vr2, res;
            vr1 = Double.parseDouble(v1.getText());
            vr2 = Double.parseDouble(v2.getText());
            res = vr2 / vr1;
            res2.setText("A divisão é: " + res);
        }
        });
        
        multi.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double vr1, vr2, res;
            vr1 = Double.parseDouble(v1.getText());
            vr2 = Double.parseDouble(v2.getText());
            res = vr2 * vr1;
            res2.setText("A multiplicação é: " + res);
        }
        });
        
        limpar.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            v1.setText(null);
            v2.setText(null);
            v1.requestFocus();
        }
        });
        
        habili.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            res1.setEnabled(true);
            res2.setEnabled(true);
        }
        });
        desab.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            res1.setEnabled(false);
            res2.setEnabled(false);
        }
        });
        exibir.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            res1.setVisible(true);
            res2.setVisible(true);
        }
        });
        ocultar.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            res1.setVisible(false);
            res2.setVisible(false);
        }
        });
        fechar.addActionListener(
        
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           System.exit(0);
        }
        });
        
        //adicionando os icones a tela
        tela.add(txt1);
        tela.add(txt2);
        tela.add(res1);
        tela.add(res2);
        tela.add(pessoa);
        tela.add(v1);
        tela.add(v2);
        tela.add(soma);
        tela.add(menos);
        tela.add(div);
        tela.add(multi);
        tela.add(limpar);
        tela.add(habili);
        tela.add(desab);
        tela.add(ocultar);
        tela.add(exibir);
        tela.add(fechar);
        
        setResizable(false);
        setSize(600, 440);
        setVisible(true);
        setLocationRelativeTo(null);
        
        
        

    
    
}
    public static void main(String args[]){
        Main calc = new Main();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}









