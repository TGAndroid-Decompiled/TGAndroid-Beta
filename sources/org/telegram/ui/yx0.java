package org.telegram.ui;
public final class yx0 implements z4.e {
    public int f43743a;
    public final zx0 f43744b;

    public yx0(zx0 zx0Var) {
        this.f43744b = zx0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        zx0 zx0Var = this.f43744b;
        ProfileActivity profileActivity = zx0Var.f44251n;
        int k10 = profileActivity.f33871n0.D0.k(i10);
        if (this.f43743a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zx0Var.a(z10);
        this.f43743a = k10;
        if (profileActivity.f33891q0 == null) {
            return;
        }
        if (profileActivity.S0.x()) {
            org.telegram.messenger.i0.h3(new vv0(zx0Var, 6), 500L);
        } else {
            zx0Var.c();
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ei.r rVar;
        rVar = ((org.telegram.ui.ActionBar.k2) this.f43744b.f44251n).glassEngine;
        rVar.g();
    }

    @Override
    public final void c(int i10) {
    }
}
