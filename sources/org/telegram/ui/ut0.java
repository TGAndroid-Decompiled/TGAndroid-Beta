package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ut0 extends AnimatorListenerAdapter {
    public final int f38173a;
    public final vt0 f38174b;

    public ut0(vt0 vt0Var, int i10) {
        this.f38174b = vt0Var;
        this.f38173a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f38174b.f38620b.f30994k8) {
            PhotoViewer photoViewer = this.f38174b.f38620b;
            if (photoViewer.f31047r1) {
                photoViewer.A3();
            }
        }
        if (this.f38173a == 3) {
            PhotoViewer photoViewer2 = this.f38174b.f38620b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f38174b.f38620b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f31011n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f30971i2) {
            ru0 ru0Var = photoViewer.Q1;
            if (ru0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ru0Var.setVisibility(i10);
        }
        if (!photoViewer.f30927d2 && !photoViewer.f30936e2) {
            int i11 = photoViewer.f30918c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30958g7.size() > 1)) && !photoViewer.f30947f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
