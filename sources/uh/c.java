package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f59111a;
    public int f59112b;
    public int f59113c = 255;

    public c(i6 i6Var) {
        int w02 = n6.w0(n6.f29543i6, i6Var);
        this.f59112b = w02;
        this.f59111a = n6.a0(w02, 0, 0);
    }

    public abstract void a(int i7);

    @Override
    public final int getAlpha() {
        return this.f59113c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f59111a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f59113c != i7) {
            this.f59113c = i7;
            a(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
