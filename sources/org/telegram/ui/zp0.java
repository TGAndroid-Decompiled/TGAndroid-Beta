package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.Utilities;
public final class zp0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.m61, org.telegram.ui.Components.w61, org.telegram.ui.Components.ae0 {
    public final PhotoViewer f44037a;

    public zp0(PhotoViewer photoViewer) {
        this.f44037a = photoViewer;
    }

    @Override
    public void a() {
        PhotoViewer photoViewer = this.f44037a;
        if (photoViewer.f33541l3 && photoViewer.P3) {
            photoViewer.v2();
        }
    }

    public void b(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f44037a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.gr.f26523f).setDuration(150L).withEndAction(new k2.v(29, photoViewer, z11));
        }
    }

    @Override
    public void c(float f7) {
        lr0 lr0Var;
        PhotoViewer photoViewer = this.f44037a;
        if (photoViewer.F2 == null && ((lr0Var = photoViewer.f33486f0) == null || !lr0Var.f31278y)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long C1 = photoViewer.C1();
        if (C1 == -9223372036854775807L) {
            photoViewer.f33442a3 = f7;
        } else {
            photoViewer.w2((int) (f7 * ((float) C1)));
        }
        photoViewer.e3(false);
        photoViewer.f33621u3 = false;
    }

    @Override
    public void d(float f7) {
        rq0 rq0Var;
        rq0 rq0Var2;
        PhotoViewer photoViewer = this.f44037a;
        lr0 lr0Var = photoViewer.f33486f0;
        if (lr0Var != null && lr0Var.f31278y && (rq0Var2 = photoViewer.f33603s3) != null) {
            int i10 = photoViewer.f33584q3.h - org.telegram.ui.Components.x61.S;
            rq0Var2.N = lr0Var;
            if (rq0Var2.W != 0) {
                rq0Var2.W = 0L;
                rq0Var2.f25051f0 = null;
                rq0Var2.f25049e0 = null;
                rq0Var2.f25048d0 = null;
                rq0Var2.b(-1);
            }
            if (i10 != 0) {
                rq0Var2.f25054r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (rq0Var2.f25053n != i11) {
                    rq0Var2.f25053n = i11;
                }
            }
            String g02 = org.telegram.messenger.i0.g0((int) ((lr0Var.getVideoDuration() * f7) / 1000), false, false);
            rq0Var2.D = g02;
            rq0Var2.E = (int) Math.ceil(rq0Var2.F.measureText(g02));
            rq0Var2.invalidate();
            if (rq0Var2.f25050f != null) {
                Utilities.e.a(rq0Var2.f25050f);
            }
            double videoDuration = (f7 * lr0Var.getVideoDuration()) / 1000.0d;
            rq0Var2.O = videoDuration;
            String c10 = lr0Var.c((int) videoDuration);
            if (c10 != null) {
                rq0Var2.Q.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (rq0Var = photoViewer.f33603s3) != null) {
            rq0Var.e(photoViewer.T4, f7, photoViewer.f33584q3.h - org.telegram.ui.Components.x61.S);
        }
        this.f44037a.e3(true);
        PhotoViewer.Y(this.f44037a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f44037a;
        if (photoViewer.f33541l3 && photoViewer.P3) {
            org.telegram.messenger.i0.r(photoViewer.f33649x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f44037a;
        org.telegram.ui.Components.v61 v61Var = photoViewer.F2;
        if (v61Var == null) {
            return;
        }
        v61Var.p0(((float) v61Var.U()) * photoViewer.f33645w8);
        photoViewer.F2.g0();
        photoViewer.S7.setProgress(photoViewer.f33645w8);
        photoViewer.v0();
        kg0 kg0Var = new kg0(this, 22);
        photoViewer.I2 = kg0Var;
        org.telegram.messenger.i0.h3(kg0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f44037a.f33477e0.invalidate();
    }
}
