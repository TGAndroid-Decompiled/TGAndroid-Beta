package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zs0 extends AnimatorListenerAdapter {
    public final int f40857a;
    public final at0 f40858b;

    public zs0(at0 at0Var, int i10) {
        this.f40858b = at0Var;
        this.f40857a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f40858b.f32700b.f31758g8) {
            PhotoViewer photoViewer = this.f40858b.f32700b;
            if (photoViewer.f31822o1) {
                photoViewer.B3();
            }
        }
        if (this.f40857a == 3) {
            PhotoViewer photoViewer2 = this.f40858b.f32700b;
            photoViewer2.G2(photoViewer2.M4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f40858b.f32700b;
        photoViewer.M0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f31786k0.setVisibility(0);
        } else {
            photoViewer.P0.setVisibility(0);
        }
        photoViewer.C.setVisibility(0);
        if (photoViewer.f31743f2) {
            wt0 wt0Var = photoViewer.N1;
            if (wt0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            wt0Var.setVisibility(i10);
        }
        if (!photoViewer.a2 && !photoViewer.f31707b2) {
            int i11 = photoViewer.Z1;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31730d7.size() > 1)) && !photoViewer.f31718c4) {
                photoViewer.K0.setVisibility(0);
                photoViewer.L0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
