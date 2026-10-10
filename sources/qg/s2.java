package qg;

import android.content.Context;
public final class s2 extends o0 {
    public final u2 f46598t0;

    public s2(u2 u2Var, Context context, float f7) {
        super(context, f7);
        this.f46598t0 = u2Var;
    }

    @Override
    public final void invalidate() {
        this.f46598t0.d.invalidate();
        super.invalidate();
    }
}
