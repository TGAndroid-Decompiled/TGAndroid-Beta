package org.telegram.ui;

import android.content.Context;
public final class xh0 extends org.telegram.ui.Components.og {
    public final org.telegram.ui.Components.og f44594h0;
    public final boolean f44595i0;
    public final ki0 f44596j0;

    public xh0(ki0 ki0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.og ogVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.f44596j0 = ki0Var;
        this.f44594h0 = ogVar;
        this.f44595i0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f44594h0.d();
    }

    @Override
    public final boolean e() {
        return this.f44594h0.e();
    }

    @Override
    public final boolean f() {
        if (this.f44595i0 && this.f44596j0.m0 && this.f31358r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f44594h0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f44594h0.j();
    }
}
