package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.z71, org.telegram.ui.Components.j81, org.telegram.ui.Components.tf0 {
    public final PhotoViewer f42417a;

    public zs0(PhotoViewer photoViewer) {
        this.f42417a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f42417a;
        if (photoViewer.V0.isClickable() != z11) {
            photoViewer.V0.setClickable(z11);
            photoViewer.V0.setVisibility(0);
            photoViewer.V0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.V0.animate();
            if (!z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.es.f24465f).setDuration(150L).withEndAction(new org.telegram.ui.Components.zr0(10, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        ou0 ou0Var;
        PhotoViewer photoViewer = this.f42417a;
        if (photoViewer.F2 == null && ((ou0Var = photoViewer.f31937f0) == null || !ou0Var.f28531x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f31893a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f32072u3 = false;
    }

    @Override
    public void c(float f7) {
        st0 st0Var;
        st0 st0Var2;
        PhotoViewer photoViewer = this.f42417a;
        ou0 ou0Var = photoViewer.f31937f0;
        if (ou0Var != null && ou0Var.f28531x && (st0Var2 = photoViewer.f32054s3) != null) {
            int i10 = photoViewer.f32035q3.h - org.telegram.ui.Components.k81.S;
            st0Var2.N = ou0Var;
            if (st0Var2.W != 0) {
                st0Var2.W = 0L;
                st0Var2.f28234f0 = null;
                st0Var2.f28232e0 = null;
                st0Var2.f28231d0 = null;
                st0Var2.b(-1);
            }
            if (i10 != 0) {
                st0Var2.f28237r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (st0Var2.f28236n != i11) {
                    st0Var2.f28236n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((ou0Var.getVideoDuration() * f7) / 1000));
            st0Var2.f28241y = formatShortDuration;
            st0Var2.E = (int) Math.ceil(st0Var2.F.measureText(formatShortDuration));
            st0Var2.invalidate();
            if (st0Var2.f28233f != null) {
                Utilities.globalQueue.cancelRunnable(st0Var2.f28233f);
            }
            double videoDuration = (f7 * ou0Var.getVideoDuration()) / 1000.0d;
            st0Var2.O = videoDuration;
            String c10 = ou0Var.c((int) videoDuration);
            if (c10 != null) {
                st0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (st0Var = photoViewer.f32054s3) != null) {
            st0Var.e(photoViewer.T4, f7, photoViewer.f32035q3.h - org.telegram.ui.Components.k81.S);
        }
        this.f42417a.b3(true);
        PhotoViewer.X(this.f42417a);
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f42417a;
        if (photoViewer.f31992l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f42417a;
        if (photoViewer.f31992l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f32100x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f42417a;
        org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
        if (i81Var == null) {
            return;
        }
        i81Var.K(((float) i81Var.p()) * photoViewer.f32096w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f32096w8);
        photoViewer.u0();
        xk0 xk0Var = new xk0(this, 19);
        photoViewer.I2 = xk0Var;
        AndroidUtilities.runOnUIThread(xk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f42417a.f31928e0.invalidate();
    }
}
