package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wt0 extends AnimatorListenerAdapter {
    public final int f39172a;
    public final xt0 f39173b;

    public wt0(xt0 xt0Var, int i10) {
        this.f39173b = xt0Var;
        this.f39172a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f39173b.f39704b.f31014k8) {
            PhotoViewer photoViewer = this.f39173b.f39704b;
            if (photoViewer.f31067r1) {
                photoViewer.A3();
            }
        }
        if (this.f39172a == 3) {
            PhotoViewer photoViewer2 = this.f39173b.f39704b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f39173b.f39704b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f31031n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f30991i2) {
            tu0 tu0Var = photoViewer.Q1;
            if (tu0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            tu0Var.setVisibility(i10);
        }
        if (!photoViewer.f30947d2 && !photoViewer.f30956e2) {
            int i11 = photoViewer.f30938c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30978g7.size() > 1)) && !photoViewer.f30967f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
