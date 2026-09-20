package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ts0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.j71, org.telegram.ui.Components.u71, org.telegram.ui.Components.bf0 {
    public final PhotoViewer f37876a;

    public ts0(PhotoViewer photoViewer) {
        this.f37876a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f37876a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f27642f).setDuration(150L).withEndAction(new org.telegram.ui.Components.ds0(7, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        iu0 iu0Var;
        PhotoViewer photoViewer = this.f37876a;
        if (photoViewer.F2 == null && ((iu0Var = photoViewer.f31230f0) == null || !iu0Var.f30521x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f31186a3 = f7;
        } else {
            photoViewer.s2((int) (f7 * ((float) A1)));
        }
        photoViewer.a3(false);
        photoViewer.f31364u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f37876a;
        if (photoViewer.f31284l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override
    public void d(float f7) {
        mt0 mt0Var;
        mt0 mt0Var2;
        PhotoViewer photoViewer = this.f37876a;
        iu0 iu0Var = photoViewer.f31230f0;
        if (iu0Var != null && iu0Var.f30521x && (mt0Var2 = photoViewer.f31346s3) != null) {
            int i10 = photoViewer.f31327q3.h - org.telegram.ui.Components.v71.S;
            mt0Var2.N = iu0Var;
            if (mt0Var2.W != 0) {
                mt0Var2.W = 0L;
                mt0Var2.f22920f0 = null;
                mt0Var2.f22918e0 = null;
                mt0Var2.f22917d0 = null;
                mt0Var2.b(-1);
            }
            if (i10 != 0) {
                mt0Var2.f22923r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (mt0Var2.f22922n != i11) {
                    mt0Var2.f22922n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((iu0Var.getVideoDuration() * f7) / 1000));
            mt0Var2.f22927y = formatShortDuration;
            mt0Var2.E = (int) Math.ceil(mt0Var2.F.measureText(formatShortDuration));
            mt0Var2.invalidate();
            if (mt0Var2.f22919f != null) {
                Utilities.globalQueue.cancelRunnable(mt0Var2.f22919f);
            }
            double videoDuration = (f7 * iu0Var.getVideoDuration()) / 1000.0d;
            mt0Var2.O = videoDuration;
            String c10 = iu0Var.c((int) videoDuration);
            if (c10 != null) {
                mt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (mt0Var = photoViewer.f31346s3) != null) {
            mt0Var.e(photoViewer.T4, f7, photoViewer.f31327q3.h - org.telegram.ui.Components.v71.S);
        }
        this.f37876a.a3(true);
        PhotoViewer.X(this.f37876a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f37876a;
        if (photoViewer.f31284l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31392x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f37876a;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        t71Var.K(((float) t71Var.p()) * photoViewer.f31388w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f31388w8);
        photoViewer.u0();
        sl0 sl0Var = new sl0(this, 18);
        photoViewer.I2 = sl0Var;
        AndroidUtilities.runOnUIThread(sl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f37876a.f31221e0.invalidate();
    }
}
