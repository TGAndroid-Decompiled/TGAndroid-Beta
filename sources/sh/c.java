package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f42938a;
    public int f42939b;
    public int f42940c = 255;

    public c(d6 d6Var) {
        int v02 = h6.v0(h6.f18878i6, d6Var);
        this.f42939b = v02;
        this.f42938a = h6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f42940c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42938a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f42940c != i10) {
            this.f42940c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
