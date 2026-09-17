package sh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
public abstract class c extends Drawable {
    public final z f43008a;
    public int f43009b;
    public int f43010c = 255;

    public c(f6 f6Var) {
        int v02 = j6.v0(j6.f18952i6, f6Var);
        this.f43009b = v02;
        this.f43008a = j6.Y(v02, 0, 0);
    }

    public abstract void a(int i10);

    @Override
    public final int getAlpha() {
        return this.f43010c;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43008a.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f43010c != i10) {
            this.f43010c = i10;
            a(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
