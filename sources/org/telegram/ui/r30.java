package org.telegram.ui;

import android.view.TextureView;
public final class r30 implements os0 {
    public final b50 f41124a;

    public r30(b50 b50Var) {
        this.f41124a = b50Var;
    }

    @Override
    public final void H0(org.telegram.messenger.jj jjVar) {
        b50 b50Var = this.f41124a;
        b50Var.H1.I0(true);
        b50Var.T3.f41046f.K0(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0, 0);
        b50Var.f21586b.invalidate();
    }

    @Override
    public final void I(org.telegram.messenger.jj jjVar) {
        this.f41124a.f21586b.invalidate();
    }

    @Override
    public final TextureView k0() {
        return null;
    }
}
