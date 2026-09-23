package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u01 implements z4.e {
    public int f37831a;
    public final v01 f37832b;

    public u01(v01 v01Var) {
        this.f37832b = v01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        v01 v01Var = this.f37832b;
        ProfileActivity profileActivity = v01Var.f38259n;
        int k10 = profileActivity.f31300n0.D0.k(i10);
        if (this.f37831a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        v01Var.a(z10);
        this.f37831a = k10;
        if (profileActivity.f31320q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new xz0(v01Var, 2), 500L);
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
