package org.telegram.ui;

import android.content.Context;
public final class uf0 extends org.telegram.ui.Components.ug {
    public final eg0 A0;
    public final org.telegram.ui.Components.ug f52565y0;
    public final boolean f52566z0;

    public uf0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ug ugVar, boolean z10) {
        super(i7, context, h6Var, false);
        this.A0 = eg0Var;
        this.f52565y0 = ugVar;
        this.f52566z0 = z10;
    }

    @Override
    public final boolean b() {
        return this.f52565y0.b();
    }

    @Override
    public final boolean c() {
        return this.f52565y0.c();
    }

    @Override
    public final boolean d() {
        if (this.f52566z0 && this.A0.f47290u0 && this.f40356w <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f52565y0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f52565y0.j();
    }
}
