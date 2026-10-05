package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class r91 extends org.telegram.ui.Components.y81 {
    public final boolean f40014a;
    public final boolean f40015b;
    public final boolean f40016c;
    public final FrameLayout d;
    public final ta1 f40017e;

    public r91(ta1 ta1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f40017e = ta1Var;
        this.f40014a = z10;
        this.f40015b = z11;
        this.f40016c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ta1 ta1Var = this.f40017e;
        if (ta1Var.f40820n0) {
            return ta1Var.f40815i0;
        }
        boolean z10 = this.f40014a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40015b) {
            if (i10 == 0) {
                return ta1Var.f40815i0;
            }
            i10--;
        }
        if (this.f40016c && i10 == 0) {
            return ta1Var.f40816j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f40017e.f40820n0) {
            return 1;
        }
        return (this.f40014a ? 1 : 0) + (this.f40015b ? 1 : 0) + (this.f40016c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
