package org.telegram.ui;

import android.content.Context;
public final class ri0 extends org.telegram.ui.Components.zg {
    public final org.telegram.ui.Components.zg f41663l0;
    public final boolean m0;
    public final ej0 f41664n0;

    public ri0(ej0 ej0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.zg zgVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.f41664n0 = ej0Var;
        this.f41663l0 = zgVar;
        this.m0 = z10;
    }

    @Override
    public final boolean d() {
        return this.f41663l0.d();
    }

    @Override
    public final boolean e() {
        return this.f41663l0.e();
    }

    @Override
    public final boolean f() {
        if (this.m0 && this.f41664n0.f37151q0 && this.f33377r <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.f41663l0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.f41663l0.j();
    }
}
