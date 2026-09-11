package rg;

import android.content.Context;
public final class t2 extends q0 {
    public final v2 f45498t0;

    public t2(v2 v2Var, Context context, float f7) {
        super(context, f7);
        this.f45498t0 = v2Var;
    }

    @Override
    public final void invalidate() {
        this.f45498t0.d.invalidate();
        super.invalidate();
    }
}
