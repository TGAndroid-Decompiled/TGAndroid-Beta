package org.telegram.ui;

import android.content.Context;
public final class vf0 extends org.telegram.ui.Components.sg {
    public final fg0 A0;
    public final org.telegram.ui.Components.sg f52763y0;
    public final boolean f52764z0;

    public vf0(fg0 fg0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.sg sgVar, boolean z10) {
        super(i7, context, i6Var, false);
        this.A0 = fg0Var;
        this.f52763y0 = sgVar;
        this.f52764z0 = z10;
    }

    @Override
    public final boolean b() {
        return this.f52763y0.b();
    }

    @Override
    public final boolean c() {
        return this.f52763y0.c();
    }

    @Override
    public final boolean d() {
        if (this.f52764z0 && this.A0.f47645u0 && this.f39647w <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f52763y0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f52763y0.j();
    }
}
