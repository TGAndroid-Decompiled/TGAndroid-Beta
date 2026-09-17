package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tt0 extends AnimatorListenerAdapter {
    public final int f40828a;
    public final ut0 f40829b;

    public tt0(ut0 ut0Var, int i10) {
        this.f40829b = ut0Var;
        this.f40828a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f40829b.f41219b.f33601j8) {
            PhotoViewer photoViewer = this.f40829b.f41219b;
            if (photoViewer.f33663r1) {
                photoViewer.B3();
            }
        }
        if (this.f40828a == 3) {
            PhotoViewer photoViewer2 = this.f40829b.f41219b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f40829b.f41219b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33627n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33587i2) {
            qu0 qu0Var = photoViewer.Q1;
            if (qu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            qu0Var.setVisibility(i10);
        }
        if (!photoViewer.f33542d2 && !photoViewer.f33552e2) {
            int i11 = photoViewer.f33533c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33574g7.size() > 1)) && !photoViewer.f33563f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
