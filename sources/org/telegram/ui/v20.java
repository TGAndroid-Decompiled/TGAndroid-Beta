package org.telegram.ui;

import android.view.TextureView;
public final class v20 implements gr0 {
    public final f40 f50627a;

    public v20(f40 f40Var) {
        this.f50627a = f40Var;
    }

    @Override
    public final void I(org.telegram.messenger.ij ijVar) {
        this.f50627a.f28672b.invalidate();
    }

    @Override
    public final void I0(org.telegram.messenger.ij ijVar) {
        f40 f40Var = this.f50627a;
        f40Var.K1.I0(true);
        f40Var.W3.f46730f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        f40Var.f28672b.invalidate();
    }

    @Override
    public final TextureView l0() {
        return null;
    }
}
