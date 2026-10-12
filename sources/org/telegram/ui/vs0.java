package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vs0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.g81, org.telegram.ui.Components.r81, org.telegram.ui.Components.yf0 {
    public final PhotoViewer f42845a;

    public vs0(PhotoViewer photoViewer) {
        this.f42845a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f42845a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.js.f27627f).setDuration(150L).withEndAction(new org.telegram.ui.Components.js0(9, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        lu0 lu0Var;
        PhotoViewer photoViewer = this.f42845a;
        if (photoViewer.F2 == null && ((lu0Var = photoViewer.f33750f0) == null || !lu0Var.f31512x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f33705a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f33884u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f42845a;
        if (photoViewer.f33804l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        ot0 ot0Var;
        ot0 ot0Var2;
        PhotoViewer photoViewer = this.f42845a;
        lu0 lu0Var = photoViewer.f33750f0;
        if (lu0Var != null && lu0Var.f31512x && (ot0Var2 = photoViewer.f33866s3) != null) {
            int i10 = photoViewer.f33847q3.h - org.telegram.ui.Components.s81.S;
            ot0Var2.N = lu0Var;
            if (ot0Var2.W != 0) {
                ot0Var2.W = 0L;
                ot0Var2.f32993f0 = null;
                ot0Var2.f32991e0 = null;
                ot0Var2.f32989d0 = null;
                ot0Var2.b(-1);
            }
            if (i10 != 0) {
                ot0Var2.f32996r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (ot0Var2.f32995n != i11) {
                    ot0Var2.f32995n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((lu0Var.getVideoDuration() * f7) / 1000));
            ot0Var2.f33000y = formatShortDuration;
            ot0Var2.E = (int) Math.ceil(ot0Var2.F.measureText(formatShortDuration));
            ot0Var2.invalidate();
            if (ot0Var2.f32992f != null) {
                Utilities.globalQueue.cancelRunnable(ot0Var2.f32992f);
            }
            double videoDuration = (f7 * lu0Var.getVideoDuration()) / 1000.0d;
            ot0Var2.O = videoDuration;
            String c10 = lu0Var.c((int) videoDuration);
            if (c10 != null) {
                ot0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (ot0Var = photoViewer.f33866s3) != null) {
            ot0Var.e(photoViewer.T4, f7, photoViewer.f33847q3.h - org.telegram.ui.Components.s81.S);
        }
        this.f42845a.b3(true);
        PhotoViewer.X(this.f42845a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f42845a;
        if (photoViewer.f33804l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f33912x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f42845a;
        org.telegram.ui.Components.q81 q81Var = photoViewer.F2;
        if (q81Var == null) {
            return;
        }
        q81Var.K(((float) q81Var.p()) * photoViewer.f33908w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f33908w8);
        photoViewer.u0();
        uk0 uk0Var = new uk0(this, 19);
        photoViewer.I2 = uk0Var;
        AndroidUtilities.runOnUIThread(uk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f42845a.f33741e0.invalidate();
    }
}
