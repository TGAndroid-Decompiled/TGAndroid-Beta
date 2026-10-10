package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f48220a;
    public int f48221b;
    public int f48222c = 255;

    public c(e6 e6Var) {
        int w02 = i6.w0(i6.f20892i6, e6Var);
        this.f48221b = w02;
        this.f48220a = i6.Z(w02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f48222c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f48220a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f48222c != i10) {
            this.f48222c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
