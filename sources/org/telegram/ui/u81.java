package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class u81 extends org.telegram.ui.Components.m91 {
    public final boolean f44069a;
    public final boolean f44070b;
    public final boolean f44071c;
    public final FrameLayout d;
    public final w91 e;

    public u81(w91 w91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = w91Var;
        this.f44069a = z10;
        this.f44070b = z11;
        this.f44071c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        w91 w91Var = this.e;
        if (w91Var.f45037n0) {
            return w91Var.f45032i0;
        }
        boolean z10 = this.f44069a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f44070b) {
            if (i10 == 0) {
                return w91Var.f45032i0;
            }
            i10--;
        }
        if (this.f44071c && i10 == 0) {
            return w91Var.f45033j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f45037n0) {
            return 1;
        }
        return (this.f44069a ? 1 : 0) + (this.f44070b ? 1 : 0) + (this.f44071c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
