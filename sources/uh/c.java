package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f56921a;
    public int f56922b;
    public int f56923c = 255;

    public c(g6 g6Var) {
        int w02 = l6.w0(l6.f27957i6, g6Var);
        this.f56922b = w02;
        this.f56921a = l6.a0(w02, 0, 0);
    }

    public abstract void a(int i7);

    @Override
    public final int getAlpha() {
        return this.f56923c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f56921a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f56923c != i7) {
            this.f56923c = i7;
            a(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
