package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class u extends AnimatorListenerAdapter {
    public final byte a;
    public final PhotoViewer b;

    public u(PhotoViewer photoViewer, int i) {
        this.b = photoViewer;
        this.a = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        float min;
        int i2;
        PhotoViewer photoViewer = this.b;
        photoViewer.p6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f1.setVisibility(8);
        photoViewer.g1.setVisibility(8);
        photoViewer.h1.setVisibility(8);
        k88 k88Var = photoViewer.D1;
        if (k88Var != null) {
            k88Var.setVisibility(4);
        }
        photoViewer.p1.setVisibility(8);
        photoViewer.p1.setAlpha(0.0f);
        photoViewer.p1.setTranslationY(-hl.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i3 = photoViewer.d2;
        if (i3 == 0 || i3 == 4 || ((i3 == 2 || i3 == 5) && photoViewer.f7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.D2();
        }
        Bitmap n = photoViewer.B4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.h6 = photoViewer.X5;
            photoViewer.g6 = photoViewer.W5;
            photoViewer.i6 = photoViewer.Z5;
            photoViewer.j6 = photoViewer.a6;
            photoViewer.e6 = 0.0f;
        }
        if (n != null) {
            float q = photoViewer.B4.q();
            float o = photoViewer.B4.o();
            float min2 = Math.min(photoViewer.h0(2) / q, photoViewer.e0(2, false) / o);
            if (photoViewer.d2 == 1) {
                photoViewer.c6 = -hl.L(36.0f);
                min = photoViewer.i0(false);
            } else {
                int i4 = -hl.L(93.0f);
                if (!photoViewer.s) {
                    i = hl.m / 2;
                } else {
                    i = 0;
                }
                photoViewer.c6 = i4 + i;
                fo6 fo6Var = photoViewer.W4.c;
                if (fo6Var != null && ((i2 = fo6Var.k) == 90 || i2 == 270)) {
                    min = Math.min(photoViewer.h0(photoViewer.t4) / o, photoViewer.f0() / q);
                } else {
                    min = Math.min(photoViewer.h0(photoViewer.t4) / q, photoViewer.f0() / o);
                }
            }
            photoViewer.d6 = min2 / min;
            Rect rect = photoViewer.t2;
            photoViewer.b6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, sn.g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), View.TRANSLATION_Y, hl.L(186.0f), 0.0f));
        photoViewer.o6.setDuration(200L);
        photoViewer.o6.addListener(new n88(this, (byte) 5));
        photoViewer.o6.start();
    }
}
