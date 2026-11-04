package ug;

import android.content.Context;
public final class h2 extends h0 {
    public final j2 f56054u0;

    public h2(j2 j2Var, Context context, float f10) {
        super(context, f10);
        this.f56054u0 = j2Var;
    }

    @Override
    public final void invalidate() {
        this.f56054u0.d.invalidate();
        super.invalidate();
    }
}
