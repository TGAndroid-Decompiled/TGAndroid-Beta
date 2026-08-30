package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.x61, org.telegram.ui.Components.j71, org.telegram.ui.Components.xe0 {
    public final PhotoViewer f40298a;

    public xr0(PhotoViewer photoViewer) {
        this.f40298a = photoViewer;
    }

    public void a(boolean z4) {
        float f10;
        boolean z10 = !z4;
        PhotoViewer photoViewer = this.f40298a;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.nr.f27346f).setDuration(150L).withEndAction(new org.telegram.ui.Components.kv0(6, photoViewer, z10));
        }
    }

    @Override
    public void b(float f10) {
        nt0 nt0Var;
        PhotoViewer photoViewer = this.f40298a;
        if (photoViewer.C2 == null && ((nt0Var = photoViewer.f31715c0) == null || !nt0Var.f29456x)) {
            return;
        }
        if (!photoViewer.f31912x8 && photoViewer.N7.getVisibility() == 0) {
            f10 = ((photoViewer.O7.getRightProgress() - photoViewer.O7.getLeftProgress()) * f10) + photoViewer.O7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.X2 = f10;
        } else {
            photoViewer.t2((int) (f10 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f31852r3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f40298a;
        if (photoViewer.f31771i3 && photoViewer.M3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f10) {
        rs0 rs0Var;
        rs0 rs0Var2;
        PhotoViewer photoViewer = this.f40298a;
        nt0 nt0Var = photoViewer.f31715c0;
        if (nt0Var != null && nt0Var.f29456x && (rs0Var2 = photoViewer.f31833p3) != null) {
            int i10 = photoViewer.f31815n3.h - org.telegram.ui.Components.k71.S;
            rs0Var2.K = nt0Var;
            if (rs0Var2.T != 0) {
                rs0Var2.T = 0L;
                rs0Var2.f27773c0 = null;
                rs0Var2.f27771b0 = null;
                rs0Var2.f27769a0 = null;
                rs0Var2.b(-1);
            }
            if (i10 != 0) {
                rs0Var2.f27777r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (rs0Var2.f27776n != i11) {
                    rs0Var2.f27776n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((nt0Var.getVideoDuration() * f10) / 1000));
            rs0Var2.f27781y = formatShortDuration;
            rs0Var2.B = (int) Math.ceil(rs0Var2.C.measureText(formatShortDuration));
            rs0Var2.invalidate();
            if (rs0Var2.f27775f != null) {
                Utilities.globalQueue.cancelRunnable(rs0Var2.f27775f);
            }
            double videoDuration = (f10 * nt0Var.getVideoDuration()) / 1000.0d;
            rs0Var2.L = videoDuration;
            String c3 = nt0Var.c((int) videoDuration);
            if (c3 != null) {
                rs0Var2.N.setImage(c3, null, null, null, 0L);
            }
        } else if (photoViewer.C2 != null && (rs0Var = photoViewer.f31833p3) != null) {
            rs0Var.e(photoViewer.Q4, f10, photoViewer.f31815n3.h - org.telegram.ui.Components.k71.S);
        }
        this.f40298a.b3(true);
        PhotoViewer.X(this.f40298a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f40298a;
        if (photoViewer.f31771i3 && photoViewer.M3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f31877u2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f40298a;
        org.telegram.ui.Components.i71 i71Var = photoViewer.C2;
        if (i71Var == null) {
            return;
        }
        i71Var.K(((float) i71Var.p()) * photoViewer.f31866s8);
        photoViewer.C2.B();
        photoViewer.O7.setProgress(photoViewer.f31866s8);
        photoViewer.u0();
        el0 el0Var = new el0(this, 19);
        photoViewer.F2 = el0Var;
        AndroidUtilities.runOnUIThread(el0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f40298a.f31705b0.invalidate();
    }
}
