package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tt0 extends AnimatorListenerAdapter {
    public final int f40855a;
    public final ut0 f40856b;

    public tt0(ut0 ut0Var, int i10) {
        this.f40856b = ut0Var;
        this.f40855a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f40856b.f41246b.f33628j8) {
            PhotoViewer photoViewer = this.f40856b.f41246b;
            if (photoViewer.f33690r1) {
                photoViewer.B3();
            }
        }
        if (this.f40855a == 3) {
            PhotoViewer photoViewer2 = this.f40856b.f41246b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f40856b.f41246b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33654n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33614i2) {
            qu0 qu0Var = photoViewer.Q1;
            if (qu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            qu0Var.setVisibility(i10);
        }
        if (!photoViewer.f33569d2 && !photoViewer.f33579e2) {
            int i11 = photoViewer.f33560c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33601g7.size() > 1)) && !photoViewer.f33590f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
