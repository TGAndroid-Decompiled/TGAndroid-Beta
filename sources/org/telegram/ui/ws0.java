package org.telegram.ui;
public final class ws0 extends org.telegram.ui.Components.a81 {
    public final PhotoViewer m0;

    public ws0(PhotoViewer photoViewer) {
        this.m0 = photoViewer;
    }

    @Override
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.f33418u4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (!photoViewer.O8) {
            b5.d.D(n());
            b5.d.x(false);
        }
    }

    @Override
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.m0;
        PhotoViewer.Y(photoViewer, true);
        if (!photoViewer.O8) {
            b5.d.D(n());
            b5.d.x(true);
        }
    }

    @Override
    public final void K(long j10) {
        L(j10, false);
        PhotoViewer photoViewer = this.m0;
        if (photoViewer.f33387r1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (!photoViewer.O8) {
            b5.d.D(j10);
        }
    }

    @Override
    public final void Q(float f7) {
        super.Q(f7);
        if (!this.m0.O8) {
            b5.d.z(f7);
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        b2.z0 h;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.m0;
        boolean z10 = true;
        photoViewer.R = true;
        if (photoViewer.D2) {
            photoViewer.f33273e0.invalidate();
        }
        photoViewer.z3();
        if (!b5.d.u() && !photoViewer.f33385r) {
            z10 = false;
        }
        O(z10);
        if (!photoViewer.O8) {
            b5.d.D(n());
            i2.h0 h0Var = this.d;
            float f7 = 1.0f;
            if (h0Var != null && (h = h0Var.h()) != null) {
                f7 = h.f4156a;
            }
            b5.d.z(f7);
        }
    }
}
