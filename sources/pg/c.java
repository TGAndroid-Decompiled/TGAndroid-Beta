package pg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class c extends Drawable {
    public Drawable f46849a;
    public float f46850b;
    public int f46851c;

    public final void a(int i10) {
        if (this.f46851c != i10) {
            this.f46851c = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f46849a;
        Rect bounds = getBounds();
        float f7 = this.f46850b;
        if (f7 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f7)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f7)), (int) (((bounds.width() / 2.0f) * f7) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f7) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f46849a;
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
        this.f46849a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46849a.setColorFilter(colorFilter);
    }
}
