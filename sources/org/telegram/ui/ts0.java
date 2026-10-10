package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ts0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.b81, org.telegram.ui.Components.m81, org.telegram.ui.Components.wf0 {
    public final PhotoViewer f42163a;

    public ts0(PhotoViewer photoViewer) {
        this.f42163a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f42163a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.is.f27443f).setDuration(150L).withEndAction(new org.telegram.ui.Components.es0(9, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        ju0 ju0Var;
        PhotoViewer photoViewer = this.f42163a;
        if (photoViewer.F2 == null && ((ju0Var = photoViewer.f33951f0) == null || !ju0Var.f31129x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f33906a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f34085u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f42163a;
        if (photoViewer.f34005l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        mt0 mt0Var;
        mt0 mt0Var2;
        PhotoViewer photoViewer = this.f42163a;
        ju0 ju0Var = photoViewer.f33951f0;
        if (ju0Var != null && ju0Var.f31129x && (mt0Var2 = photoViewer.f34067s3) != null) {
            int i10 = photoViewer.f34048q3.h - org.telegram.ui.Components.n81.S;
            mt0Var2.N = ju0Var;
            if (mt0Var2.W != 0) {
                mt0Var2.W = 0L;
                mt0Var2.f31058f0 = null;
                mt0Var2.f31056e0 = null;
                mt0Var2.f31054d0 = null;
                mt0Var2.b(-1);
            }
            if (i10 != 0) {
                mt0Var2.f31061r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (mt0Var2.f31060n != i11) {
                    mt0Var2.f31060n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((ju0Var.getVideoDuration() * f7) / 1000));
            mt0Var2.f31065y = formatShortDuration;
            mt0Var2.E = (int) Math.ceil(mt0Var2.F.measureText(formatShortDuration));
            mt0Var2.invalidate();
            if (mt0Var2.f31057f != null) {
                Utilities.globalQueue.cancelRunnable(mt0Var2.f31057f);
            }
            double videoDuration = (f7 * ju0Var.getVideoDuration()) / 1000.0d;
            mt0Var2.O = videoDuration;
            String c10 = ju0Var.c((int) videoDuration);
            if (c10 != null) {
                mt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (mt0Var = photoViewer.f34067s3) != null) {
            mt0Var.e(photoViewer.T4, f7, photoViewer.f34048q3.h - org.telegram.ui.Components.n81.S);
        }
        this.f42163a.b3(true);
        PhotoViewer.X(this.f42163a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f42163a;
        if (photoViewer.f34005l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f34113x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f42163a;
        org.telegram.ui.Components.l81 l81Var = photoViewer.F2;
        if (l81Var == null) {
            return;
        }
        l81Var.K(((float) l81Var.p()) * photoViewer.f34109w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f34109w8);
        photoViewer.u0();
        tk0 tk0Var = new tk0(this, 19);
        photoViewer.I2 = tk0Var;
        AndroidUtilities.runOnUIThread(tk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f42163a.f33942e0.invalidate();
    }
}
