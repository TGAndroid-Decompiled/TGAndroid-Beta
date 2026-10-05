package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u01 implements z4.e {
    public int f41067a;
    public final v01 f41068b;

    public u01(v01 v01Var) {
        this.f41068b = v01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        v01 v01Var = this.f41068b;
        ProfileActivity profileActivity = v01Var.f41556n;
        int k10 = profileActivity.f34313n0.D0.k(i10);
        if (this.f41067a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        v01Var.a(z10);
        this.f41067a = k10;
        if (profileActivity.f34333q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new hz0(v01Var, 3), 500L);
        } else {
            v01Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
