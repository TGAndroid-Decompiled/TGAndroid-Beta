package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class s91 extends org.telegram.ui.Components.o81 {
    public final boolean f37657a;
    public final boolean f37658b;
    public final boolean f37659c;
    public final FrameLayout d;
    public final sa1 e;

    public s91(sa1 sa1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = sa1Var;
        this.f37657a = z10;
        this.f37658b = z11;
        this.f37659c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        sa1 sa1Var = this.e;
        if (sa1Var.f37681l0) {
            return sa1Var.f37679j0;
        }
        boolean z10 = this.f37657a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f37658b) {
            if (i10 == 0) {
                return sa1Var.f37679j0;
            }
            i10--;
        }
        if (this.f37659c && i10 == 0) {
            return sa1Var.f37680k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f37681l0) {
            return 1;
        }
        return (this.f37657a ? 1 : 0) + (this.f37658b ? 1 : 0) + (this.f37659c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
