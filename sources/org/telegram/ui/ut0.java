package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ut0 extends AnimatorListenerAdapter {
    public final int f42766a;
    public final vt0 f42767b;

    public ut0(vt0 vt0Var, int i10) {
        this.f42767b = vt0Var;
        this.f42766a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f42767b.f43138b.f33992k8) {
            PhotoViewer photoViewer = this.f42767b.f43138b;
            if (photoViewer.f34045r1) {
                photoViewer.B3();
            }
        }
        if (this.f42766a == 3) {
            PhotoViewer photoViewer2 = this.f42767b.f43138b;
            photoViewer2.G2(photoViewer2.P4, false, true, true);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i10;
        PhotoViewer photoViewer = this.f42767b.f43138b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.f34009n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.f33969i2) {
            ru0 ru0Var = photoViewer.Q1;
            if (ru0Var.getTag() != null) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ru0Var.setVisibility(i10);
        }
        if (!photoViewer.f33924d2 && !photoViewer.f33934e2) {
            int i11 = photoViewer.f33915c2;
            if ((i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33956g7.size() > 1)) && !photoViewer.f33945f4) {
                photoViewer.N0.setVisibility(0);
                photoViewer.O0.setVisibility(0);
                photoViewer.s3();
            }
        }
    }
}
