package qg;

import android.content.Context;
public final class q2 extends o0 {
    public final s2 f41877t0;

    public q2(s2 s2Var, Context context, float f7) {
        super(context, f7);
        this.f41877t0 = s2Var;
    }

    @Override
    public final void invalidate() {
        this.f41877t0.d.invalidate();
        super.invalidate();
    }
}
