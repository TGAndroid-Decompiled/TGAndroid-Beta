package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wq0 extends AnimatorListenerAdapter {
    public final int f43149a;
    public final xq0 f43150b;

    public wq0(xq0 xq0Var, int i10) {
        this.f43150b = xq0Var;
        this.f43149a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f43150b.f43448b.f33538k8) {
            PhotoViewer photoViewer = this.f43150b.f43448b;
            if (photoViewer.f33591r1) {
                photoViewer.E3();
            }
        }
        if (this.f43149a == 3) {
            PhotoViewer photoViewer2 = this.f43150b.f43448b;
            photoViewer2.J2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f43150b.f43448b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.H3()) {
            photoViewer.f33555n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33514i2) {
            vr0 vr0Var = photoViewer.Q1;
            if (vr0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            vr0Var.setVisibility(i10);
        }
        if (!photoViewer.f33470d2 && !photoViewer.f33479e2) {
            int i11 = photoViewer.f33461c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33501g7.size() > 1)) && !photoViewer.f33490f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.v3();
            }
        }
    }
}
