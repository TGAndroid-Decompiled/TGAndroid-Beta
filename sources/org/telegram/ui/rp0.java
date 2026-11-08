package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f49525a;
    public final PhotoViewer f49526b;

    public rp0(PhotoViewer photoViewer, int i7) {
        this.f49526b = photoViewer;
        this.f49525a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f49526b;
        photoViewer.f41484p6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f41462n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f41385e1.setVisibility(8);
        photoViewer.f41395f1.setVisibility(8);
        photoViewer.f41404g1.setVisibility(8);
        org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
        if (fd0Var != null) {
            fd0Var.setVisibility(4);
        }
        photoViewer.f41471o1.setVisibility(8);
        photoViewer.f41471o1.setAlpha(0.0f);
        photoViewer.f41471o1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f41471o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f41422i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f41368c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f41401f7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.p3();
        }
        Bitmap n10 = photoViewer.B4.n();
        if (photoViewer.f41368c2 == 11) {
            photoViewer.f41418h6 = photoViewer.X5;
            photoViewer.f41409g6 = photoViewer.W5;
            photoViewer.f41426i6 = photoViewer.Z5;
            photoViewer.f41433j6 = photoViewer.f41352a6;
            photoViewer.f41390e6 = 0.0f;
        }
        if (n10 != null) {
            float q10 = photoViewer.B4.q();
            float o4 = photoViewer.B4.o();
            float min2 = Math.min(photoViewer.g1(2) / q10, photoViewer.c1(2, false) / o4);
            if (photoViewer.f41368c2 == 1) {
                photoViewer.f41372c6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.h1(false);
            } else {
                int i12 = -org.telegram.messenger.g0.L(93.0f);
                if (!photoViewer.f41506s) {
                    i7 = org.telegram.messenger.g0.f22557m / 2;
                } else {
                    i7 = 0;
                }
                photoViewer.f41372c6 = i12 + i7;
                org.telegram.messenger.ye yeVar = photoViewer.W4.f47865c;
                if (yeVar != null && ((i10 = yeVar.f26642k) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.g1(photoViewer.f41519t4) / o4, photoViewer.e1() / q10);
                } else {
                    min = Math.min(photoViewer.g1(photoViewer.f41519t4) / q10, photoViewer.e1() / o4);
                }
            }
            photoViewer.f41380d6 = min2 / min;
            Rect rect = photoViewer.f41509s2;
            photoViewer.f41362b6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f41458m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f41475o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f35922g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.f41475o6.setDuration(200L);
        photoViewer.f41475o6.addListener(new d30(this, 12));
        photoViewer.f41475o6.start();
    }
}
