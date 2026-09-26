package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class s91 extends org.telegram.ui.Components.n81 {
    public final boolean f37658a;
    public final boolean f37659b;
    public final boolean f37660c;
    public final FrameLayout d;
    public final sa1 e;

    public s91(sa1 sa1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = sa1Var;
        this.f37658a = z10;
        this.f37659b = z11;
        this.f37660c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        sa1 sa1Var = this.e;
        if (sa1Var.f37682l0) {
            return sa1Var.f37680j0;
        }
        boolean z10 = this.f37658a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f37659b) {
            if (i10 == 0) {
                return sa1Var.f37680j0;
            }
            i10--;
        }
        if (this.f37660c && i10 == 0) {
            return sa1Var.f37681k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f37682l0) {
            return 1;
        }
        return (this.f37658a ? 1 : 0) + (this.f37659b ? 1 : 0) + (this.f37660c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
