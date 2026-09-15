package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class y91 extends org.telegram.ui.Components.a81 {
    public final boolean f39789a;
    public final boolean f39790b;
    public final boolean f39791c;
    public final FrameLayout d;
    public final ya1 e;

    public y91(ya1 ya1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = ya1Var;
        this.f39789a = z10;
        this.f39790b = z11;
        this.f39791c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ya1 ya1Var = this.e;
        if (ya1Var.f39810l0) {
            return ya1Var.f39808j0;
        }
        boolean z10 = this.f39789a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f39790b) {
            if (i10 == 0) {
                return ya1Var.f39808j0;
            }
            i10--;
        }
        if (this.f39791c && i10 == 0) {
            return ya1Var.f39809k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f39810l0) {
            return 1;
        }
        return (this.f39789a ? 1 : 0) + (this.f39790b ? 1 : 0) + (this.f39791c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
