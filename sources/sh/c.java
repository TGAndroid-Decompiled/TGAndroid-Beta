package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f46865a;
    public int f46866b;
    public int f46867c = 255;

    public c(d6 d6Var) {
        int v02 = i6.v0(i6.f20908i6, d6Var);
        this.f46866b = v02;
        this.f46865a = i6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f46867c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f46865a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f46867c != i10) {
            this.f46867c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
