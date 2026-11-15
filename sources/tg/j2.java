package tg;

import android.content.Context;
public final class j2 extends i0 {
    public final l2 f57405u0;

    public j2(l2 l2Var, Context context, float f10) {
        super(context, f10);
        this.f57405u0 = l2Var;
    }

    @Override
    public final void invalidate() {
        this.f57405u0.d.invalidate();
        super.invalidate();
    }
}
