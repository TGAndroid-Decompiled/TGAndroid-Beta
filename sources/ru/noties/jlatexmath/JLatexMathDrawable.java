package ru.noties.jlatexmath;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.scilab.forge.jlatexmath.TeXFormula;
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

    public JLatexMathDrawable(Builder builder) {
        TeXIcon build = new TeXFormula.TeXIconBuilder().setFGColor(new Color(builder.color)).setSize(builder.textSize).setStyle(0).build();
        this.icon = build;
        if (builder.insets != null) {
            build.setInsets(builder.insets);
        }
        this.align = builder.align;
        this.background = builder.background;
        this.graphics2D = new AndroidGraphics2D();
        int iconWidth = build.getIconWidth();
        this.iconWidth = iconWidth;
        int iconHeight = build.getIconHeight();
        this.iconHeight = iconHeight;
        setBounds(0, 0, iconWidth, iconHeight);
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    @Override
    public void draw(Canvas canvas) {
        float min;
        int i;
        Rect bounds = getBounds();
        int save = canvas.save();
        try {
            Drawable drawable = this.background;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            int width = bounds.width();
            int height = bounds.height();
            int i2 = this.iconWidth;
            if (i2 <= width && this.iconHeight <= height) {
                min = 1.0f;
            } else {
                min = Math.min(width / i2, height / this.iconHeight);
            }
            int i3 = (int) ((this.iconWidth * min) + 0.5f);
            int i4 = (height - ((int) ((this.iconHeight * min) + 0.5f))) / 2;
            int i5 = this.align;
            if (i5 == 1) {
                i = (width - i3) / 2;
            } else if (i5 == 2) {
                i = width - i3;
            } else {
                i = 0;
            }
            if (i4 != 0 || i != 0) {
                canvas.translate(i, i4);
            }
            if (Float.compare(min, 1.0f) != 0) {
                canvas.scale(min, min);
            }
            this.graphics2D.setCanvas(canvas);
            this.icon.paintIcon(null, this.graphics2D, 0, 0);
        } finally {
            canvas.restoreToCount(save);
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

        public Builder align(int i) {
            this.align = i;
            return this;
        }

        public Builder background(int i) {
            this.background = new ColorDrawable(i);
            return this;
        }

        public JLatexMathDrawable build() {
            return new JLatexMathDrawable(this);
        }

        public Builder color(int i) {
            this.color = i;
            return this;
        }

        public Builder padding(int i) {
            this.insets = new Insets(i, i, i, i);
            return this;
        }

        public Builder textSize(float f) {
            this.textSize = f;
            return this;
        }

        public Builder background(Drawable drawable) {
            this.background = drawable;
            return this;
        }

        public Builder padding(int i, int i2, int i3, int i4) {
            this.insets = new Insets(i2, i, i4, i3);
            return this;
        }

        @Deprecated
        public Builder fitCanvas(boolean z) {
            return this;
        }
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
