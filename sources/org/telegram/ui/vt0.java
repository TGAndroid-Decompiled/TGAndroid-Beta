package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vt0 extends AnimatorListenerAdapter {
    public final int f43024a;
    public final wt0 f43025b;

    public vt0(wt0 wt0Var, int i10) {
        this.f43025b = wt0Var;
        this.f43024a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f43025b.f43800b.f34002k8) {
            PhotoViewer photoViewer = this.f43025b.f43800b;
            if (photoViewer.f34055r1) {
                photoViewer.B3();
            }
        }
        if (this.f43024a == 3) {
            PhotoViewer photoViewer2 = this.f43025b.f43800b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f43025b.f43800b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f34019n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33979i2) {
            su0 su0Var = photoViewer.Q1;
            if (su0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            su0Var.setVisibility(i10);
        }
        if (!photoViewer.f33934d2 && !photoViewer.f33944e2) {
            int i11 = photoViewer.f33925c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33966g7.size() > 1)) && !photoViewer.f33955f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
