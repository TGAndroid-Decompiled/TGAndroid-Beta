package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class w81 extends org.telegram.ui.Components.n91 {
    public final boolean f44569a;
    public final boolean f44570b;
    public final boolean f44571c;
    public final FrameLayout d;
    public final y91 e;

    public w81(y91 y91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = y91Var;
        this.f44569a = z10;
        this.f44570b = z11;
        this.f44571c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        y91 y91Var = this.e;
        if (y91Var.f45925n0) {
            return y91Var.f45920i0;
        }
        boolean z10 = this.f44569a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f44570b) {
            if (i10 == 0) {
                return y91Var.f45920i0;
            }
            i10--;
        }
        if (this.f44571c && i10 == 0) {
            return y91Var.f45921j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f45925n0) {
            return 1;
        }
        return (this.f44569a ? 1 : 0) + (this.f44570b ? 1 : 0) + (this.f44571c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
