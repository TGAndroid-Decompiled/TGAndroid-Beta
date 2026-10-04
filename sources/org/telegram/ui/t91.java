package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class t91 extends org.telegram.ui.Components.x81 {
    public final boolean f40739a;
    public final boolean f40740b;
    public final boolean f40741c;
    public final FrameLayout d;
    public final va1 f40742e;

    public t91(va1 va1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f40742e = va1Var;
        this.f40739a = z10;
        this.f40740b = z11;
        this.f40741c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        va1 va1Var = this.f40742e;
        if (va1Var.f41663n0) {
            return va1Var.f41658i0;
        }
        boolean z10 = this.f40739a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40740b) {
            if (i10 == 0) {
                return va1Var.f41658i0;
            }
            i10--;
        }
        if (this.f40741c && i10 == 0) {
            return va1Var.f41659j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f40742e.f41663n0) {
            return 1;
        }
        return (this.f40739a ? 1 : 0) + (this.f40740b ? 1 : 0) + (this.f40741c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
