import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CreaterStickers {

    public void newStickers () throws Exception {
        // Leitura do Arquivo
        BufferedImage imageOrigianl = ImageIO.read(new File("Files/filme.jpg"));

        // criar nova imagem com transparência e novo tamanho
        int largura = imageOrigianl.getWidth();
        int altura  = imageOrigianl.getHeight();
        int novaAltura = altura + 200;

        BufferedImage newImage = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT) ;
        
        // copiar imagem original p/ nova imagem
        Graphics2D grafico = (Graphics2D) newImage.getGraphics();
        grafico.drawImage(imageOrigianl,null, 0, 0);
        
        //Escrever a frase
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        grafico.setColor(Color.YELLOW);
        grafico.setFont(fonte);
        grafico.drawString("Top", largura / 2, novaAltura - 100);
        //Gravar o arquivo
        ImageIO.write(newImage, "png", new File("Files/Sticker.png"));
    }

    public static void main(String[] args) throws Exception {
        var criador = new CreaterStickers();
        criador.newStickers();
        System.out.println("Arquivo criado com sucesso !");
    }
}