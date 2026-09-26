package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s01 implements z4.e {
    public int f37563a;
    public final t01 f37564b;

    public s01(t01 t01Var) {
        this.f37564b = t01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        t01 t01Var = this.f37564b;
        ProfileActivity profileActivity = t01Var.f37908n;
        int k10 = profileActivity.f31615n0.D0.k(i10);
        if (this.f37563a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        t01Var.a(z10);
        this.f37563a = k10;
        if (profileActivity.f31635q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new vz0(t01Var, 2), 500L);
        } else {
            t01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
