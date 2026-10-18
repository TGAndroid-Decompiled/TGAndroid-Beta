package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class r81 extends org.telegram.ui.Components.u81 {
    public final boolean f40654a;
    public final boolean f40655b;
    public final boolean f40656c;
    public final FrameLayout d;
    public final r91 e;

    public r81(r91 r91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = r91Var;
        this.f40654a = z10;
        this.f40655b = z11;
        this.f40656c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        r91 r91Var = this.e;
        if (r91Var.f40677l0) {
            return r91Var.f40675j0;
        }
        boolean z10 = this.f40654a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40655b) {
            if (i10 == 0) {
                return r91Var.f40675j0;
            }
            i10--;
        }
        if (this.f40656c && i10 == 0) {
            return r91Var.f40676k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40677l0) {
            return 1;
        }
        return (this.f40654a ? 1 : 0) + (this.f40655b ? 1 : 0) + (this.f40656c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
