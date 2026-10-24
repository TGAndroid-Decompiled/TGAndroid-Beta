package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class t81 extends org.telegram.ui.Components.d91 {
    public final boolean f41933a;
    public final boolean f41934b;
    public final boolean f41935c;
    public final FrameLayout d;
    public final t91 e;

    public t81(t91 t91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = t91Var;
        this.f41933a = z10;
        this.f41934b = z11;
        this.f41935c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        t91 t91Var = this.e;
        if (t91Var.f41956l0) {
            return t91Var.f41954j0;
        }
        boolean z10 = this.f41933a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f41934b) {
            if (i10 == 0) {
                return t91Var.f41954j0;
            }
            i10--;
        }
        if (this.f41935c && i10 == 0) {
            return t91Var.f41955k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f41956l0) {
            return 1;
        }
        return (this.f41933a ? 1 : 0) + (this.f41934b ? 1 : 0) + (this.f41935c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
