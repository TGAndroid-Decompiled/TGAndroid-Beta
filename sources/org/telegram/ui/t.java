package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class t extends AnimatorListenerAdapter {
    public final byte a;
    public final PhotoViewer b;

    public t(PhotoViewer photoViewer, int i) {
        this.b = photoViewer;
        this.a = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        int i;
        PhotoViewer photoViewer = this.b;
        ib8 ib8Var = photoViewer.W4;
        ncc nccVar = null;
        photoViewer.p6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-gm.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i2 = photoViewer.d2;
        if (i2 == 0 || i2 == 4 || ((i2 == 2 || i2 == 5) && photoViewer.f7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.D2();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.h6 = photoViewer.X5;
            photoViewer.g6 = photoViewer.W5;
            photoViewer.i6 = photoViewer.Z5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.e6 = 0.0f;
        }
        Bitmap n = photoViewer.B4.n();
        if (n != null || photoViewer.s1) {
            x68 x68Var = photoViewer.D1;
            int i3 = photoViewer.B4.V;
            if (photoViewer.d2 != 1) {
                z = true;
            } else {
                z = false;
            }
            n43 n43Var = photoViewer.E1;
            if (photoViewer.s1) {
                nccVar = (ncc) photoViewer.C2;
            }
            x68Var.b(n, i3, z, false, n43Var, nccVar, ib8Var.c);
            photoViewer.D1.a();
            int q = photoViewer.B4.q();
            int o = photoViewer.B4.o();
            ao6 ao6Var = ib8Var.c;
            if (ao6Var != null) {
                int i4 = ao6Var.k;
                if (i4 == 90 || i4 == 270) {
                    o = q;
                    q = o;
                }
                q = (int) (q * ao6Var.e);
                o = (int) (o * ao6Var.f);
            }
            float f = q;
            float f2 = o;
            float min = Math.min(photoViewer.i0(photoViewer.t4) / f, photoViewer.g0() / f2);
            float min2 = Math.min(photoViewer.i0(1) / f, photoViewer.f0(1, false) / f2);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.i0(1), photoViewer.f0(1, false));
                min2 = Math.max(min3 / f, min3 / f2);
            }
            photoViewer.d6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.b6 = (rect.left / 2) - (rect.right / 2);
            int i5 = -gm.L(56.0f);
            if (!photoViewer.s) {
                i = gm.m / 2;
            } else {
                i = 0;
            }
            photoViewer.c6 = i5 + i;
            photoViewer.m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, View.TRANSLATION_Y, gm.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, so.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.o6.setDuration(200L);
        photoViewer.o6.addListener(new s38(this, (byte) 7));
        photoViewer.o6.start();
    }
}
