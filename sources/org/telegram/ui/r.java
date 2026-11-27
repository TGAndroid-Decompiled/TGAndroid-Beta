package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final byte a;
    public final s b;

    public r(s sVar, int i) {
        this.b = sVar;
        this.a = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.p8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.s1) {
                photoViewer.P2();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.P1(false, true, true, photoViewer2.O4);
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i;
        PhotoViewer photoViewer = this.b.b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.T2()) {
            photoViewer.o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.j2) {
            wc8 wc8Var = photoViewer.R1;
            if (wc8Var.getTag() != null) {
                i = 0;
            } else {
                i = 4;
            }
            wc8Var.setVisibility(i);
        }
        if (!photoViewer.e2 && !photoViewer.f2) {
            int i2 = photoViewer.d2;
            if ((i2 == 0 || i2 == 4 || ((i2 == 2 || i2 == 5) && photoViewer.f7.size() > 1)) && !photoViewer.f4) {
                photoViewer.O0.setVisibility(0);
                photoViewer.P0.setVisibility(0);
                photoViewer.D2();
            }
        }
    }
}
