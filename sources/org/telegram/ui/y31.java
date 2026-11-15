package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class y31 extends org.telegram.ui.Components.n61 {
    public final boolean f53400a;
    public final boolean f53401b;
    public final boolean f53402c;
    public final FrameLayout d;
    public final z41 f53403e;

    public y31(z41 z41Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f53403e = z41Var;
        this.f53400a = z10;
        this.f53401b = z11;
        this.f53402c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        z41 z41Var = this.f53403e;
        if (z41Var.f53861o0) {
            return z41Var.f53856j0;
        }
        boolean z10 = this.f53400a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f53401b) {
            if (i7 == 0) {
                return z41Var.f53856j0;
            }
            i7--;
        }
        if (this.f53402c && i7 == 0) {
            return z41Var.f53857k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f53403e.f53861o0) {
            return 1;
        }
        return (this.f53400a ? 1 : 0) + (this.f53401b ? 1 : 0) + (this.f53402c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
