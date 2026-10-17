package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class r81 extends org.telegram.ui.Components.u81 {
    public final boolean f40629a;
    public final boolean f40630b;
    public final boolean f40631c;
    public final FrameLayout d;
    public final r91 e;

    public r81(r91 r91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = r91Var;
        this.f40629a = z10;
        this.f40630b = z11;
        this.f40631c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        r91 r91Var = this.e;
        if (r91Var.f40652l0) {
            return r91Var.f40650j0;
        }
        boolean z10 = this.f40629a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40630b) {
            if (i10 == 0) {
                return r91Var.f40650j0;
            }
            i10--;
        }
        if (this.f40631c && i10 == 0) {
            return r91Var.f40651k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40652l0) {
            return 1;
        }
        return (this.f40629a ? 1 : 0) + (this.f40630b ? 1 : 0) + (this.f40631c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
