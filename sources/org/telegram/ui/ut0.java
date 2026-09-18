package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ut0 extends AnimatorListenerAdapter {
    public final int f38101a;
    public final vt0 f38102b;

    public ut0(vt0 vt0Var, int i10) {
        this.f38102b = vt0Var;
        this.f38101a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f38102b.f38621b.f31241k8) {
            PhotoViewer photoViewer = this.f38102b.f38621b;
            if (photoViewer.f31294r1) {
                photoViewer.A3();
            }
        }
        if (this.f38101a == 3) {
            PhotoViewer photoViewer2 = this.f38102b.f38621b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f38102b.f38621b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f31258n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f31218i2) {
            ru0 ru0Var = photoViewer.Q1;
            if (ru0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ru0Var.setVisibility(i10);
        }
        if (!photoViewer.f31174d2 && !photoViewer.f31183e2) {
            int i11 = photoViewer.f31165c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31205g7.size() > 1)) && !photoViewer.f31194f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
