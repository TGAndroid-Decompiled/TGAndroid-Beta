package ru.noties.jlatexmath.awt;

import ru.noties.jlatexmath.awt.RenderingHints;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
import ru.noties.jlatexmath.awt.geom.Line2D$Float;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
import ru.noties.jlatexmath.awt.geom.RoundRectangle2D$Float;

public interface Graphics2D extends Graphics {
    void draw(Line2D$Float line2D$Float);

    void draw(Rectangle2D.Float r1);

    void draw(RoundRectangle2D$Float roundRectangle2D$Float);

    void drawArc(int i, int i2, int i3, int i4, int i5, int i6);

    void drawChars(char[] cArr, int i, int i2, int i3, int i4);

    void fill(Rectangle2D.Float r1);

    void fillArc(int i, int i2, int i3, int i4, int i5, int i6);

    Color getColor();

    Font getFont();

    RenderingHints getRenderingHints();

    Stroke getStroke();

    AffineTransform getTransform();

    void rotate(double d);

    void rotate(double d, double d2, double d3);

    void scale(double d, double d2);

    void setColor(Color color);

    void setFont(Font font);

    void setRenderingHint(RenderingHints.Key key, Object obj);

    void setRenderingHints(RenderingHints renderingHints);

    void setStroke(Stroke stroke);

    void setTransform(AffineTransform affineTransform);

    void translate(double d, double d2);
}
