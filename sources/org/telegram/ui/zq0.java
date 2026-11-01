package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class zq0 extends AnimatorListenerAdapter {
    public final int f44040a;
    public final PhotoViewer f44041b;

    public zq0(PhotoViewer photoViewer, int i10) {
        this.f44041b = photoViewer;
        this.f44040a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f44041b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33555n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33478e1.setVisibility(8);
        photoViewer.f33487f1.setVisibility(8);
        photoViewer.f33495g1.setVisibility(8);
        org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
        if (be0Var != null) {
            be0Var.setVisibility(4);
        }
        photoViewer.f33565o1.setVisibility(8);
        photoViewer.f33565o1.setAlpha(0.0f);
        photoViewer.f33565o1.setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33565o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33514i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33461c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33501g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        Bitmap n10 = photoViewer.C4.n();
        if (photoViewer.f33461c2 == 11) {
            photoViewer.f33518i6 = photoViewer.Y5;
            photoViewer.f33509h6 = photoViewer.X5;
            photoViewer.f33527j6 = photoViewer.f33445a6;
            photoViewer.f33536k6 = photoViewer.f33455b6;
            photoViewer.f33492f6 = 0.0f;
        }
        if (n10 != null) {
            float q6 = photoViewer.C4.q();
            float o10 = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.m1(2) / q6, photoViewer.j1(2, false) / o10);
            if (photoViewer.f33461c2 == 1) {
                photoViewer.f33474d6 = -org.telegram.messenger.i0.L(36.0f);
                min = photoViewer.n1(false);
            } else {
                int i13 = -org.telegram.messenger.i0.L(93.0f);
                if (!photoViewer.f33599s) {
                    i10 = org.telegram.messenger.i0.f16166m / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33474d6 = i13 + i10;
                org.telegram.messenger.ze zeVar = photoViewer.X4.f43155c;
                if (zeVar != null && ((i11 = zeVar.f19698k) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.m1(photoViewer.f33622u4) / o10, photoViewer.k1() / q6);
                } else {
                    min = Math.min(photoViewer.m1(photoViewer.f33622u4) / q6, photoViewer.k1() / o10);
                }
            }
            photoViewer.f33483e6 = min2 / min;
            Rect rect = photoViewer.f33602s2;
            photoViewer.f33465c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33561n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33578p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.i6.f27010g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.i0.L(186.0f), 0.0f));
        photoViewer.f33578p6.setDuration(200L);
        photoViewer.f33578p6.addListener(new org.telegram.ui.Components.voip.i2(this, 23));
        photoViewer.f33578p6.start();
    }
}
