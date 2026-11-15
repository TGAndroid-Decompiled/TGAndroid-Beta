package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f58419a;
    public int f58420b;
    public int f58421c = 255;

    public c(e6 e6Var) {
        int w02 = j6.w0(j6.f28941i6, e6Var);
        this.f58420b = w02;
        this.f58419a = j6.a0(w02, 0, 0);
    }

    public abstract void a(int i7);

    @Override
    public final int getAlpha() {
        return this.f58421c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f58419a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f58421c != i7) {
            this.f58421c = i7;
            a(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
