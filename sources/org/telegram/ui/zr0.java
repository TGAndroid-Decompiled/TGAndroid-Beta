package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zr0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.s71, org.telegram.ui.Components.d81, org.telegram.ui.Components.nf0 {
    public final PhotoViewer f43798a;

    public zr0(PhotoViewer photoViewer) {
        this.f43798a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f43798a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.bs.f25021f).setDuration(150L).withEndAction(new org.telegram.ui.Components.b60(13, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        ot0 ot0Var;
        PhotoViewer photoViewer = this.f43798a;
        if (photoViewer.F2 == null && ((ot0Var = photoViewer.f33288f0) == null || !ot0Var.f28159x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long B1 = photoViewer.B1();
        if (B1 == -9223372036854775807L) {
            photoViewer.f33244a3 = f7;
        } else {
            photoViewer.v2((int) (f7 * ((float) B1)));
        }
        photoViewer.d3(false);
        photoViewer.f33423u3 = false;
    }

    @Override
    public void c(float f7) {
        ss0 ss0Var;
        ss0 ss0Var2;
        PhotoViewer photoViewer = this.f43798a;
        ot0 ot0Var = photoViewer.f33288f0;
        if (ot0Var != null && ot0Var.f28159x && (ss0Var2 = photoViewer.f33405s3) != null) {
            int i10 = photoViewer.f33386q3.h - org.telegram.ui.Components.e81.S;
            ss0Var2.N = ot0Var;
            if (ss0Var2.W != 0) {
                ss0Var2.W = 0L;
                ss0Var2.f27440f0 = null;
                ss0Var2.f27438e0 = null;
                ss0Var2.f27437d0 = null;
                ss0Var2.b(-1);
            }
            if (i10 != 0) {
                ss0Var2.f27443r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ss0Var2.f27442n != i11) {
                    ss0Var2.f27442n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((ot0Var.getVideoDuration() * f7) / 1000));
            ss0Var2.f27447y = formatShortDuration;
            ss0Var2.E = (int) Math.ceil(ss0Var2.F.measureText(formatShortDuration));
            ss0Var2.invalidate();
            if (ss0Var2.f27439f != null) {
                Utilities.globalQueue.cancelRunnable(ss0Var2.f27439f);
            }
            double videoDuration = (f7 * ot0Var.getVideoDuration()) / 1000.0d;
            ss0Var2.O = videoDuration;
            String c10 = ot0Var.c((int) videoDuration);
            if (c10 != null) {
                ss0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ss0Var = photoViewer.f33405s3) != null) {
            ss0Var.e(photoViewer.T4, f7, photoViewer.f33386q3.h - org.telegram.ui.Components.e81.S);
        }
        this.f43798a.d3(true);
        PhotoViewer.Y(this.f43798a);
    }

    public void d() {
        PhotoViewer photoViewer = this.f43798a;
        org.telegram.ui.Components.c81 c81Var = photoViewer.F2;
        if (c81Var == null) {
            return;
        }
        c81Var.K(((float) c81Var.p()) * photoViewer.f33447w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f33447w8);
        photoViewer.v0();
        ck0 ck0Var = new ck0(this, 19);
        photoViewer.I2 = ck0Var;
        AndroidUtilities.runOnUIThread(ck0Var, 860L);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f43798a;
        if (photoViewer.f33343l3 && photoViewer.P3) {
            photoViewer.u2();
        }
    }

    @Override
    public void f() {
        PhotoViewer photoViewer = this.f43798a;
        if (photoViewer.f33343l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f33451x2);
        }
    }

    @Override
    public void invalidate() {
        this.f43798a.f33279e0.invalidate();
    }
}
