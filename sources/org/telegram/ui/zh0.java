package org.telegram.ui;

import android.content.Context;
public final class zh0 extends org.telegram.ui.Components.vg {
    public final org.telegram.ui.Components.vg f43760l0;
    public final boolean m0;
    public final mi0 f43761n0;

    public zh0(mi0 mi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.f43761n0 = mi0Var;
        this.f43760l0 = vgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f43760l0.d();
    }

    @Override
    public final boolean e() {
        return this.f43760l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f43761n0.f39274q0 && this.f31246r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f43760l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f43760l0.j();
    }
}
