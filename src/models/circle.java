package models;
import java.awt.*;

public class circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int currentAngle;

    public circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.currentAngle = 0;
    }

    public void update() {
        currentAngle++;
        if (currentAngle >= 360) {
            currentAngle = 0;
        }
    }

    public Point getPoint() {
        double radian = Math.toRadians(currentAngle);
        int x = (int) (centerX + radius * Math.cos(radian));
        int y = (int) (centerY + radius * Math.sin(radian));
        return new Point(x, y);
    }

    public void draw(Graphics2D g2d) {
        Point point = getPoint();
        g2d.setColor(Color.BLACK);
        g2d.drawLine(point.x - 1, point.y - 1, point.x, point.y);
    }
}
