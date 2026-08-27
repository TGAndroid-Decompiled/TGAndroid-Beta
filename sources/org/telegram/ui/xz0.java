package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class xz0 implements m2.e {

    public int f44647a;

    public final yz0 f44648b;

    public xz0(yz0 yz0Var) {
        this.f44648b = yz0Var;
    }

    @Override
    public final void b(int i10) {
        yz0 yz0Var = this.f44648b;
        ProfileActivity profileActivity = yz0Var.f44979n;
        int iK = profileActivity.f35987j0.f27451z0.k(i10);
        yz0Var.a(this.f44647a != iK);
        this.f44647a = iK;
        if (profileActivity.m0 == null) {
            return;
        }
        if (profileActivity.P0.t()) {
            AndroidUtilities.runOnUIThread(new ky0(yz0Var, 3), 500L);
        } else {
            yz0Var.c();
        }
    }

    @Override
    public final void d(int i10) {
    }

    @Override
    public final void c(float f10, int i10, int i11) {
    }
}
