package yf;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class c extends Drawable {
    public Drawable f50535a;
    public float f50536b;
    public int f50537c;

    public final void a(int i10) {
        if (this.f50537c != i10) {
            this.f50537c = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f50535a;
        Rect bounds = getBounds();
        float f9 = this.f50536b;
        if (f9 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f9)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f9)), (int) (((bounds.width() / 2.0f) * f9) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f9) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f50535a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50535a.setColorFilter(colorFilter);
    }
}
