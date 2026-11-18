package tg;

import android.content.Context;
public final class i2 extends i0 {
    public final k2 f57943u0;

    public i2(k2 k2Var, Context context, float f10) {
        super(context, f10);
        this.f57943u0 = k2Var;
    }

    @Override
    public final void invalidate() {
        this.f57943u0.d.invalidate();
        super.invalidate();
    }
}
