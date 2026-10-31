package th;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.eq;
import org.telegram.ui.uw;
public final class e extends eq {
    public int D;
    public final Drawable E;
    public final Drawable F;
    public final uw G;

    public e(uw uwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = uwVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        uw uwVar = this.G;
        int i12 = uwVar.f49197b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.t6.f21206s8;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.M8;
        }
        int f7 = uwVar.f(i10);
        if (this.D != f7) {
            this.D = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.t6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.P8;
            }
            int f10 = i0.b.f(0.1f, uwVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
