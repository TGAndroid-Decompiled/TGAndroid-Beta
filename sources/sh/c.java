package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f43244a;
    public int f43245b;
    public int f43246c = 255;

    public c(e6 e6Var) {
        int v02 = j6.v0(j6.f19152i6, e6Var);
        this.f43245b = v02;
        this.f43244a = j6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f43246c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43244a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f43246c != i10) {
            this.f43246c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
