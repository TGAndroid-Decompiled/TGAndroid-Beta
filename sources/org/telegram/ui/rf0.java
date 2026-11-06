package org.telegram.ui;

import android.content.Context;
public final class rf0 extends org.telegram.ui.Components.dg {
    public final org.telegram.ui.Components.dg f49507n0;
    public final boolean f49508o0;
    public final bg0 f49509p0;

    public rf0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.dg dgVar, boolean z9) {
        super(i7, context, f6Var, false);
        this.f49509p0 = bg0Var;
        this.f49507n0 = dgVar;
        this.f49508o0 = z9;
    }

    @Override
    public final boolean b() {
        return this.f49507n0.b();
    }

    @Override
    public final boolean c() {
        return this.f49507n0.c();
    }

    @Override
    public final boolean d() {
        if (this.f49508o0 && this.f49509p0.f44335p0 && this.f32894r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f49507n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f49507n0.j();
    }
}
