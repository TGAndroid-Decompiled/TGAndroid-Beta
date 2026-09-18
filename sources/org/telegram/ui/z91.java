package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class z91 extends org.telegram.ui.Components.o81 {
    public final boolean f40026a;
    public final boolean f40027b;
    public final boolean f40028c;
    public final FrameLayout d;
    public final za1 e;

    public z91(za1 za1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = za1Var;
        this.f40026a = z10;
        this.f40027b = z11;
        this.f40028c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        za1 za1Var = this.e;
        if (za1Var.f40047l0) {
            return za1Var.f40045j0;
        }
        boolean z10 = this.f40026a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40027b) {
            if (i10 == 0) {
                return za1Var.f40045j0;
            }
            i10--;
        }
        if (this.f40028c && i10 == 0) {
            return za1Var.f40046k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40047l0) {
            return 1;
        }
        return (this.f40026a ? 1 : 0) + (this.f40027b ? 1 : 0) + (this.f40028c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
