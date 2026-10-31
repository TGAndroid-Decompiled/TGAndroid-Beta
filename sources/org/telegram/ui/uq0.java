package org.telegram.ui;
public final class uq0 extends org.telegram.ui.Components.u61 {
    public final int m0;
    public final org.telegram.messenger.us f42517n0;

    public uq0(org.telegram.messenger.us usVar, int i10) {
        this.m0 = i10;
        this.f42517n0 = usVar;
    }

    @Override
    public final void g0() {
        switch (this.m0) {
            case 0:
                super.g0();
                PhotoViewer photoViewer = (PhotoViewer) this.f42517n0;
                if (photoViewer.f33615u4 == 0) {
                    PhotoViewer.Z(photoViewer, false);
                }
                if (!photoViewer.O8) {
                    b5.d.D(S());
                    b5.d.x(false);
                    return;
                }
                return;
            default:
                super.g0();
                ((SecretMediaViewer) this.f42517n0).U.a(false, true);
                return;
        }
    }

    @Override
    public final void h0() {
        switch (this.m0) {
            case 0:
                super.h0();
                PhotoViewer photoViewer = (PhotoViewer) this.f42517n0;
                PhotoViewer.Z(photoViewer, true);
                if (!photoViewer.O8) {
                    b5.d.D(S());
                    b5.d.x(true);
                    return;
                }
                return;
            default:
                super.h0();
                ((SecretMediaViewer) this.f42517n0).U.a(true, true);
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        b2.z0 g10;
        switch (this.m0) {
            case 0:
                super.onRenderedFirstFrame();
                PhotoViewer photoViewer = (PhotoViewer) this.f42517n0;
                boolean z10 = true;
                photoViewer.R = true;
                if (photoViewer.D2) {
                    photoViewer.f33470e0.invalidate();
                }
                photoViewer.C3();
                if (!b5.d.u() && !photoViewer.f33582r) {
                    z10 = false;
                }
                t0(z10);
                if (!photoViewer.O8) {
                    b5.d.D(S());
                    i2.i0 i0Var = this.d;
                    float f7 = 1.0f;
                    if (i0Var != null && (g10 = i0Var.g()) != null) {
                        f7 = g10.f2443a;
                    }
                    b5.d.z(f7);
                    return;
                }
                return;
            default:
                super.onRenderedFirstFrame();
                return;
        }
    }

    @Override
    public void p0(long j10) {
        switch (this.m0) {
            case 0:
                q0(j10, false);
                PhotoViewer photoViewer = (PhotoViewer) this.f42517n0;
                if (photoViewer.f33584r1) {
                    PhotoViewer.a0(photoViewer, j10);
                }
                if (!photoViewer.O8) {
                    b5.d.D(j10);
                    return;
                }
                return;
            default:
                super.p0(j10);
                return;
        }
    }

    @Override
    public void u0(boolean z10) {
        switch (this.m0) {
            case 1:
                super.u0(z10);
                ((SecretMediaViewer) this.f42517n0).U.a(z10, true);
                return;
            default:
                super.u0(z10);
                return;
        }
    }

    @Override
    public void v0(float f7) {
        switch (this.m0) {
            case 0:
                super.v0(f7);
                if (!((PhotoViewer) this.f42517n0).O8) {
                    b5.d.z(f7);
                    return;
                }
                return;
            default:
                super.v0(f7);
                return;
        }
    }
}
