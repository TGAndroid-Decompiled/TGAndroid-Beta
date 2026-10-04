package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class t91 extends org.telegram.ui.Components.x81 {
    public final boolean f40733a;
    public final boolean f40734b;
    public final boolean f40735c;
    public final FrameLayout d;
    public final va1 f40736e;

    public t91(va1 va1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f40736e = va1Var;
        this.f40733a = z10;
        this.f40734b = z11;
        this.f40735c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        va1 va1Var = this.f40736e;
        if (va1Var.f41656n0) {
            return va1Var.f41651i0;
        }
        boolean z10 = this.f40733a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40734b) {
            if (i10 == 0) {
                return va1Var.f41651i0;
            }
            i10--;
        }
        if (this.f40735c && i10 == 0) {
            return va1Var.f41652j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f40736e.f41656n0) {
            return 1;
        }
        return (this.f40733a ? 1 : 0) + (this.f40734b ? 1 : 0) + (this.f40735c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
