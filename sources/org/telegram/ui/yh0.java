package org.telegram.ui;

import android.content.Context;
public final class yh0 extends org.telegram.ui.Components.lg {
    public final org.telegram.ui.Components.lg f44874h0;
    public final boolean f44875i0;
    public final li0 f44876j0;

    public yh0(li0 li0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.lg lgVar, boolean z10) {
        super(i9, context, b6Var, false);
        this.f44876j0 = li0Var;
        this.f44874h0 = lgVar;
        this.f44875i0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f44874h0.d();
    }

    @Override
    public final boolean e() {
        return this.f44874h0.e();
    }

    @Override
    public final boolean f() {
        if (this.f44875i0 && this.f44876j0.m0 && this.f30444r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f44874h0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f44874h0.j();
    }
}
