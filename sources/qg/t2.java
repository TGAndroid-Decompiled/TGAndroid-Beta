package qg;

import android.content.Context;
public final class t2 extends r0 {
    public final v2 f41653t0;

    public t2(v2 v2Var, Context context, float f7) {
        super(context, f7);
        this.f41653t0 = v2Var;
    }

    @Override
    public final void invalidate() {
        this.f41653t0.d.invalidate();
        super.invalidate();
    }
}
