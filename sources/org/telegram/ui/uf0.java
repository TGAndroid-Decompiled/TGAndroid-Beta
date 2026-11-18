package org.telegram.ui;

import android.content.Context;
public final class uf0 extends org.telegram.ui.Components.sg {
    public final eg0 A0;
    public final org.telegram.ui.Components.sg f52547y0;
    public final boolean f52548z0;

    public uf0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.sg sgVar, boolean z10) {
        super(i7, context, i6Var, false);
        this.A0 = eg0Var;
        this.f52547y0 = sgVar;
        this.f52548z0 = z10;
    }

    @Override
    public final boolean b() {
        return this.f52547y0.b();
    }

    @Override
    public final boolean c() {
        return this.f52547y0.c();
    }

    @Override
    public final boolean d() {
        if (this.f52548z0 && this.A0.f47250u0 && this.f39647w <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f52547y0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f52547y0.j();
    }
}
