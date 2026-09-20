package qg;

import android.content.Context;
public final class r2 extends p0 {
    public final t2 f41925t0;

    public r2(t2 t2Var, Context context, float f7) {
        super(context, f7);
        this.f41925t0 = t2Var;
    }

    @Override
    public final void invalidate() {
        this.f41925t0.d.invalidate();
        super.invalidate();
    }
}
