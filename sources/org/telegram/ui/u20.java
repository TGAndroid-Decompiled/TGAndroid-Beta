package org.telegram.ui;

import android.view.TextureView;
public final class u20 implements fr0 {
    public final e40 f50281a;

    public u20(e40 e40Var) {
        this.f50281a = e40Var;
    }

    @Override
    public final void I(org.telegram.messenger.ij ijVar) {
        this.f50281a.f28624b.invalidate();
    }

    @Override
    public final void I0(org.telegram.messenger.ij ijVar) {
        e40 e40Var = this.f50281a;
        e40Var.H1.I0(true);
        e40Var.T3.f46383f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        e40Var.f28624b.invalidate();
    }

    @Override
    public final TextureView l0() {
        return null;
    }
}
