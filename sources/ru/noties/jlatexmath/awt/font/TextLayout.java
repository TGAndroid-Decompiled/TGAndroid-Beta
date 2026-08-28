package ru.noties.jlatexmath.awt.font;

import android.graphics.Paint;
import android.graphics.Rect;
import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
public class TextLayout {
    private final Rectangle2D bounds;
    private final char[] chars;
    private final Font font;

    public TextLayout(String str, Font font, FontRenderContext fontRenderContext) {
        this.chars = str.toCharArray();
        this.font = font;
        Paint paint = new Paint(1);
        paint.setTypeface(font.typeface());
        paint.setTextSize(font.size());
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        this.bounds = new Rectangle2D.Float(rect.left, rect.top, rect.width(), rect.height());
    }

    public void draw(Graphics2D graphics2D, int i9, int i10) {
        boolean z10;
        Font font = graphics2D.getFont();
        Font font2 = this.font;
        if (font2 != font) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            graphics2D.setFont(font2);
        }
        char[] cArr = this.chars;
        graphics2D.drawChars(cArr, 0, cArr.length, i9, i10);
        if (z10) {
            graphics2D.setFont(font);
        }
    }

    public Rectangle2D getBounds() {
        return this.bounds;
    }
}
