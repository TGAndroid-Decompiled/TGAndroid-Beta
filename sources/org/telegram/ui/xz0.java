package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xz0 implements m2.e {
    public int f44680a;
    public final yz0 f44681b;

    public xz0(yz0 yz0Var) {
        this.f44681b = yz0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        yz0 yz0Var = this.f44681b;
        ProfileActivity profileActivity = yz0Var.f44997n;
        int k9 = profileActivity.f36049j0.f30065z0.k(i10);
        if (this.f44680a != k9) {
            z10 = true;
        } else {
            z10 = false;
        }
        yz0Var.a(z10);
        this.f44680a = k9;
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
    public final void c(int i10) {
    }

    @Override
    public final void b(float f9, int i10, int i11) {
    }
}
