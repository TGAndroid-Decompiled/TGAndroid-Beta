package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f48300a;
    public int f48301b;
    public int f48302c = 255;

    public c(d6 d6Var) {
        int w02 = h6.w0(h6.f20913i6, d6Var);
        this.f48301b = w02;
        this.f48300a = h6.Z(w02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f48302c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f48300a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f48302c != i10) {
            this.f48302c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
