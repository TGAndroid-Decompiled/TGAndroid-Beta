package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class rr0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.b61, org.telegram.ui.Components.n61, org.telegram.ui.Components.fe0 {

    public final PhotoViewer f42322a;

    public rr0(PhotoViewer photoViewer) {
        this.f42322a = photoViewer;
    }

    public void a(boolean z10) {
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f42322a;
        if (photoViewer.R0.isClickable() != z11) {
            photoViewer.R0.setClickable(z11);
            photoViewer.R0.setVisibility(0);
            photoViewer.R0.clearAnimation();
            photoViewer.R0.animate().alpha(!z10 ? 1.0f : 0.0f).setInterpolator(org.telegram.ui.Components.er.f28122f).setDuration(150L).withEndAction(new org.telegram.ui.Components.f50(12, photoViewer, z11));
        }
    }

    @Override
    public void b(float f10) {
        ht0 ht0Var;
        PhotoViewer photoViewer = this.f42322a;
        if (photoViewer.B2 != null || ((ht0Var = photoViewer.f35591b0) != null && ht0Var.f27746x)) {
            if (!photoViewer.f35790w8 && photoViewer.M7.getVisibility() == 0) {
                f10 = ((photoViewer.N7.getRightProgress() - photoViewer.N7.getLeftProgress()) * f10) + photoViewer.N7.getLeftProgress();
            }
            long jA1 = photoViewer.A1();
            if (jA1 == -9223372036854775807L) {
                photoViewer.W2 = f10;
            } else {
                photoViewer.t2((int) (f10 * jA1));
            }
            photoViewer.b3(false);
            photoViewer.f35730q3 = false;
        }
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f42322a;
        if (photoViewer.f35651h3 && photoViewer.L3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f42322a;
        if (photoViewer.f35651h3 && photoViewer.L3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f35757t2);
        }
    }

    @Override
    public void e(float f10) {
        ks0 ks0Var;
        ks0 ks0Var2;
        String strC;
        PhotoViewer photoViewer = this.f42322a;
        ht0 ht0Var = photoViewer.f35591b0;
        if (ht0Var != null && ht0Var.f27746x && (ks0Var2 = photoViewer.f35713o3) != null) {
            int i10 = photoViewer.f35694m3.h - org.telegram.ui.Components.o61.S;
            ks0Var2.J = ht0Var;
            if (ks0Var2.S != 0) {
                ks0Var2.S = 0L;
                ks0Var2.f32663b0 = null;
                ks0Var2.f32661a0 = null;
                ks0Var2.W = null;
                ks0Var2.b(-1);
            }
            if (i10 != 0) {
                ks0Var2.f32669r = i10;
                int i11 = ((int) (i10 * f10)) / 5;
                if (ks0Var2.f32668n != i11) {
                    ks0Var2.f32668n = i11;
                    String shortDuration = AndroidUtilities.formatShortDuration((int) (((long) (ht0Var.getVideoDuration() * f10)) / 1000));
                    ks0Var2.f32673y = shortDuration;
                    ks0Var2.A = (int) Math.ceil(ks0Var2.B.measureText(shortDuration));
                    ks0Var2.invalidate();
                    if (ks0Var2.f32667f != null) {
                        Utilities.globalQueue.cancelRunnable(ks0Var2.f32667f);
                    }
                    double videoDuration = ((double) (f10 * ht0Var.getVideoDuration())) / 1000.0d;
                    ks0Var2.K = videoDuration;
                    strC = ht0Var.c((int) videoDuration);
                    if (strC != null) {
                        ks0Var2.M.setImage(strC, null, null, null, 0L);
                    }
                }
            } else {
                String shortDuration2 = AndroidUtilities.formatShortDuration((int) (((long) (ht0Var.getVideoDuration() * f10)) / 1000));
                ks0Var2.f32673y = shortDuration2;
                ks0Var2.A = (int) Math.ceil(ks0Var2.B.measureText(shortDuration2));
                ks0Var2.invalidate();
                if (ks0Var2.f32667f != null) {
                    Utilities.globalQueue.cancelRunnable(ks0Var2.f32667f);
                }
                double videoDuration2 = ((double) (f10 * ht0Var.getVideoDuration())) / 1000.0d;
                ks0Var2.K = videoDuration2;
                strC = ht0Var.c((int) videoDuration2);
                if (strC != null) {
                    ks0Var2.M.setImage(strC, null, null, null, 0L);
                }
            }
        } else if (photoViewer.B2 != null && (ks0Var = photoViewer.f35713o3) != null) {
            ks0Var.e(photoViewer.P4, f10, photoViewer.f35694m3.h - org.telegram.ui.Components.o61.S);
        }
        this.f42322a.b3(true);
        PhotoViewer.X(this.f42322a);
    }

    public void f() {
        PhotoViewer photoViewer = this.f42322a;
        org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
        if (m61Var == null) {
            return;
        }
        m61Var.L((long) (m61Var.q() * photoViewer.f35744r8));
        photoViewer.B2.C();
        photoViewer.N7.setProgress(photoViewer.f35744r8);
        photoViewer.u0();
        zk0 zk0Var = new zk0(this, 19);
        photoViewer.E2 = zk0Var;
        AndroidUtilities.runOnUIThread(zk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f42322a.f35583a0.invalidate();
    }
}
