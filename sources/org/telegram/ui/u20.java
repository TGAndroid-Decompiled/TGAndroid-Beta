package org.telegram.ui;

import android.view.TextureView;
public final class u20 implements dr0 {
    public final e40 f52521a;

    public u20(e40 e40Var) {
        this.f52521a = e40Var;
    }

    @Override
    public final void G(org.telegram.messenger.fj fjVar) {
        this.f52521a.f30226b.invalidate();
    }

    @Override
    public final TextureView T() {
        return null;
    }

    @Override
    public final void u0(org.telegram.messenger.fj fjVar) {
        e40 e40Var = this.f52521a;
        e40Var.L1.I0(true);
        e40Var.f47327b4.f47957f.L0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        e40Var.f30226b.invalidate();
    }
}
