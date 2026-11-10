package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f49494a;
    public final sp0 f49495b;

    public rp0(sp0 sp0Var, int i7) {
        this.f49495b = sp0Var;
        this.f49494a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f49495b.f49910b.f41433j8) {
            PhotoViewer photoViewer = this.f49495b.f49910b;
            if (photoViewer.f41496r1) {
                photoViewer.z3();
            }
        }
        if (this.f49494a == 3) {
            PhotoViewer photoViewer2 = this.f49495b.f49910b;
            photoViewer2.D2(photoViewer2.O4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f49495b.f49910b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.C3()) {
            photoViewer.f41460n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f41420i2) {
            oq0 oq0Var = photoViewer.Q1;
            if (oq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            oq0Var.setVisibility(i7);
        }
        if (!photoViewer.d2 && !photoViewer.f41384e2) {
            int i10 = photoViewer.f41366c2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f41399f7.size() > 1)) && !photoViewer.f41386e4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.p3();
            }
        }
    }
}
