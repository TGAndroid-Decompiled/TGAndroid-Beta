package th;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f45831a;
    public int f45832b;
    public int f45833c = 255;

    public c(c6 c6Var) {
        int w02 = g6.w0(g6.f19990i6, c6Var);
        this.f45832b = w02;
        this.f45831a = g6.Z(w02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f45833c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f45831a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f45833c != i10) {
            this.f45833c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
