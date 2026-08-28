package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class s81 extends org.telegram.ui.Components.e71 {
    public final boolean f42589a;
    public final boolean f42590b;
    public final boolean f42591c;
    public final FrameLayout d;
    public final s91 f42592e;

    public s81(s91 s91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f42592e = s91Var;
        this.f42589a = z10;
        this.f42590b = z11;
        this.f42591c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i9) {
        s91 s91Var = this.f42592e;
        if (s91Var.f42618h0) {
            return s91Var.f42616f0;
        }
        boolean z10 = this.f42589a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i9 == 0) {
                return frameLayout;
            }
            i9--;
        }
        if (this.f42590b) {
            if (i9 == 0) {
                return s91Var.f42616f0;
            }
            i9--;
        }
        if (this.f42591c && i9 == 0) {
            return s91Var.f42617g0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f42592e.f42618h0) {
            return 1;
        }
        return (this.f42589a ? 1 : 0) + (this.f42590b ? 1 : 0) + (this.f42591c ? 1 : 0);
    }

    @Override
    public final int h(int i9) {
        return i9;
    }

    @Override
    public final void b(View view, int i9, int i10) {
    }
}
