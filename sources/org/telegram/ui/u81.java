package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class u81 extends org.telegram.ui.Components.d91 {
    public final boolean f42302a;
    public final boolean f42303b;
    public final boolean f42304c;
    public final FrameLayout d;
    public final u91 e;

    public u81(u91 u91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = u91Var;
        this.f42302a = z10;
        this.f42303b = z11;
        this.f42304c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        u91 u91Var = this.e;
        if (u91Var.f42325l0) {
            return u91Var.f42323j0;
        }
        boolean z10 = this.f42302a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f42303b) {
            if (i10 == 0) {
                return u91Var.f42323j0;
            }
            i10--;
        }
        if (this.f42304c && i10 == 0) {
            return u91Var.f42324k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f42325l0) {
            return 1;
        }
        return (this.f42302a ? 1 : 0) + (this.f42303b ? 1 : 0) + (this.f42304c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
