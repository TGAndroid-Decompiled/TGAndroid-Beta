package tg;

import android.content.Context;
public final class g2 extends i0 {
    public final i2 f55614t0;

    public g2(i2 i2Var, Context context, float f10) {
        super(context, f10);
        this.f55614t0 = i2Var;
    }

    @Override
    public final void invalidate() {
        this.f55614t0.d.invalidate();
        super.invalidate();
    }
}
