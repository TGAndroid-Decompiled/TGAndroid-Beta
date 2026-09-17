package org.telegram.ui;
public final class qt0 extends org.telegram.ui.Components.h71 {
    public final PhotoViewer m0;

    public qt0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.f31094u4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (!photoViewer.N8) {
            b5.d.D(n());
            b5.d.x(false);
        }
    }

    @Override
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Y(photoViewer, true);
        if (!photoViewer.N8) {
            b5.d.D(n());
            b5.d.x(true);
        }
    }

    @Override
    public final void K(long j3) {
        L(j3, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.f31063r1) {
            PhotoViewer.Z(photoViewer, j3);
        }
        if (!photoViewer.N8) {
            b5.d.D(j3);
        }
    }

    @Override
    public final void Q(float f7) {
        super.Q(f7);
        if (!this.m0.N8) {
            b5.d.z(f7);
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        b2.v0 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.f30950e0.invalidate();
        }
        photoViewer.z3();
        if (!b5.d.u() && !photoViewer.f31061r) {
            z10 = false;
        }
        O(z10);
        if (!photoViewer.N8) {
            b5.d.D(n());
            i2.e0 e0Var = this.d;
            float f7 = 1.0f;
            if (e0Var != null && (h = e0Var.h()) != null) {
                f7 = h.f3336a;
            }
            b5.d.z(f7);
        }
    }
}
