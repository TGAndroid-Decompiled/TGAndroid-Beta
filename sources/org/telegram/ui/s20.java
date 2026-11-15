package org.telegram.ui;

import android.view.TextureView;
public final class s20 implements br0 {
    public final c40 f51081a;

    public s20(c40 c40Var) {
        this.f51081a = c40Var;
    }

    @Override
    public final void G0(org.telegram.messenger.gj gjVar) {
        c40 c40Var = this.f51081a;
        c40Var.L1.I0(true);
        c40Var.f45902b4.f46462f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        c40Var.f29682b.invalidate();
    }

    @Override
    public final void I(org.telegram.messenger.gj gjVar) {
        this.f51081a.f29682b.invalidate();
    }

    @Override
    public final TextureView g0() {
        return null;
    }
}
