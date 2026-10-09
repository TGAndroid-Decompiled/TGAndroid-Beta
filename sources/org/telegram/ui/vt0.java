package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vt0 extends AnimatorListenerAdapter {
    public final int f42980a;
    public final wt0 f42981b;

    public vt0(wt0 wt0Var, int i10) {
        this.f42981b = wt0Var;
        this.f42980a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f42981b.f43756b.f33964k8) {
            PhotoViewer photoViewer = this.f42981b.f43756b;
            if (photoViewer.f34017r1) {
                photoViewer.B3();
            }
        }
        if (this.f42980a == 3) {
            PhotoViewer photoViewer2 = this.f42981b.f43756b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f42981b.f43756b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33981n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33941i2) {
            su0 su0Var = photoViewer.Q1;
            if (su0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            su0Var.setVisibility(i10);
        }
        if (!photoViewer.f33896d2 && !photoViewer.f33906e2) {
            int i11 = photoViewer.f33887c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33928g7.size() > 1)) && !photoViewer.f33917f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
