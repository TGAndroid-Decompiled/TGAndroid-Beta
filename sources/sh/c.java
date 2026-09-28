package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f43275a;
    public int f43276b;
    public int f43277c = 255;

    public c(d6 d6Var) {
        int v02 = h6.v0(h6.f19149i6, d6Var);
        this.f43276b = v02;
        this.f43275a = h6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f43277c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43275a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f43277c != i10) {
            this.f43277c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
