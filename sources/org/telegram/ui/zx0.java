package org.telegram.ui;
public final class zx0 implements z4.e {
    public int f44249a;
    public final ay0 f44250b;

    public zx0(ay0 ay0Var) {
        this.f44250b = ay0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        ay0 ay0Var = this.f44250b;
        ProfileActivity profileActivity = ay0Var.f35908n;
        int k10 = profileActivity.f33864n0.D0.k(i10);
        if (this.f44249a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ay0Var.a(z10);
        this.f44249a = k10;
        if (profileActivity.f33884q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.i0.h3(new wv0(ay0Var, 6), 500L);
        } else {
            ay0Var.c();
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ei.r rVar;
        rVar = ((org.telegram.ui.ActionBar.k2) this.f44250b.f35908n).glassEngine;
        rVar.g();
    }

    @Override
    public final void c(int i10) {
    }
}
