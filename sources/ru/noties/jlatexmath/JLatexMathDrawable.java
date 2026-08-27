package ru.noties.jlatexmath;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXFormula.TeXIconBuilder;
import org.scilab.forge.jlatexmath.TeXIcon;
import ru.noties.jlatexmath.awt.AndroidGraphics2D;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Insets;

public class JLatexMathDrawable extends Drawable {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 2;
    private final int align;
    private final Drawable background;
    private final AndroidGraphics2D graphics2D;
    private final TeXIcon icon;
    private final int iconHeight;
    private final int iconWidth;

    @Retention(RetentionPolicy.CLASS)
    public @interface Align {
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

        public Builder align(int i10) {
            this.align = i10;
            return this;
        }

        public Builder background(Drawable drawable) {
            this.background = drawable;
            return this;
        }

        public JLatexMathDrawable build() {
            return new JLatexMathDrawable(this);
        }

        public Builder color(int i10) {
            this.color = i10;
            return this;
        }

        public Builder padding(int i10) {
            this.insets = new Insets(i10, i10, i10, i10);
            return this;
        }

        public Builder textSize(float f10) {
            this.textSize = f10;
            return this;
        }

        public Builder background(int i10) {
            this.background = new ColorDrawable(i10);
            return this;
        }

        public Builder padding(int i10, int i11, int i12, int i13) {
            this.insets = new Insets(i11, i10, i13, i12);
            return this;
        }

        @Deprecated
        public Builder fitCanvas(boolean z10) {
            return this;
        }
    }

    public JLatexMathDrawable(Builder builder) {
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

    public static Builder builder(String str) {
        return new Builder(str);
    }

    @Override
    public void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        int iSave = canvas.save();
        try {
            Drawable drawable = this.background;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            int iWidth = bounds.width();
            int iHeight = bounds.height();
            int i11 = this.iconWidth;
            float fMin = (i11 > iWidth || this.iconHeight > iHeight) ? Math.min(iWidth / i11, iHeight / this.iconHeight) : 1.0f;
            int i12 = (int) ((this.iconWidth * fMin) + 0.5f);
            int i13 = (iHeight - ((int) ((this.iconHeight * fMin) + 0.5f))) / 2;
            int i14 = this.align;
            if (i14 == 1) {
                i10 = (iWidth - i12) / 2;
            } else {
                i10 = i14 == 2 ? iWidth - i12 : 0;
            }
            if (i13 != 0 || i10 != 0) {
                canvas.translate(i10, i13);
            }
            if (Float.compare(fMin, 1.0f) != 0) {
                canvas.scale(fMin, fMin);
            }
            this.graphics2D.setCanvas(canvas);
            this.icon.paintIcon(null, this.graphics2D, 0, 0);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return this.iconHeight;
    }

    @Override
    public int getIntrinsicWidth() {
        return this.iconWidth;
    }

    @Override
    public int getOpacity() {
        return -1;
    }

    public TeXIcon icon() {
        return this.icon;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.background;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public void setAlpha(int i10) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
