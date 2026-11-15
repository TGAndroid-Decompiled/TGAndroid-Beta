package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class y31 extends org.telegram.ui.Components.n61 {
    public final boolean f53404a;
    public final boolean f53405b;
    public final boolean f53406c;
    public final FrameLayout d;
    public final z41 f53407e;

    public y31(z41 z41Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f53407e = z41Var;
        this.f53404a = z10;
        this.f53405b = z11;
        this.f53406c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        z41 z41Var = this.f53407e;
        if (z41Var.f53826o0) {
            return z41Var.f53821j0;
        }
        boolean z10 = this.f53404a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f53405b) {
            if (i7 == 0) {
                return z41Var.f53821j0;
            }
            i7--;
        }
        if (this.f53406c && i7 == 0) {
            return z41Var.f53822k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f53407e.f53826o0) {
            return 1;
        }
        return (this.f53404a ? 1 : 0) + (this.f53405b ? 1 : 0) + (this.f53406c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
