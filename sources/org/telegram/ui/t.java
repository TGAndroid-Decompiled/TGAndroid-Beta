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
        h98 h98Var = photoViewer.X4;
        kac kacVar = null;
        photoViewer.q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-gl.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i2 = photoViewer.d2;
        if (i2 == 0 || i2 == 4 || ((i2 == 2 || i2 == 5) && photoViewer.g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.C2();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.i6 = photoViewer.Y5;
            photoViewer.h6 = photoViewer.X5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.k6 = photoViewer.b6;
            photoViewer.f6 = 0.0f;
        }
        Bitmap n = photoViewer.C4.n();
        if (n != null || photoViewer.s1) {
            v48 v48Var = photoViewer.D1;
            int i3 = photoViewer.C4.V;
            if (photoViewer.d2 != 1) {
                z = true;
            } else {
                z = false;
            }
            c33 c33Var = photoViewer.E1;
            if (photoViewer.s1) {
                kacVar = (kac) photoViewer.C2;
            }
            v48Var.b(n, i3, z, false, c33Var, kacVar, h98Var.c);
            photoViewer.D1.a();
            int q = photoViewer.C4.q();
            int o = photoViewer.C4.o();
            zl6 zl6Var = h98Var.c;
            if (zl6Var != null) {
                int i4 = zl6Var.k;
                if (i4 == 90 || i4 == 270) {
                    o = q;
                    q = o;
                }
                q = (int) (q * zl6Var.e);
                o = (int) (o * zl6Var.f);
            }
            float f = q;
            float f2 = o;
            float min = Math.min(photoViewer.i0(photoViewer.u4) / f, photoViewer.g0() / f2);
            float min2 = Math.min(photoViewer.i0(1) / f, photoViewer.f0(1, false) / f2);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.i0(1), photoViewer.f0(1, false));
                min2 = Math.max(min3 / f, min3 / f2);
            }
            photoViewer.e6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.c6 = (rect.left / 2) - (rect.right / 2);
            int i5 = -gl.L(56.0f);
            if (!photoViewer.s) {
                i = gl.m / 2;
            } else {
                i = 0;
            }
            photoViewer.d6 = i5 + i;
            photoViewer.n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, View.TRANSLATION_Y, gl.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, rn.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.p6.setDuration(200L);
        photoViewer.p6.addListener(new l48(this, (byte) 5));
        photoViewer.p6.start();
    }
}
