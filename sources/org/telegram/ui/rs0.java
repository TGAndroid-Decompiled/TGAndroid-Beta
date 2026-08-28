package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rs0 extends AnimatorListenerAdapter {
    public final int f42486a;
    public final ss0 f42487b;

    public rs0(ss0 ss0Var, int i9) {
        this.f42487b = ss0Var;
        this.f42486a = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f42487b.f42759b.f35635f8) {
            PhotoViewer photoViewer = this.f42487b.f42759b;
            if (photoViewer.f35699n1) {
                photoViewer.B3();
            }
        }
        if (this.f42486a == 3) {
            PhotoViewer photoViewer2 = this.f42487b.f42759b;
            photoViewer2.G2(photoViewer2.L4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i9;
        PhotoViewer photoViewer = this.f42487b.f42759b;
        photoViewer.L0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f35663j0.setVisibility(0);
        } else {
            photoViewer.O0.setVisibility(0);
        }
        photoViewer.B.setVisibility(0);
        if (photoViewer.f35619e2) {
            pt0 pt0Var = photoViewer.M1;
            if (pt0Var.getTag() != null) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            pt0Var.setVisibility(i9);
        }
        if (!photoViewer.Z1 && !photoViewer.a2) {
            int i10 = photoViewer.Y1;
            if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f35605c7.size() > 1)) && !photoViewer.f35592b4) {
                photoViewer.J0.setVisibility(0);
                photoViewer.K0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
