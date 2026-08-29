package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class t81 extends org.telegram.ui.Components.q71 {
    public final boolean f42578a;
    public final boolean f42579b;
    public final boolean f42580c;
    public final FrameLayout d;
    public final t91 f42581e;

    public t81(t91 t91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f42581e = t91Var;
        this.f42578a = z10;
        this.f42579b = z11;
        this.f42580c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        t91 t91Var = this.f42581e;
        if (t91Var.f42600h0) {
            return t91Var.f42598f0;
        }
        boolean z10 = this.f42578a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f42579b) {
            if (i10 == 0) {
                return t91Var.f42598f0;
            }
            i10--;
        }
        if (this.f42580c && i10 == 0) {
            return t91Var.f42599g0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f42581e.f42600h0) {
            return 1;
        }
        return (this.f42578a ? 1 : 0) + (this.f42579b ? 1 : 0) + (this.f42580c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
