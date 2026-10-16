package org.telegram.ui;

import android.content.Context;
public final class ti0 extends org.telegram.ui.Components.wg {
    public final org.telegram.ui.Components.wg f40121l0;
    public final boolean m0;
    public final gj0 f40122n0;

    public ti0(gj0 gj0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.wg wgVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.f40122n0 = gj0Var;
        this.f40121l0 = wgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f40121l0.d();
    }

    @Override
    public final boolean e() {
        return this.f40121l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f40122n0.f36252q0 && this.f30562r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f40121l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f40121l0.j();
    }
}
