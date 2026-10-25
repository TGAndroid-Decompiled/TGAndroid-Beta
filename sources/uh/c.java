package uh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f49909a;
    public int f49910b;
    public int f49911c = 255;

    public c(u6 u6Var) {
        int w02 = y6.w0(y6.f23446i6, u6Var);
        this.f49910b = w02;
        this.f49909a = y6.Z(w02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f49911c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f49909a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f49911c != i10) {
            this.f49911c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
