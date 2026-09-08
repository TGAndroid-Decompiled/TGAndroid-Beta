package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ss0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.v61, org.telegram.ui.Components.h71, org.telegram.ui.Components.te0 {
    public final PhotoViewer f40548a;

    public ss0(PhotoViewer photoViewer) {
        this.f40548a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f40548a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.pr.f29493f).setDuration(150L).withEndAction(new org.telegram.ui.Components.mr0(8, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        hu0 hu0Var;
        PhotoViewer photoViewer = this.f40548a;
        if (photoViewer.F2 == null && ((hu0Var = photoViewer.f33585f0) == null || !hu0Var.f29743x)) {
            return;
        }
        if (!photoViewer.A8 && photoViewer.Q7.getVisibility() == 0) {
            f7 = ((photoViewer.R7.getRightProgress() - photoViewer.R7.getLeftProgress()) * f7) + photoViewer.R7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f33540a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f33719u3 = false;
    }

    @Override
    public void c(float f7) {
        lt0 lt0Var;
        lt0 lt0Var2;
        PhotoViewer photoViewer = this.f40548a;
        hu0 hu0Var = photoViewer.f33585f0;
        if (hu0Var != null && hu0Var.f29743x && (lt0Var2 = photoViewer.f33701s3) != null) {
            int i10 = photoViewer.f33682q3.h - org.telegram.ui.Components.i71.S;
            lt0Var2.N = hu0Var;
            if (lt0Var2.W != 0) {
                lt0Var2.W = 0L;
                lt0Var2.f28704f0 = null;
                lt0Var2.f28702e0 = null;
                lt0Var2.f28700d0 = null;
                lt0Var2.b(-1);
            }
            if (i10 != 0) {
                lt0Var2.f28707r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (lt0Var2.f28706n != i11) {
                    lt0Var2.f28706n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((hu0Var.getVideoDuration() * f7) / 1000));
            lt0Var2.f28711y = formatShortDuration;
            lt0Var2.E = (int) Math.ceil(lt0Var2.F.measureText(formatShortDuration));
            lt0Var2.invalidate();
            if (lt0Var2.f28703f != null) {
                Utilities.globalQueue.cancelRunnable(lt0Var2.f28703f);
            }
            double videoDuration = (f7 * hu0Var.getVideoDuration()) / 1000.0d;
            lt0Var2.O = videoDuration;
            String c10 = hu0Var.c((int) videoDuration);
            if (c10 != null) {
                lt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (lt0Var = photoViewer.f33701s3) != null) {
            lt0Var.e(photoViewer.T4, f7, photoViewer.f33682q3.h - org.telegram.ui.Components.i71.S);
        }
        this.f40548a.b3(true);
        PhotoViewer.X(this.f40548a);
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f40548a;
        if (photoViewer.f33639l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f40548a;
        if (photoViewer.f33639l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f33747x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f40548a;
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        if (g71Var == null) {
            return;
        }
        g71Var.K(((float) g71Var.p()) * photoViewer.f33733v8);
        photoViewer.F2.B();
        photoViewer.R7.setProgress(photoViewer.f33733v8);
        photoViewer.u0();
        rl0 rl0Var = new rl0(this, 18);
        photoViewer.I2 = rl0Var;
        AndroidUtilities.runOnUIThread(rl0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f40548a.f33576e0.invalidate();
    }
}
