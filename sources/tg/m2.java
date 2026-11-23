package tg;

import android.content.Context;
public final class m2 extends n0 {
    public final o2 f58085u0;

    public m2(o2 o2Var, Context context, float f10) {
        super(context, f10);
        this.f58085u0 = o2Var;
    }

    @Override
    public final void invalidate() {
        this.f58085u0.d.invalidate();
        super.invalidate();
    }
}
