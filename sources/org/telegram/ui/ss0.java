package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ss0 implements org.telegram.ui.ActionBar.t0, org.telegram.ui.Components.i71, org.telegram.ui.Components.u71, org.telegram.ui.Components.cf0 {
    public final PhotoViewer f36749a;

    public ss0(PhotoViewer photoViewer) {
        this.f36749a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f36749a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.wr.f28819f).setDuration(150L).withEndAction(new org.telegram.ui.Components.bs0(7, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        hu0 hu0Var;
        PhotoViewer photoViewer = this.f36749a;
        if (photoViewer.F2 == null && ((hu0Var = photoViewer.f30058f0) == null || !hu0Var.f29666x)) {
            return;
        }
        if (!photoViewer.A8 && photoViewer.Q7.getVisibility() == 0) {
            f7 = ((photoViewer.R7.getRightProgress() - photoViewer.R7.getLeftProgress()) * f7) + photoViewer.R7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f30014a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f30192u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f36749a;
        if (photoViewer.f30112l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        lt0 lt0Var;
        lt0 lt0Var2;
        PhotoViewer photoViewer = this.f36749a;
        hu0 hu0Var = photoViewer.f30058f0;
        if (hu0Var != null && hu0Var.f29666x && (lt0Var2 = photoViewer.f30174s3) != null) {
            int i10 = photoViewer.f30155q3.h - org.telegram.ui.Components.v71.S;
            lt0Var2.N = hu0Var;
            if (lt0Var2.W != 0) {
                lt0Var2.W = 0L;
                lt0Var2.f21429f0 = null;
                lt0Var2.f21427e0 = null;
                lt0Var2.f21426d0 = null;
                lt0Var2.b(-1);
            }
            if (i10 != 0) {
                lt0Var2.f21432r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (lt0Var2.f21431n != i11) {
                    lt0Var2.f21431n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((hu0Var.getVideoDuration() * f7) / 1000));
            lt0Var2.f21436y = formatShortDuration;
            lt0Var2.E = (int) Math.ceil(lt0Var2.F.measureText(formatShortDuration));
            lt0Var2.invalidate();
            if (lt0Var2.f21428f != null) {
                Utilities.globalQueue.cancelRunnable(lt0Var2.f21428f);
            }
            double videoDuration = (f7 * hu0Var.getVideoDuration()) / 1000.0d;
            lt0Var2.O = videoDuration;
            String c10 = hu0Var.c((int) videoDuration);
            if (c10 != null) {
                lt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (lt0Var = photoViewer.f30174s3) != null) {
            lt0Var.e(photoViewer.T4, f7, photoViewer.f30155q3.h - org.telegram.ui.Components.v71.S);
        }
        this.f36749a.b3(true);
        PhotoViewer.X(this.f36749a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f36749a;
        if (photoViewer.f30112l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f30220x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f36749a;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var == null) {
            return;
        }
        t71Var.K(((float) t71Var.p()) * photoViewer.f30206v8);
        photoViewer.F2.B();
        photoViewer.R7.setProgress(photoViewer.f30206v8);
        photoViewer.u0();
        ql0 ql0Var = new ql0(this, 18);
        photoViewer.I2 = ql0Var;
        AndroidUtilities.runOnUIThread(ql0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f36749a.f30049e0.invalidate();
    }
}
