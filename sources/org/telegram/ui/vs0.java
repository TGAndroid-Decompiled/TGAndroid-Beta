package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vs0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.w61, org.telegram.ui.Components.i71, org.telegram.ui.Components.te0 {
    public final PhotoViewer f38504a;

    public vs0(PhotoViewer photoViewer) {
        this.f38504a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f38504a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f27383f).setDuration(150L).withEndAction(new org.telegram.ui.Components.tr0(7, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        ku0 ku0Var;
        PhotoViewer photoViewer = this.f38504a;
        if (photoViewer.F2 == null && ((ku0Var = photoViewer.f30963f0) == null || !ku0Var.f27289x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f30919a3 = f7;
        } else {
            photoViewer.s2((int) (f7 * ((float) A1)));
        }
        photoViewer.a3(false);
        photoViewer.f31097u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f38504a;
        if (photoViewer.f31017l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override
    public void d(float f7) {
        ot0 ot0Var;
        ot0 ot0Var2;
        PhotoViewer photoViewer = this.f38504a;
        ku0 ku0Var = photoViewer.f30963f0;
        if (ku0Var != null && ku0Var.f27289x && (ot0Var2 = photoViewer.f31079s3) != null) {
            int i10 = photoViewer.f31060q3.h - org.telegram.ui.Components.j71.S;
            ot0Var2.N = ku0Var;
            if (ot0Var2.W != 0) {
                ot0Var2.W = 0L;
                ot0Var2.f26666f0 = null;
                ot0Var2.f26664e0 = null;
                ot0Var2.f26663d0 = null;
                ot0Var2.b(-1);
            }
            if (i10 != 0) {
                ot0Var2.f26669r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ot0Var2.f26668n != i11) {
                    ot0Var2.f26668n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((ku0Var.getVideoDuration() * f7) / 1000));
            ot0Var2.f26673y = formatShortDuration;
            ot0Var2.E = (int) Math.ceil(ot0Var2.F.measureText(formatShortDuration));
            ot0Var2.invalidate();
            if (ot0Var2.f26665f != null) {
                Utilities.globalQueue.cancelRunnable(ot0Var2.f26665f);
            }
            double videoDuration = (f7 * ku0Var.getVideoDuration()) / 1000.0d;
            ot0Var2.O = videoDuration;
            String c10 = ku0Var.c((int) videoDuration);
            if (c10 != null) {
                ot0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ot0Var = photoViewer.f31079s3) != null) {
            ot0Var.e(photoViewer.T4, f7, photoViewer.f31060q3.h - org.telegram.ui.Components.j71.S);
        }
        this.f38504a.a3(true);
        PhotoViewer.X(this.f38504a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f38504a;
        if (photoViewer.f31017l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31125x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f38504a;
        org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
        if (h71Var == null) {
            return;
        }
        h71Var.K(((float) h71Var.p()) * photoViewer.f31121w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f31121w8);
        photoViewer.u0();
        sl0 sl0Var = new sl0(this, 18);
        photoViewer.I2 = sl0Var;
        AndroidUtilities.runOnUIThread(sl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f38504a.f30954e0.invalidate();
    }
}
