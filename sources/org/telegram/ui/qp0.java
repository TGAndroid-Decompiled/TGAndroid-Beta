package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f51252a;
    public final rp0 f51253b;

    public qp0(rp0 rp0Var, int i7) {
        this.f51253b = rp0Var;
        this.f51252a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f51253b.f51724b.f43268k8) {
            PhotoViewer photoViewer = this.f51253b.f51724b;
            if (photoViewer.f43332s1) {
                photoViewer.A3();
            }
        }
        if (this.f51252a == 3) {
            PhotoViewer photoViewer2 = this.f51253b.f51724b;
            photoViewer2.E2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i7;
        PhotoViewer photoViewer = this.f51253b.f51724b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f43294o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.f43254j2) {
            nq0 nq0Var = photoViewer.R1;
            if (nq0Var.getTag() != null) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            nq0Var.setVisibility(i7);
        }
        if (!photoViewer.f43210e2 && !photoViewer.f43220f2) {
            int i10 = photoViewer.d2;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f43234g7.size() > 1)) && !photoViewer.f43222f4) {
                photoViewer.O0.setVisibility(0);
                photoViewer.P0.setVisibility(0);
                photoViewer.q3();
            }
        }
    }
}
