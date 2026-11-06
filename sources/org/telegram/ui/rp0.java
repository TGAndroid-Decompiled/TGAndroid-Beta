package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f49547a;
    public final PhotoViewer f49548b;

    public rp0(PhotoViewer photoViewer, int i7) {
        this.f49548b = photoViewer;
        this.f49547a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f49548b;
        photoViewer.f41481p6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f41459n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f41382e1.setVisibility(8);
        photoViewer.f41392f1.setVisibility(8);
        photoViewer.f41401g1.setVisibility(8);
        org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
        if (fd0Var != null) {
            fd0Var.setVisibility(4);
        }
        photoViewer.f41468o1.setVisibility(8);
        photoViewer.f41468o1.setAlpha(0.0f);
        photoViewer.f41468o1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f41468o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f41419i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f41365c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f41398f7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.p3();
        }
        Bitmap n10 = photoViewer.B4.n();
        if (photoViewer.f41365c2 == 11) {
            photoViewer.f41415h6 = photoViewer.X5;
            photoViewer.f41406g6 = photoViewer.W5;
            photoViewer.f41423i6 = photoViewer.Z5;
            photoViewer.f41430j6 = photoViewer.f41349a6;
            photoViewer.f41387e6 = 0.0f;
        }
        if (n10 != null) {
            float q10 = photoViewer.B4.q();
            float o4 = photoViewer.B4.o();
            float min2 = Math.min(photoViewer.g1(2) / q10, photoViewer.c1(2, false) / o4);
            if (photoViewer.f41365c2 == 1) {
                photoViewer.f41369c6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.h1(false);
            } else {
                int i12 = -org.telegram.messenger.g0.L(93.0f);
                if (!photoViewer.f41503s) {
                    i7 = org.telegram.messenger.g0.f22531m / 2;
                } else {
                    i7 = 0;
                }
                photoViewer.f41369c6 = i12 + i7;
                org.telegram.messenger.ye yeVar = photoViewer.W4.f47866c;
                if (yeVar != null && ((i10 = yeVar.f26625k) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.g1(photoViewer.f41516t4) / o4, photoViewer.e1() / q10);
                } else {
                    min = Math.min(photoViewer.g1(photoViewer.f41516t4) / q10, photoViewer.e1() / o4);
                }
            }
            photoViewer.f41377d6 = min2 / min;
            Rect rect = photoViewer.f41506s2;
            photoViewer.f41359b6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f41455m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f41472o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f35881g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.f41472o6.setDuration(200L);
        photoViewer.f41472o6.addListener(new d30(this, 12));
        photoViewer.f41472o6.start();
    }
}
