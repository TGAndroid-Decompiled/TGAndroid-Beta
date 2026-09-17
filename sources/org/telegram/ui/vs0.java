package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vs0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.w61, org.telegram.ui.Components.i71, org.telegram.ui.Components.te0 {
    public final PhotoViewer f38499a;

    public vs0(PhotoViewer photoViewer) {
        this.f38499a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f38499a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f27380f).setDuration(150L).withEndAction(new org.telegram.ui.Components.tr0(7, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        ku0 ku0Var;
        PhotoViewer photoViewer = this.f38499a;
        if (photoViewer.F2 == null && ((ku0Var = photoViewer.f30959f0) == null || !ku0Var.f27286x)) {
            return;
        }
        if (!photoViewer.A8 && photoViewer.Q7.getVisibility() == 0) {
            f7 = ((photoViewer.R7.getRightProgress() - photoViewer.R7.getLeftProgress()) * f7) + photoViewer.R7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f30915a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f31093u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f38499a;
        if (photoViewer.f31013l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        ot0 ot0Var;
        ot0 ot0Var2;
        PhotoViewer photoViewer = this.f38499a;
        ku0 ku0Var = photoViewer.f30959f0;
        if (ku0Var != null && ku0Var.f27286x && (ot0Var2 = photoViewer.f31075s3) != null) {
            int i10 = photoViewer.f31056q3.h - org.telegram.ui.Components.j71.S;
            ot0Var2.N = ku0Var;
            if (ot0Var2.W != 0) {
                ot0Var2.W = 0L;
                ot0Var2.f26663f0 = null;
                ot0Var2.f26661e0 = null;
                ot0Var2.f26660d0 = null;
                ot0Var2.b(-1);
            }
            if (i10 != 0) {
                ot0Var2.f26666r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ot0Var2.f26665n != i11) {
                    ot0Var2.f26665n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((ku0Var.getVideoDuration() * f7) / 1000));
            ot0Var2.f26670y = formatShortDuration;
            ot0Var2.E = (int) Math.ceil(ot0Var2.F.measureText(formatShortDuration));
            ot0Var2.invalidate();
            if (ot0Var2.f26662f != null) {
                Utilities.globalQueue.cancelRunnable(ot0Var2.f26662f);
            }
            double videoDuration = (f7 * ku0Var.getVideoDuration()) / 1000.0d;
            ot0Var2.O = videoDuration;
            String c10 = ku0Var.c((int) videoDuration);
            if (c10 != null) {
                ot0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ot0Var = photoViewer.f31075s3) != null) {
            ot0Var.e(photoViewer.T4, f7, photoViewer.f31056q3.h - org.telegram.ui.Components.j71.S);
        }
        this.f38499a.b3(true);
        PhotoViewer.X(this.f38499a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f38499a;
        if (photoViewer.f31013l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31121x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f38499a;
        org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
        if (h71Var == null) {
            return;
        }
        h71Var.K(((float) h71Var.p()) * photoViewer.f31107v8);
        photoViewer.F2.B();
        photoViewer.R7.setProgress(photoViewer.f31107v8);
        photoViewer.u0();
        sl0 sl0Var = new sl0(this, 18);
        photoViewer.I2 = sl0Var;
        AndroidUtilities.runOnUIThread(sl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f38499a.f30950e0.invalidate();
    }
}
