package ru.noties.jlatexmath;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXFormula.TeXIconBuilder;
import org.scilab.forge.jlatexmath.TeXIcon;
import ru.noties.jlatexmath.awt.AndroidGraphics2D;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Insets;

public class JLatexMathDrawable extends Drawable {
    private final int align;
    private final Drawable background;
    private final AndroidGraphics2D graphics2D;
    private final TeXIcon icon;
    private final int iconHeight;
    private final int iconWidth;

    @Override
    public int getOpacity() {
        return -1;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    JLatexMathDrawable(Builder builder) {
        TeXIcon teXIconBuild = new TeXFormula(builder.latex).new TeXIconBuilder().setFGColor(new Color(builder.color)).setSize(builder.textSize).setStyle(0).build();
        this.icon = teXIconBuild;
        if (builder.insets != null) {
            teXIconBuild.setInsets(builder.insets);
        }
        this.align = builder.align;
        this.background = builder.background;
        this.graphics2D = new AndroidGraphics2D();
        int iconWidth = teXIconBuild.getIconWidth();
        this.iconWidth = iconWidth;
        int iconHeight = teXIconBuild.getIconHeight();
        this.iconHeight = iconHeight;
        setBounds(0, 0, iconWidth, iconHeight);
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.background;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        int iSave = canvas.save();
        try {
            Drawable drawable = this.background;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            int iWidth = bounds.width();
            int iHeight = bounds.height();
            int i2 = this.iconWidth;
            float fMin = (i2 > iWidth || this.iconHeight > iHeight) ? Math.min(iWidth / i2, iHeight / this.iconHeight) : 1.0f;
            int i3 = (int) ((this.iconWidth * fMin) + 0.5f);
            int i4 = (iHeight - ((int) ((this.iconHeight * fMin) + 0.5f))) / 2;
            int i5 = this.align;
            if (i5 == 1) {
                i = (iWidth - i3) / 2;
            } else {
                i = i5 == 2 ? iWidth - i3 : 0;
            }
            if (i4 != 0 || i != 0) {
                canvas.translate(i, i4);
            }
            if (Float.compare(fMin, 1.0f) != 0) {
                canvas.scale(fMin, fMin);
            }
            this.graphics2D.setCanvas(canvas);
            this.icon.paintIcon(null, this.graphics2D, 0, 0);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return this.iconWidth;
    }

    @Override
    public int getIntrinsicHeight() {
        return this.iconHeight;
    }

    public TeXIcon icon() {
        return this.icon;
    }

    public static class Builder {
        private int align;
        private Drawable background;
        private int color = -16777216;
        private Insets insets;
        private final String latex;
        private float textSize;

        public Builder(String str) {
            this.latex = str;
        }

        public Builder textSize(float f) {
            this.textSize = f;
            return this;
        }

        public JLatexMathDrawable build() {
            return new JLatexMathDrawable(this);
        }
    }
}
