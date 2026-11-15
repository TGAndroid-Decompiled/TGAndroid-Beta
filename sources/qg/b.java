package qg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class b extends Drawable {
    public Drawable f55567a;
    public float f55568b;
    public int f55569c;

    public final void a(int i7) {
        if (this.f55569c != i7) {
            this.f55569c = i7;
            setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f55567a;
        Rect bounds = getBounds();
        float f10 = this.f55568b;
        if (f10 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f10)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f10)), (int) (((bounds.width() / 2.0f) * f10) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f10) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f55567a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return null;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f55567a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55567a.setColorFilter(colorFilter);
    }
}
