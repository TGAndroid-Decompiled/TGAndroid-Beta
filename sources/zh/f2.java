package zh;

import android.content.Context;
import android.graphics.Bitmap;
public final class f2 extends y6 {
    public final u7 H;
    public final a3 I;

    public f2(a3 a3Var, Context context, h2 h2Var, org.telegram.ui.ActionBar.f6 f6Var, u7 u7Var) {
        super(context, h2Var, f6Var);
        this.I = a3Var;
        this.H = u7Var;
    }

    @Override
    public final void b(boolean z10) {
        w2 w2Var = this.I.Q1;
        if (w2Var != null) {
            u7 u7Var = ((l7) w2Var).d;
            u7Var.f48939i1 = z10;
            u7Var.P();
        }
    }

    @Override
    public final Bitmap getPlayingBitmap() {
        return this.I.getPlayingBitmap();
    }
}
