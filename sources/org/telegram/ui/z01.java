package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z01 implements z4.e {
    public int f44549a;
    public final a11 f44550b;

    public z01(a11 a11Var) {
        this.f44550b = a11Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        a11 a11Var = this.f44550b;
        ProfileActivity profileActivity = a11Var.f35840n;
        int k10 = profileActivity.f34331n0.D0.k(i10);
        if (this.f44549a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        a11Var.a(z10);
        this.f44549a = k10;
        if (profileActivity.f34351q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new mz0(a11Var, 3), 500L);
        } else {
            a11Var.c();
        }
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void b(float f7, int i10, int i11) {
    }
}
