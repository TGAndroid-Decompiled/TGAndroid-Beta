package org.telegram.ui;
public final class ts0 extends org.telegram.ui.Components.i71 {
    public final PhotoViewer f38735j0;

    public ts0(PhotoViewer photoViewer) {
        this.f38735j0 = photoViewer;
    }

    @Override
    public final void B() {
        super.B();
        PhotoViewer photoViewer = this.f38735j0;
        if (photoViewer.f31853r4 == 0) {
            PhotoViewer.Y(photoViewer, false);
        }
        if (!photoViewer.K8) {
            d1.f.D(n());
            d1.f.x(false);
        }
    }

    @Override
    public final void C() {
        super.C();
        PhotoViewer photoViewer = this.f38735j0;
        PhotoViewer.Y(photoViewer, true);
        if (!photoViewer.K8) {
            d1.f.D(n());
            d1.f.x(true);
        }
    }

    @Override
    public final void K(long j10) {
        L(j10, false);
        PhotoViewer photoViewer = this.f38735j0;
        if (photoViewer.f31822o1) {
            PhotoViewer.Z(photoViewer, j10);
        }
        if (!photoViewer.K8) {
            d1.f.D(j10);
        }
    }

    @Override
    public final void Q(float f10) {
        super.Q(f10);
        if (!this.f38735j0.K8) {
            d1.f.z(f10);
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        j3.v1 d;
        super.onRenderedFirstFrame();
        PhotoViewer photoViewer = this.f38735j0;
        boolean z4 = true;
        photoViewer.O = true;
        if (photoViewer.A2) {
            photoViewer.f31705b0.invalidate();
        }
        photoViewer.z3();
        if (!d1.f.u() && !photoViewer.f31848r) {
            z4 = false;
        }
        O(z4);
        if (!photoViewer.K8) {
            d1.f.D(n());
            j3.f0 f0Var = this.d;
            float f10 = 1.0f;
            if (f0Var != null && (d = f0Var.d()) != null) {
                f10 = d.f8856a;
            }
            d1.f.z(f10);
        }
    }
}
