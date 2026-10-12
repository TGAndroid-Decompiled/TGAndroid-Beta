package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wt0 extends AnimatorListenerAdapter {
    public final int f43679a;
    public final xt0 f43680b;

    public wt0(xt0 xt0Var, int i10) {
        this.f43680b = xt0Var;
        this.f43679a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f43680b.f44165b.f33803k8) {
            PhotoViewer photoViewer = this.f43680b.f44165b;
            if (photoViewer.f33856r1) {
                photoViewer.B3();
            }
        }
        if (this.f43679a == 3) {
            PhotoViewer photoViewer2 = this.f43680b.f44165b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f43680b.f44165b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33820n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33780i2) {
            uu0 uu0Var = photoViewer.Q1;
            if (uu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            uu0Var.setVisibility(i10);
        }
        if (!photoViewer.f33735d2 && !photoViewer.f33745e2) {
            int i11 = photoViewer.f33726c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33767g7.size() > 1)) && !photoViewer.f33756f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
