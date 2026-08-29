package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qs0 extends AnimatorListenerAdapter {
    public final int f41771a;
    public final rs0 f41772b;

    public qs0(rs0 rs0Var, int i10) {
        this.f41772b = rs0Var;
        this.f41771a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f41772b.f42196b.f35701f8) {
            PhotoViewer photoViewer = this.f41772b.f42196b;
            if (photoViewer.f35765n1) {
                photoViewer.B3();
            }
        }
        if (this.f41771a == 3) {
            PhotoViewer photoViewer2 = this.f41772b.f42196b;
            photoViewer2.G2(photoViewer2.L4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f41772b.f42196b;
        photoViewer.L0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f35729j0.setVisibility(0);
        } else {
            photoViewer.O0.setVisibility(0);
        }
        photoViewer.B.setVisibility(0);
        if (photoViewer.f35685e2) {
            nt0 nt0Var = photoViewer.M1;
            if (nt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            nt0Var.setVisibility(i10);
        }
        if (!photoViewer.Z1 && !photoViewer.a2) {
            int i11 = photoViewer.Y1;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f35671c7.size() > 1)) && !photoViewer.f35660b4) {
                photoViewer.J0.setVisibility(0);
                photoViewer.K0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
