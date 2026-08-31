package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.z61, org.telegram.ui.Components.l71, org.telegram.ui.Components.ze0 {
    public final PhotoViewer f43983a;

    public zr0(PhotoViewer photoViewer) {
        this.f43983a = photoViewer;
    }

    public void a(boolean z4) {
        float f10;
        boolean z10 = !z4;
        PhotoViewer photoViewer = this.f43983a;
        if (photoViewer.S0.isClickable() != z10) {
            photoViewer.S0.setClickable(z10);
            photoViewer.S0.setVisibility(0);
            photoViewer.S0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.S0.animate();
            if (!z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.pr.f30183f).setDuration(150L).withEndAction(new org.telegram.ui.Components.rv0(5, photoViewer, z10));
        }
    }

    @Override
    public void b(float f10) {
        pt0 pt0Var;
        PhotoViewer photoViewer = this.f43983a;
        if (photoViewer.C2 == null && ((pt0Var = photoViewer.f34240c0) == null || !pt0Var.f33068x)) {
            return;
        }
        if (!photoViewer.f34438x8 && photoViewer.N7.getVisibility() == 0) {
            f10 = ((photoViewer.O7.getRightProgress() - photoViewer.O7.getLeftProgress()) * f10) + photoViewer.O7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.X2 = f10;
        } else {
            photoViewer.t2((int) (f10 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f34378r3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f43983a;
        if (photoViewer.f34297i3 && photoViewer.M3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f10) {
        ts0 ts0Var;
        ts0 ts0Var2;
        PhotoViewer photoViewer = this.f43983a;
        pt0 pt0Var = photoViewer.f34240c0;
        if (pt0Var != null && pt0Var.f33068x && (ts0Var2 = photoViewer.f34359p3) != null) {
            int i10 = photoViewer.f34341n3.h - org.telegram.ui.Components.m71.S;
            ts0Var2.K = pt0Var;
            if (ts0Var2.T != 0) {
                ts0Var2.T = 0L;
                ts0Var2.f30630c0 = null;
                ts0Var2.f30628b0 = null;
                ts0Var2.f30626a0 = null;
                ts0Var2.b(-1);
            }
            if (i10 != 0) {
                ts0Var2.f30635r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (ts0Var2.f30634n != i11) {
                    ts0Var2.f30634n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((pt0Var.getVideoDuration() * f10) / 1000));
            ts0Var2.f30639y = formatShortDuration;
            ts0Var2.B = (int) Math.ceil(ts0Var2.C.measureText(formatShortDuration));
            ts0Var2.invalidate();
            if (ts0Var2.f30633f != null) {
                Utilities.globalQueue.cancelRunnable(ts0Var2.f30633f);
            }
            double videoDuration = (f10 * pt0Var.getVideoDuration()) / 1000.0d;
            ts0Var2.L = videoDuration;
            String c3 = pt0Var.c((int) videoDuration);
            if (c3 != null) {
                ts0Var2.N.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.C2 != null && (ts0Var = photoViewer.f34359p3) != null) {
            ts0Var.e(photoViewer.Q4, f10, photoViewer.f34341n3.h - org.telegram.ui.Components.m71.S);
        }
        this.f43983a.b3(true);
        PhotoViewer.X(this.f43983a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f43983a;
        if (photoViewer.f34297i3 && photoViewer.M3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f34403u2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f43983a;
        org.telegram.ui.Components.k71 k71Var = photoViewer.C2;
        if (k71Var == null) {
            return;
        }
        k71Var.K(((float) k71Var.p()) * photoViewer.f34392s8);
        photoViewer.C2.B();
        photoViewer.O7.setProgress(photoViewer.f34392s8);
        photoViewer.u0();
        gl0 gl0Var = new gl0(this, 19);
        photoViewer.F2 = gl0Var;
        AndroidUtilities.runOnUIThread(gl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f43983a.f34230b0.invalidate();
    }
}
