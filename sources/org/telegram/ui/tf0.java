package org.telegram.ui;

import android.content.Context;
public final class tf0 extends org.telegram.ui.Components.dg {
    public final org.telegram.ui.Components.dg f50177n0;
    public final boolean f50178o0;
    public final dg0 f50179p0;

    public tf0(dg0 dg0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.dg dgVar, boolean z9) {
        super(i7, context, g6Var, false);
        this.f50179p0 = dg0Var;
        this.f50177n0 = dgVar;
        this.f50178o0 = z9;
    }

    @Override
    public final boolean b() {
        return this.f50177n0.b();
    }

    @Override
    public final boolean c() {
        return this.f50177n0.c();
    }

    @Override
    public final boolean d() {
        if (this.f50178o0 && this.f50179p0.f44967p0 && this.f32972r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f50177n0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f50177n0.j();
    }
}
