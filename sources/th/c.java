package th;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f47644a;
    public int f47645b;
    public int f47646c = 255;

    public c(g6 g6Var) {
        int w02 = k6.w0(k6.f21273i6, g6Var);
        this.f47645b = w02;
        this.f47644a = k6.Z(w02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f47646c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f47644a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f47646c != i10) {
            this.f47646c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
