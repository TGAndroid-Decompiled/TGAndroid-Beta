package ru.noties.jlatexmath.awt;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import ru.noties.jlatexmath.awt.RenderingHints;
import ru.noties.jlatexmath.awt.font.FontRenderContext;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
import ru.noties.jlatexmath.awt.geom.Line2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
import ru.noties.jlatexmath.awt.geom.RoundRectangle2D;
public class AndroidGraphics2D implements Graphics2D {
    private Canvas canvas;
    private Color color;
    private Font font;
    private final Paint paint;
    private final RectF rectF = new RectF();
    private Stroke stroke;
    private AffineTransform transform;

    public AndroidGraphics2D() {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override
    public void draw(RoundRectangle2D.Float r6) {
        this.paint.setStyle(Paint.Style.STROKE);
        RectF rectF = this.rectF;
        float f = r6.x;
        float f2 = r6.y;
        rectF.set(f, f2, r6.width + f, r6.height + f2);
        this.canvas.drawRoundRect(this.rectF, r6.arcwidth, r6.archeight, this.paint);
    }

    @Override
    public void drawArc(int i, int i2, int i3, int i4, int i5, int i6) {
        this.paint.setStyle(Paint.Style.STROKE);
        this.rectF.set(i, i2, i + i3, i2 + i4);
        this.canvas.drawArc(this.rectF, i5, i6, false, this.paint);
    }

    @Override
    public void drawChars(char[] cArr, int i, int i2, int i3, int i4) {
        Font font = this.font;
        if (font != null) {
            this.paint.setTypeface(font.typeface());
            this.paint.setTextSize(this.font.size());
        }
        this.canvas.drawText(cArr, i, i2, i3, i4, this.paint);
    }

    @Override
    public void fill(Rectangle2D.Float r9) {
        this.paint.setStyle(Paint.Style.FILL);
        Canvas canvas = this.canvas;
        float f = r9.x;
        float f2 = r9.y;
        canvas.drawRect(f, f2, f + r9.w, f2 + r9.h, this.paint);
    }

    @Override
    public void fillArc(int i, int i2, int i3, int i4, int i5, int i6) {
        this.paint.setStyle(Paint.Style.FILL);
        this.rectF.set(i, i2, i + i3, i2 + i4);
        this.canvas.drawArc(this.rectF, i5, i6, false, this.paint);
    }

    @Override
    public void fillRect(int i, int i2, int i3, int i4) {
        this.paint.setStyle(Paint.Style.FILL);
        this.canvas.drawRect(i, i2, i + i3, i2 + i4, this.paint);
    }

    @Override
    public Color getColor() {
        Color color = this.color;
        if (color == null) {
            Color color2 = new Color(this.paint.getColor());
            this.color = color2;
            return color2;
        }
        return color;
    }

    @Override
    public Font getFont() {
        return this.font;
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        return null;
    }

    @Override
    public RenderingHints getRenderingHints() {
        return null;
    }

    @Override
    public Stroke getStroke() {
        Stroke stroke = this.stroke;
        if (stroke == null) {
            BasicStroke basicStroke = new BasicStroke(this.paint.getStrokeWidth(), 0, 0, this.paint.getStrokeMiter());
            this.stroke = basicStroke;
            return basicStroke;
        }
        return stroke;
    }

    @Override
    public AffineTransform getTransform() {
        AffineTransform save = this.transform.save();
        this.transform = save;
        return save;
    }

    @Override
    public void rotate(double d, double d2, double d3) {
        this.canvas.rotate((float) Math.toDegrees(d), (float) d2, (float) d3);
    }

    @Override
    public void scale(double d, double d2) {
        this.transform.scale(d, d2);
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
        this.transform = AffineTransform.create(canvas);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
        this.paint.setColor(color.getColorInt());
    }

    @Override
    public void setFont(Font font) {
        this.font = font;
    }

    @Override
    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
        this.paint.setStrokeWidth(stroke.width());
    }

    @Override
    public void setTransform(AffineTransform affineTransform) {
        if (this.canvas == affineTransform.getCanvas()) {
            this.transform = affineTransform.restore();
        } else {
            dq9.m("Supplied transform has different Canvas attached");
        }
    }

    @Override
    public void translate(double d, double d2) {
        this.transform.translate((float) d, (float) d2);
    }

    @Override
    public void rotate(double d) {
        this.canvas.rotate((float) Math.toDegrees(d));
    }

    @Override
    public void draw(Line2D.Float r9) {
        this.paint.setStyle(Paint.Style.STROKE);
        this.canvas.drawLine((float) r9.x1, (float) r9.y1, (float) r9.x2, (float) r9.y2, this.paint);
    }

    @Override
    public void draw(Rectangle2D.Float r9) {
        this.paint.setStyle(Paint.Style.STROKE);
        Canvas canvas = this.canvas;
        float f = r9.x;
        float f2 = r9.y;
        canvas.drawRect(f, f2, f + r9.w, f2 + r9.h, this.paint);
    }

    @Override
    public void setRenderingHints(RenderingHints renderingHints) {
    }

    @Override
    public void setRenderingHint(RenderingHints.Key key, Object obj) {
    }
}
