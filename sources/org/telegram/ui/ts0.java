package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ts0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.v61, org.telegram.ui.Components.h71, org.telegram.ui.Components.te0 {
    public final PhotoViewer f37780a;

    public ts0(PhotoViewer photoViewer) {
        this.f37780a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f37780a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f27423f).setDuration(150L).withEndAction(new org.telegram.ui.Components.sr0(7, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        iu0 iu0Var;
        PhotoViewer photoViewer = this.f37780a;
        if (photoViewer.F2 == null && ((iu0Var = photoViewer.f30945f0) == null || !iu0Var.f27330x)) {
            return;
        }
        if (!photoViewer.A8 && photoViewer.Q7.getVisibility() == 0) {
            f7 = ((photoViewer.R7.getRightProgress() - photoViewer.R7.getLeftProgress()) * f7) + photoViewer.R7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f30901a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f31079u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f37780a;
        if (photoViewer.f30999l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        mt0 mt0Var;
        mt0 mt0Var2;
        PhotoViewer photoViewer = this.f37780a;
        iu0 iu0Var = photoViewer.f30945f0;
        if (iu0Var != null && iu0Var.f27330x && (mt0Var2 = photoViewer.f31061s3) != null) {
            int i10 = photoViewer.f31042q3.h - org.telegram.ui.Components.i71.S;
            mt0Var2.N = iu0Var;
            if (mt0Var2.W != 0) {
                mt0Var2.W = 0L;
                mt0Var2.f26384f0 = null;
                mt0Var2.f26382e0 = null;
                mt0Var2.f26381d0 = null;
                mt0Var2.b(-1);
            }
            if (i10 != 0) {
                mt0Var2.f26387r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (mt0Var2.f26386n != i11) {
                    mt0Var2.f26386n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((iu0Var.getVideoDuration() * f7) / 1000));
            mt0Var2.f26391y = formatShortDuration;
            mt0Var2.E = (int) Math.ceil(mt0Var2.F.measureText(formatShortDuration));
            mt0Var2.invalidate();
            if (mt0Var2.f26383f != null) {
                Utilities.globalQueue.cancelRunnable(mt0Var2.f26383f);
            }
            double videoDuration = (f7 * iu0Var.getVideoDuration()) / 1000.0d;
            mt0Var2.O = videoDuration;
            String c10 = iu0Var.c((int) videoDuration);
            if (c10 != null) {
                mt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (mt0Var = photoViewer.f31061s3) != null) {
            mt0Var.e(photoViewer.T4, f7, photoViewer.f31042q3.h - org.telegram.ui.Components.i71.S);
        }
        this.f37780a.b3(true);
        PhotoViewer.X(this.f37780a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f37780a;
        if (photoViewer.f30999l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31107x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f37780a;
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        g71Var.K(((float) g71Var.p()) * photoViewer.f31093v8);
        photoViewer.F2.B();
        photoViewer.R7.setProgress(photoViewer.f31093v8);
        photoViewer.u0();
        pl0 pl0Var = new pl0(this, 18);
        photoViewer.I2 = pl0Var;
        AndroidUtilities.runOnUIThread(pl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f37780a.f30936e0.invalidate();
    }
}
