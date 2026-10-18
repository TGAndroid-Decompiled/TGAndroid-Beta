package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class r81 extends org.telegram.ui.Components.u81 {
    public final boolean f40620a;
    public final boolean f40621b;
    public final boolean f40622c;
    public final FrameLayout d;
    public final r91 e;

    public r81(r91 r91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = r91Var;
        this.f40620a = z10;
        this.f40621b = z11;
        this.f40622c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        r91 r91Var = this.e;
        if (r91Var.f40643l0) {
            return r91Var.f40641j0;
        }
        boolean z10 = this.f40620a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40621b) {
            if (i10 == 0) {
                return r91Var.f40641j0;
            }
            i10--;
        }
        if (this.f40622c && i10 == 0) {
            return r91Var.f40642k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40643l0) {
            return 1;
        }
        return (this.f40620a ? 1 : 0) + (this.f40621b ? 1 : 0) + (this.f40622c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
