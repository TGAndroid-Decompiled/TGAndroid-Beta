package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class r51 extends org.telegram.ui.Components.p71 {
    public final boolean f40974a;
    public final boolean f40975b;
    public final boolean f40976c;
    public final FrameLayout d;
    public final s61 e;

    public r51(s61 s61Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = s61Var;
        this.f40974a = z10;
        this.f40975b = z11;
        this.f40976c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        s61 s61Var = this.e;
        if (s61Var.f41253n0) {
            return s61Var.f41248i0;
        }
        boolean z10 = this.f40974a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40975b) {
            if (i10 == 0) {
                return s61Var.f41248i0;
            }
            i10--;
        }
        if (this.f40976c && i10 == 0) {
            return s61Var.f41249j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f41253n0) {
            return 1;
        }
        return (this.f40974a ? 1 : 0) + (this.f40975b ? 1 : 0) + (this.f40976c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
