package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ut0 extends AnimatorListenerAdapter {
    public final int f38159a;
    public final vt0 f38160b;

    public ut0(vt0 vt0Var, int i10) {
        this.f38160b = vt0Var;
        this.f38159a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f38160b.f38684b.f30987j8) {
            PhotoViewer photoViewer = this.f38160b.f38684b;
            if (photoViewer.f31049r1) {
                photoViewer.B3();
            }
        }
        if (this.f38159a == 3) {
            PhotoViewer photoViewer2 = this.f38160b.f38684b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f38160b.f38684b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f31013n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f30973i2) {
            ru0 ru0Var = photoViewer.Q1;
            if (ru0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ru0Var.setVisibility(i10);
        }
        if (!photoViewer.f30929d2 && !photoViewer.f30938e2) {
            int i11 = photoViewer.f30920c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30960g7.size() > 1)) && !photoViewer.f30949f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
