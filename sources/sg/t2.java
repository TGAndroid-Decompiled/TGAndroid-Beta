package sg;

import android.content.Context;
public final class t2 extends p0 {
    public final v2 f48519t0;

    public t2(v2 v2Var, Context context, float f7) {
        super(context, f7);
        this.f48519t0 = v2Var;
    }

    @Override
    public final void invalidate() {
        this.f48519t0.d.invalidate();
        super.invalidate();
    }
}
