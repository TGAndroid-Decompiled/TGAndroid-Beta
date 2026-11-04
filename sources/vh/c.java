package vh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.y;
public abstract class c extends Drawable {
    public final y f56953a;
    public int f56954b;
    public int f56955c = 255;

    public c(e6 e6Var) {
        int w02 = k6.w0(k6.f27972i6, e6Var);
        this.f56954b = w02;
        this.f56953a = k6.a0(w02, 0, 0);
    }

    public abstract void a(int i3);

    @Override
    public final int getAlpha() {
        return this.f56955c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f56953a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i3) {
        if (this.f56955c != i3) {
            this.f56955c = i3;
            a(i3);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
