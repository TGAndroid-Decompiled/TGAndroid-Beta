package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f43273a;
    public int f43274b;
    public int f43275c = 255;

    public c(d6 d6Var) {
        int v02 = h6.v0(h6.f19148i6, d6Var);
        this.f43274b = v02;
        this.f43273a = h6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f43275c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43273a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f43275c != i10) {
            this.f43275c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
