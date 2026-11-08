package qg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class c extends Drawable {
    public Drawable f54123a;
    public float f54124b;
    public int f54125c;

    public final void a(int i7) {
        if (this.f54125c != i7) {
            this.f54125c = i7;
            setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f54123a;
        Rect bounds = getBounds();
        float f10 = this.f54124b;
        if (f10 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f10)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f10)), (int) (((bounds.width() / 2.0f) * f10) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f10) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f54123a;
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
        this.f54123a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f54123a.setColorFilter(colorFilter);
    }
}
