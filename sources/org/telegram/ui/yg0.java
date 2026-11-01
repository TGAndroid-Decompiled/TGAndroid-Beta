package org.telegram.ui;

import android.content.Context;
public final class yg0 extends org.telegram.ui.Components.zf {
    public final org.telegram.ui.Components.zf f43663n0;
    public final boolean f43664o0;
    public final ih0 f43665p0;

    public yg0(ih0 ih0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.zf zfVar, boolean z10) {
        super(i10, context, p6Var, false);
        this.f43665p0 = ih0Var;
        this.f43663n0 = zfVar;
        this.f43664o0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f43663n0.d();
    }

    @Override
    public final boolean e() {
        return this.f43663n0.e();
    }

    @Override
    public final boolean f() {
        if (this.f43664o0 && this.f43665p0.f38077p0 && this.f33142r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f43663n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f43663n0.j();
    }
}
