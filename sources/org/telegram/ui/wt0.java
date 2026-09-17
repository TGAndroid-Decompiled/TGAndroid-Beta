package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wt0 extends AnimatorListenerAdapter {
    public final int f39167a;
    public final xt0 f39168b;

    public wt0(xt0 xt0Var, int i10) {
        this.f39168b = xt0Var;
        this.f39167a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f39168b.f39699b.f31001j8) {
            PhotoViewer photoViewer = this.f39168b.f39699b;
            if (photoViewer.f31063r1) {
                photoViewer.B3();
            }
        }
        if (this.f39167a == 3) {
            PhotoViewer photoViewer2 = this.f39168b.f39699b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f39168b.f39699b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f31027n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f30987i2) {
            tu0 tu0Var = photoViewer.Q1;
            if (tu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tu0Var.setVisibility(i10);
        }
        if (!photoViewer.f30943d2 && !photoViewer.f30952e2) {
            int i11 = photoViewer.f30934c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30974g7.size() > 1)) && !photoViewer.f30963f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
