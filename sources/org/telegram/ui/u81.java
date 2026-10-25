package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class u81 extends org.telegram.ui.Components.m91 {
    public final boolean f44066a;
    public final boolean f44067b;
    public final boolean f44068c;
    public final FrameLayout d;
    public final w91 e;

    public u81(w91 w91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = w91Var;
        this.f44066a = z10;
        this.f44067b = z11;
        this.f44068c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        w91 w91Var = this.e;
        if (w91Var.f45034n0) {
            return w91Var.f45029i0;
        }
        boolean z10 = this.f44066a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f44067b) {
            if (i10 == 0) {
                return w91Var.f45029i0;
            }
            i10--;
        }
        if (this.f44068c && i10 == 0) {
            return w91Var.f45030j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f45034n0) {
            return 1;
        }
        return (this.f44066a ? 1 : 0) + (this.f44067b ? 1 : 0) + (this.f44068c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
