package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ut0 extends AnimatorListenerAdapter {
    public final int f38210a;
    public final vt0 f38211b;

    public ut0(vt0 vt0Var, int i10) {
        this.f38211b = vt0Var;
        this.f38210a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f38211b.f38601b.f31281k8) {
            PhotoViewer photoViewer = this.f38211b.f38601b;
            if (photoViewer.f31334r1) {
                photoViewer.A3();
            }
        }
        if (this.f38210a == 3) {
            PhotoViewer photoViewer2 = this.f38211b.f38601b;
            photoViewer2.F2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f38211b.f38601b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.f31298n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f31258i2) {
            ru0 ru0Var = photoViewer.Q1;
            if (ru0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ru0Var.setVisibility(i10);
        }
        if (!photoViewer.f31214d2 && !photoViewer.f31223e2) {
            int i11 = photoViewer.f31205c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31245g7.size() > 1)) && !photoViewer.f31234f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.r3();
            }
        }
    }
}
