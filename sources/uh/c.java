package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f56817a;
    public int f56818b;
    public int f56819c = 255;

    public c(f6 f6Var) {
        int w02 = k6.w0(k6.f27940i6, f6Var);
        this.f56818b = w02;
        this.f56817a = k6.a0(w02, 0, 0);
    }

    public abstract void a(int i7);

    @Override
    public final int getAlpha() {
        return this.f56819c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f56817a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f56819c != i7) {
            this.f56819c = i7;
            a(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
