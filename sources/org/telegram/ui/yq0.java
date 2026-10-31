package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yq0 extends AnimatorListenerAdapter {
    public final int f43881a;
    public final zq0 f43882b;

    public yq0(zq0 zq0Var, int i10) {
        this.f43882b = zq0Var;
        this.f43881a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f43882b.f44215b.f33531k8) {
            PhotoViewer photoViewer = this.f43882b.f44215b;
            if (photoViewer.f33584r1) {
                photoViewer.E3();
            }
        }
        if (this.f43881a == 3) {
            PhotoViewer photoViewer2 = this.f43882b.f44215b;
            photoViewer2.J2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f43882b.f44215b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.H3()) {
            photoViewer.f33548n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33507i2) {
            wr0 wr0Var = photoViewer.Q1;
            if (wr0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            wr0Var.setVisibility(i10);
        }
        if (!photoViewer.f33463d2 && !photoViewer.f33472e2) {
            int i11 = photoViewer.f33454c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33494g7.size() > 1)) && !photoViewer.f33483f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.v3();
            }
        }
    }
}
