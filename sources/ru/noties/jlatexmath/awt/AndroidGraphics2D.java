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
    public void draw(Rectangle2D.Float r9) {
        this.paint.setStyle(Paint.Style.STROKE);
        Canvas canvas = this.canvas;
        float f9 = r9.f47468x;
        float f10 = r9.f47469y;
        canvas.drawRect(f9, f10, f9 + r9.f47467w, f10 + r9.h, this.paint);
    }

    @Override
    public void drawArc(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.paint.setStyle(Paint.Style.STROKE);
        this.rectF.set(i10, i11, i10 + i12, i11 + i13);
        this.canvas.drawArc(this.rectF, i14, i15, false, this.paint);
    }

    @Override
    public void drawChars(char[] cArr, int i10, int i11, int i12, int i13) {
        Font font = this.font;
        if (font != null) {
            this.paint.setTypeface(font.typeface());
            this.paint.setTextSize(this.font.size());
        }
        this.canvas.drawText(cArr, i10, i11, i12, i13, this.paint);
    }

    @Override
    public void fill(Rectangle2D.Float r9) {
        this.paint.setStyle(Paint.Style.FILL);
        Canvas canvas = this.canvas;
        float f9 = r9.f47468x;
        float f10 = r9.f47469y;
        canvas.drawRect(f9, f10, f9 + r9.f47467w, f10 + r9.h, this.paint);
    }

    @Override
    public void fillArc(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.paint.setStyle(Paint.Style.FILL);
        this.rectF.set(i10, i11, i10 + i12, i11 + i13);
        this.canvas.drawArc(this.rectF, i14, i15, false, this.paint);
    }

    @Override
    public void fillRect(int i10, int i11, int i12, int i13) {
        this.paint.setStyle(Paint.Style.FILL);
        this.canvas.drawRect(i10, i11, i10 + i12, i11 + i13, this.paint);
    }

    @Override
    public Color getColor() {
        if (this.color == null) {
            this.color = new Color(this.paint.getColor());
        }
        return this.color;
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
        if (this.stroke == null) {
            this.stroke = new BasicStroke(this.paint.getStrokeWidth(), 0, 0, this.paint.getStrokeMiter());
        }
        return this.stroke;
    }

    @Override
    public AffineTransform getTransform() {
        AffineTransform save = this.transform.save();
        this.transform = save;
        return save;
    }

    @Override
    public void rotate(double d) {
        this.canvas.rotate((float) Math.toDegrees(d));
    }

    @Override
    public void scale(double d, double d10) {
        this.transform.scale(d, d10);
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
            return;
        }
        throw new IllegalStateException("Supplied transform has different Canvas attached");
    }

    @Override
    public void translate(double d, double d10) {
        this.transform.translate((float) d, (float) d10);
    }

    @Override
    public void rotate(double d, double d10, double d11) {
        this.canvas.rotate((float) Math.toDegrees(d), (float) d10, (float) d11);
    }

    @Override
    public void draw(Line2D.Float r9) {
        this.paint.setStyle(Paint.Style.STROKE);
        this.canvas.drawLine((float) r9.f47461x1, (float) r9.f47463y1, (float) r9.f47462x2, (float) r9.f47464y2, this.paint);
    }

    @Override
    public void draw(RoundRectangle2D.Float r6) {
        this.paint.setStyle(Paint.Style.STROKE);
        RectF rectF = this.rectF;
        float f9 = r6.f47470x;
        float f10 = r6.f47471y;
        rectF.set(f9, f10, r6.width + f9, r6.height + f10);
        this.canvas.drawRoundRect(this.rectF, r6.arcwidth, r6.archeight, this.paint);
    }

    @Override
    public void setRenderingHints(RenderingHints renderingHints) {
    }

    @Override
    public void setRenderingHint(RenderingHints.Key key, Object obj) {
    }
}
