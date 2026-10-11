package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ut0 extends AnimatorListenerAdapter {
    public final int f42800a;
    public final vt0 f42801b;

    public ut0(vt0 vt0Var, int i10) {
        this.f42801b = vt0Var;
        this.f42800a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f42801b.f43172b.f34026k8) {
            PhotoViewer photoViewer = this.f42801b.f43172b;
            if (photoViewer.f34079r1) {
                photoViewer.B3();
            }
        }
        if (this.f42800a == 3) {
            PhotoViewer photoViewer2 = this.f42801b.f43172b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f42801b.f43172b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f34043n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f34003i2) {
            ru0 ru0Var = photoViewer.Q1;
            if (ru0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ru0Var.setVisibility(i10);
        }
        if (!photoViewer.f33958d2 && !photoViewer.f33968e2) {
            int i11 = photoViewer.f33949c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33990g7.size() > 1)) && !photoViewer.f33979f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
