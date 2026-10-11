package org.telegram.ui;

import android.view.ViewPropertyAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ss0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.c81, org.telegram.ui.Components.n81, org.telegram.ui.Components.wf0 {
    public final PhotoViewer f41849a;

    public ss0(PhotoViewer photoViewer) {
        this.f41849a = photoViewer;
    }

    public void a(boolean z10) {
        float f7;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f41849a;
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
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.is.f27451f).setDuration(150L).withEndAction(new org.telegram.ui.Components.fs0(9, photoViewer, z11));
        }
    }

    @Override
    public void b(float f7) {
        iu0 iu0Var;
        PhotoViewer photoViewer = this.f41849a;
        if (photoViewer.F2 == null && ((iu0Var = photoViewer.f33941f0) == null || !iu0Var.f31445x)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f7 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f7) + photoViewer.S7.getLeftProgress();
        }
        long A1 = photoViewer.A1();
        if (A1 == -9223372036854775807L) {
            photoViewer.f33896a3 = f7;
        } else {
            photoViewer.t2((int) (f7 * ((float) A1)));
        }
        photoViewer.b3(false);
        photoViewer.f34075u3 = false;
    }

    @Override
    public void c() {
        PhotoViewer photoViewer = this.f41849a;
        if (photoViewer.f33995l3 && photoViewer.P3) {
            photoViewer.s2();
        }
    }

    @Override
    public void d(float f7) {
        lt0 lt0Var;
        lt0 lt0Var2;
        PhotoViewer photoViewer = this.f41849a;
        iu0 iu0Var = photoViewer.f33941f0;
        if (iu0Var != null && iu0Var.f31445x && (lt0Var2 = photoViewer.f34057s3) != null) {
            int i10 = photoViewer.f34038q3.h - org.telegram.ui.Components.o81.S;
            lt0Var2.N = iu0Var;
            if (lt0Var2.W != 0) {
                lt0Var2.W = 0L;
                lt0Var2.f31344f0 = null;
                lt0Var2.f31342e0 = null;
                lt0Var2.f31340d0 = null;
                lt0Var2.b(-1);
            }
            if (i10 != 0) {
                lt0Var2.f31347r = i10;
                int i11 = ((int) (i10 * f7)) / 5;
                if (lt0Var2.f31346n != i11) {
                    lt0Var2.f31346n = i11;
                }
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration((int) ((iu0Var.getVideoDuration() * f7) / 1000));
            lt0Var2.f31351y = formatShortDuration;
            lt0Var2.E = (int) Math.ceil(lt0Var2.F.measureText(formatShortDuration));
            lt0Var2.invalidate();
            if (lt0Var2.f31343f != null) {
                Utilities.globalQueue.cancelRunnable(lt0Var2.f31343f);
            }
            double videoDuration = (f7 * iu0Var.getVideoDuration()) / 1000.0d;
            lt0Var2.O = videoDuration;
            String c10 = iu0Var.c((int) videoDuration);
            if (c10 != null) {
                lt0Var2.Q.setImage(c10, null, null, null, 0L);
            }
        } else if (photoViewer.F2 != null && (lt0Var = photoViewer.f34057s3) != null) {
            lt0Var.e(photoViewer.T4, f7, photoViewer.f34038q3.h - org.telegram.ui.Components.o81.S);
        }
        this.f41849a.b3(true);
        PhotoViewer.X(this.f41849a);
    }

    @Override
    public void e() {
        PhotoViewer photoViewer = this.f41849a;
        if (photoViewer.f33995l3 && photoViewer.P3) {
            AndroidUtilities.cancelRunOnUIThread(photoViewer.f34103x2);
        }
    }

    public void f() {
        PhotoViewer photoViewer = this.f41849a;
        org.telegram.ui.Components.m81 m81Var = photoViewer.F2;
        if (m81Var == null) {
            return;
        }
        m81Var.K(((float) m81Var.p()) * photoViewer.f34099w8);
        photoViewer.F2.B();
        photoViewer.S7.setProgress(photoViewer.f34099w8);
        photoViewer.u0();
        sk0 sk0Var = new sk0(this, 19);
        photoViewer.I2 = sk0Var;
        AndroidUtilities.runOnUIThread(sk0Var, 860L);
    }

    @Override
    public void invalidate() {
        this.f41849a.f33932e0.invalidate();
    }
}
