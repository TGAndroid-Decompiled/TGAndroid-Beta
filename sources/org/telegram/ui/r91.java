package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class r91 extends org.telegram.ui.Components.z71 {
    public final boolean f36742a;
    public final boolean f36743b;
    public final boolean f36744c;
    public final FrameLayout d;
    public final ra1 e;

    public r91(ra1 ra1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = ra1Var;
        this.f36742a = z10;
        this.f36743b = z11;
        this.f36744c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ra1 ra1Var = this.e;
        if (ra1Var.f36767l0) {
            return ra1Var.f36765j0;
        }
        boolean z10 = this.f36742a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36743b) {
            if (i10 == 0) {
                return ra1Var.f36765j0;
            }
            i10--;
        }
        if (this.f36744c && i10 == 0) {
            return ra1Var.f36766k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f36767l0) {
            return 1;
        }
        return (this.f36742a ? 1 : 0) + (this.f36743b ? 1 : 0) + (this.f36744c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
