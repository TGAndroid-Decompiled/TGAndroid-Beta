package org.telegram.ui;

import android.view.TextureView;
public final class s20 implements cr0 {
    public final c40 f49605a;

    public s20(c40 c40Var) {
        this.f49605a = c40Var;
    }

    @Override
    public final void I(org.telegram.messenger.ij ijVar) {
        this.f49605a.f28615b.invalidate();
    }

    @Override
    public final void I0(org.telegram.messenger.ij ijVar) {
        c40 c40Var = this.f49605a;
        c40Var.H1.I0(true);
        c40Var.T3.f45382f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        c40Var.f28615b.invalidate();
    }

    @Override
    public final TextureView l0() {
        return null;
    }
}
