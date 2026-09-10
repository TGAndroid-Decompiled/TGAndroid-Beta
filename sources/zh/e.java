package zh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.vq;
import org.telegram.ui.nx;
public final class e extends vq {
    public final Drawable E;
    public final Drawable F;
    public final nx G;
    public int f48359y;

    public e(nx nxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = nxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        nx nxVar = this.G;
        int i12 = nxVar.f48598b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.M8;
        }
        int f7 = nxVar.f(i10);
        if (this.f48359y != f7) {
            this.f48359y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.P8;
            }
            int d = i0.a.d(0.1f, nxVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
