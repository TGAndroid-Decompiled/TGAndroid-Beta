package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f42986a;
    public int f42987b;
    public int f42988c = 255;

    public c(e6 e6Var) {
        int v02 = i6.v0(i6.f18926i6, e6Var);
        this.f42987b = v02;
        this.f42986a = i6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f42988c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42986a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f42988c != i10) {
            this.f42988c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
