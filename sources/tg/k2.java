package tg;

import android.content.Context;
public final class k2 extends i0 {
    public final m2 f57413u0;

    public k2(m2 m2Var, Context context, float f10) {
        super(context, f10);
        this.f57413u0 = m2Var;
    }

    @Override
    public final void invalidate() {
        this.f57413u0.d.invalidate();
        super.invalidate();
    }
}
