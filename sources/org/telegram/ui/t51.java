package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class t51 extends org.telegram.ui.Components.o71 {
    public final boolean f41738a;
    public final boolean f41739b;
    public final boolean f41740c;
    public final FrameLayout d;
    public final u61 e;

    public t51(u61 u61Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = u61Var;
        this.f41738a = z10;
        this.f41739b = z11;
        this.f41740c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        u61 u61Var = this.e;
        if (u61Var.f42040n0) {
            return u61Var.f42035i0;
        }
        boolean z10 = this.f41738a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f41739b) {
            if (i10 == 0) {
                return u61Var.f42035i0;
            }
            i10--;
        }
        if (this.f41740c && i10 == 0) {
            return u61Var.f42036j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f42040n0) {
            return 1;
        }
        return (this.f41738a ? 1 : 0) + (this.f41739b ? 1 : 0) + (this.f41740c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
