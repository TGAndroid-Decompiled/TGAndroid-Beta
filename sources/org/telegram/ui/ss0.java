package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class ss0 extends AnimatorListenerAdapter {

    public final int f42690a;

    public final ts0 f42691b;

    public ss0(ts0 ts0Var, int i10) {
        this.f42691b = ts0Var;
        this.f42690a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f42691b.f43003b.f35638f8) {
            PhotoViewer photoViewer = this.f42691b.f43003b;
            if (photoViewer.f35702n1) {
                photoViewer.B3();
            }
        }
        if (this.f42690a == 3) {
            PhotoViewer photoViewer2 = this.f42691b.f43003b;
            photoViewer2.G2(photoViewer2.L4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.f42691b.f43003b;
        photoViewer.L0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f35666j0.setVisibility(0);
        } else {
            photoViewer.O0.setVisibility(0);
        }
        photoViewer.B.setVisibility(0);
        if (photoViewer.f35622e2) {
            qt0 qt0Var = photoViewer.M1;
            qt0Var.setVisibility(qt0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.Z1 || photoViewer.a2) {
            return;
        }
        int i10 = photoViewer.Y1;
        if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f35608c7.size() > 1)) && !photoViewer.f35595b4) {
            photoViewer.J0.setVisibility(0);
            photoViewer.K0.setVisibility(0);
            photoViewer.s3();
        }
    }
}
