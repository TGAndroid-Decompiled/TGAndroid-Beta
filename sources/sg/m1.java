package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bb0;
public final class m1 extends bi.d {
    public final p1 f41955h0;

    public m1(p1 p1Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f41955h0 = p1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        p1 p1Var = this.f41955h0;
        if (p1Var.f41985t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.f41985t0 = f7;
        if (z10) {
            p1Var.f41986u0 = new bb0(p1Var, 2);
            p1Var.g0(false);
        }
        return f7;
    }
}
