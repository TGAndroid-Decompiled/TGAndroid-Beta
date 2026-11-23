package tg;

import android.content.Context;
public final class j2 extends j0 {
    public final l2 f58028u0;

    public j2(l2 l2Var, Context context, float f10) {
        super(context, f10);
        this.f58028u0 = l2Var;
    }

    @Override
    public final void invalidate() {
        this.f58028u0.d.invalidate();
        super.invalidate();
    }
}
