import javax.swing.JPanel;
import java.awt.*;

// 파넬 클래스
public class GamePanel extends JPanel{

    final int originalTileSize = 16;    //픽셀 개수 현재:16px
    final int scale = 3;                //픽셀 그림 축적.   ---16*3

    final int tileSize = originalTileSize * scale;  //타일 크기 48*48 타일
    final int maxScreenCol = 16;         //
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;    // 768 pixels
    final int screenHeight = tileSize * maxScreenRow;   // 48*12 = 576 pixels

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
}