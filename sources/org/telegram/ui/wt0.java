package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wt0 extends AnimatorListenerAdapter {
    public final int f43674a;
    public final xt0 f43675b;

    public wt0(xt0 xt0Var, int i10) {
        this.f43675b = xt0Var;
        this.f43674a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f43675b.f44160b.f33801k8) {
            PhotoViewer photoViewer = this.f43675b.f44160b;
            if (photoViewer.f33854r1) {
                photoViewer.B3();
            }
        }
        if (this.f43674a == 3) {
            PhotoViewer photoViewer2 = this.f43675b.f44160b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f43675b.f44160b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f33818n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33778i2) {
            uu0 uu0Var = photoViewer.Q1;
            if (uu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            uu0Var.setVisibility(i10);
        }
        if (!photoViewer.f33733d2 && !photoViewer.f33743e2) {
            int i11 = photoViewer.f33724c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33765g7.size() > 1)) && !photoViewer.f33754f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
