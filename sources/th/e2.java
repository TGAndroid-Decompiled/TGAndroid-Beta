package th;

import android.content.Context;
import android.graphics.Bitmap;
public final class e2 extends s6 {
    public final o7 H;
    public final z2 I;

    public e2(z2 z2Var, Context context, g2 g2Var, org.telegram.ui.ActionBar.p6 p6Var, o7 o7Var) {
        super(context, g2Var, p6Var);
        this.I = z2Var;
        this.H = o7Var;
    }

    @Override
    public final void b(boolean z10) {
        v2 v2Var = this.I.f49797z1;
        if (v2Var != null) {
            o7 o7Var = ((f7) v2Var).d;
            o7Var.f49325i1 = z10;
            o7Var.d0();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
