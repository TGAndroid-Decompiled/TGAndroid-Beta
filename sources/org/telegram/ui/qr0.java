package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qr0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.z51, org.telegram.ui.Components.l61, org.telegram.ui.Components.ae0 {
    public final PhotoViewer f42183a;

    public qr0(PhotoViewer photoViewer) {
        this.f42183a = photoViewer;
    }

    public void a(boolean z10) {
        float f10;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f42183a;
        if (photoViewer.R0.isClickable() != z11) {
            photoViewer.R0.setClickable(z11);
            photoViewer.R0.setVisibility(0);
            photoViewer.R0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.R0.animate();
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.gr.f28844f).setDuration(150L).withEndAction(new org.telegram.ui.Components.a50(12, photoViewer, z11));
        }
    }

    @Override
    public void b(float f10) {
        gt0 gt0Var;
        PhotoViewer photoViewer = this.f42183a;
        if (photoViewer.B2 == null && ((gt0Var = photoViewer.f35588b0) == null || !gt0Var.f35295x)) {
            return;
        }
        if (!photoViewer.w8 && photoViewer.M7.getVisibility() == 0) {
            f10 = ((photoViewer.N7.getRightProgress() - photoViewer.N7.getLeftProgress()) * f10) + photoViewer.N7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.W2 = f10;
        } else {
            photoViewer.t2((int) (f10 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f35726q3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f42183a;
        if (photoViewer.f35648h3 && photoViewer.L3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f42183a;
        if (photoViewer.f35648h3 && photoViewer.L3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f35754t2);
        }
    }

    @Override
    public void e(float f10) {
        js0 js0Var;
        js0 js0Var2;
        PhotoViewer photoViewer = this.f42183a;
        gt0 gt0Var = photoViewer.f35588b0;
        if (gt0Var != null && gt0Var.f35295x && (js0Var2 = photoViewer.f35710o3) != null) {
            int i9 = photoViewer.f35691m3.h - org.telegram.ui.Components.m61.S;
            js0Var2.J = gt0Var;
            if (js0Var2.S != 0) {
                js0Var2.S = 0L;
                js0Var2.f32090b0 = null;
                js0Var2.f32088a0 = null;
                js0Var2.W = null;
                js0Var2.b(-1);
            }
            if (i9 != 0) {
                js0Var2.f32096r = i9;
                int i10 = ((int) (i9 * f10)) / 5;
                if (js0Var2.f32095n != i10) {
                    js0Var2.f32095n = i10;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((gt0Var.getVideoDuration() * f10) / 1000));
            js0Var2.f32100y = formatShortDuration;
            js0Var2.A = (int) Math.ceil(js0Var2.B.measureText(formatShortDuration));
            js0Var2.invalidate();
            if (js0Var2.f32094f != null) {
                Utilities.globalQueue.cancelRunnable(js0Var2.f32094f);
            }
            double videoDuration = (f10 * gt0Var.getVideoDuration()) / 1000.0d;
            js0Var2.K = videoDuration;
            String c10 = gt0Var.c((int) videoDuration);
            if (c10 != null) {
                js0Var2.M.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.B2 != null && (js0Var = photoViewer.f35710o3) != null) {
            js0Var.e(photoViewer.P4, f10, photoViewer.f35691m3.h - org.telegram.ui.Components.m61.S);
        }
        this.f42183a.b3(true);
        PhotoViewer.W(this.f42183a);
    }

    public void f() {
        PhotoViewer photoViewer = this.f42183a;
        org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
        if (k61Var == null) {
            return;
        }
        k61Var.L(((float) k61Var.q()) * photoViewer.f35741r8);
        photoViewer.B2.C();
        photoViewer.N7.setProgress(photoViewer.f35741r8);
        photoViewer.t0();
        zk0 zk0Var = new zk0(this, 19);
        photoViewer.E2 = zk0Var;
        AndroidUtilities.runOnUIThread(zk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f42183a.f35580a0.invalidate();
    }
}
