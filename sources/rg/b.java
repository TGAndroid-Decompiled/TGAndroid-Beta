package rg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class b extends Drawable {
    public Drawable f54513a;
    public float f54514b;
    public int f54515c;

    public final void a(int i3) {
        if (this.f54515c != i3) {
            this.f54515c = i3;
            setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f54513a;
        Rect bounds = getBounds();
        float f10 = this.f54514b;
        if (f10 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f10)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f10)), (int) (((bounds.width() / 2.0f) * f10) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f10) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f54513a;
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
    public final void setAlpha(int i3) {
        this.f54513a.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f54513a.setColorFilter(colorFilter);
    }
}
