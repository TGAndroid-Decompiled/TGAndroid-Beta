package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f43260a;
    public int f43261b;
    public int f43262c = 255;

    public c(d6 d6Var) {
        int v02 = h6.v0(h6.f19134i6, d6Var);
        this.f43261b = v02;
        this.f43260a = h6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f43262c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43260a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f43262c != i10) {
            this.f43262c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
