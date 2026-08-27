package org.telegram.ui;

public final class u31 extends org.telegram.ui.Components.m61 {

    public final SecretMediaViewer f43103i0;

    public u31(SecretMediaViewer secretMediaViewer) {
        this.f43103i0 = secretMediaViewer;
    }

    @Override
    public final void C() {
        super.C();
        this.f43103i0.S.a(false, true);
    }

    @Override
    public final void D() {
        super.D();
        this.f43103i0.S.a(true, true);
    }

    @Override
    public final void Q(boolean z10) {
        super.Q(z10);
        this.f43103i0.S.a(z10, true);
    }
}
