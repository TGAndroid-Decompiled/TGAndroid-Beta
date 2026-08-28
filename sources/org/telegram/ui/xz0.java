package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xz0 implements m2.e {
    public int f44656a;
    public final yz0 f44657b;

    public xz0(yz0 yz0Var) {
        this.f44657b = yz0Var;
    }

    @Override
    public final void b(int i9) {
        boolean z10;
        yz0 yz0Var = this.f44657b;
        ProfileActivity profileActivity = yz0Var.f44986n;
        int k10 = profileActivity.f35984j0.f26814z0.k(i9);
        if (this.f44656a != k10) {
            z10 = true;
        } else {
            z10 = false;
        }
        yz0Var.a(z10);
        this.f44656a = k10;
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
    public final void d(int i9) {
    }

    @Override
    public final void c(float f10, int i9, int i10) {
    }
}
