package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u01 implements z4.e {
    public int f38093a;
    public final v01 f38094b;

    public u01(v01 v01Var) {
        this.f38094b = v01Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        v01 v01Var = this.f38094b;
        ProfileActivity profileActivity = v01Var.f38409n;
        int k10 = profileActivity.f31617n0.D0.k(i10);
        if (this.f38093a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        v01Var.a(z10);
        this.f38093a = k10;
        if (profileActivity.f31637q0 == null) {
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
