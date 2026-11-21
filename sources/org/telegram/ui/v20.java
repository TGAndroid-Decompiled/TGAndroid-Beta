package org.telegram.ui;

import android.view.TextureView;
public final class v20 implements dr0 {
    public final f40 f52710a;

    public v20(f40 f40Var) {
        this.f52710a = f40Var;
    }

    @Override
    public final void G0(org.telegram.messenger.fj fjVar) {
        f40 f40Var = this.f52710a;
        f40Var.L1.I0(true);
        f40Var.f47473b4.f47821f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        f40Var.f30173b.invalidate();
    }

    @Override
    public final void H(org.telegram.messenger.fj fjVar) {
        this.f52710a.f30173b.invalidate();
    }

    @Override
    public final TextureView f0() {
        return null;
    }
}
