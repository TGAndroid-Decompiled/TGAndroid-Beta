package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f49113a;
    public final rp0 f49114b;

    public qp0(rp0 rp0Var, int i7) {
        this.f49114b = rp0Var;
        this.f49113a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f49114b.f49556b.f41442j8) {
            PhotoViewer photoViewer = this.f49114b.f49556b;
            if (photoViewer.f41505r1) {
                photoViewer.z3();
            }
        }
        if (this.f49113a == 3) {
            PhotoViewer photoViewer2 = this.f49114b.f49556b;
            photoViewer2.D2(photoViewer2.O4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f49114b.f49556b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.C3()) {
            photoViewer.f41469n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f41429i2) {
            nq0 nq0Var = photoViewer.Q1;
            if (nq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            nq0Var.setVisibility(i7);
        }
        if (!photoViewer.d2 && !photoViewer.f41393e2) {
            int i10 = photoViewer.f41375c2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f41408f7.size() > 1)) && !photoViewer.f41395e4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.p3();
            }
        }
    }
}
