package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f58994a;
    public int f58995b;
    public int f58996c = 255;

    public c(h6 h6Var) {
        int w02 = m6.w0(m6.f29439i6, h6Var);
        this.f58995b = w02;
        this.f58994a = m6.a0(w02, 0, 0);
    }

    public abstract void a(int i7);

    @Override
    public final int getAlpha() {
        return this.f58996c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f58994a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f58996c != i7) {
            this.f58996c = i7;
            a(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
