package pg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class c extends Drawable {
    public Drawable f46852a;
    public float f46853b;
    public int f46854c;

    public final void a(int i10) {
        if (this.f46854c != i10) {
            this.f46854c = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f46852a;
        Rect bounds = getBounds();
        float f7 = this.f46853b;
        if (f7 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f7)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f7)), (int) (((bounds.width() / 2.0f) * f7) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f7) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f46852a;
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
    public final void setAlpha(int i10) {
        this.f46852a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46852a.setColorFilter(colorFilter);
    }
}
