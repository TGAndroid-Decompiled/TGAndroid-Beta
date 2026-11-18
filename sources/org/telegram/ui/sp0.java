package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f52046a;
    public final PhotoViewer f52047b;

    public sp0(PhotoViewer photoViewer, int i7) {
        this.f52047b = photoViewer;
        this.f52046a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f52047b;
        photoViewer.f43307q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f43284o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f43209f1.setVisibility(8);
        photoViewer.f43218g1.setVisibility(8);
        photoViewer.f43227h1.setVisibility(8);
        org.telegram.ui.Components.qd0 qd0Var = photoViewer.D1;
        if (qd0Var != null) {
            qd0Var.setVisibility(4);
        }
        photoViewer.f43293p1.setVisibility(8);
        photoViewer.f43293p1.setAlpha(0.0f);
        photoViewer.f43293p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f43293p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f43244j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i11 = photoViewer.d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f43224g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.q3();
        }
        Bitmap n10 = photoViewer.C4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.f43240i6 = photoViewer.Y5;
            photoViewer.f43232h6 = photoViewer.X5;
            photoViewer.f43247j6 = photoViewer.f43166a6;
            photoViewer.f43256k6 = photoViewer.f43176b6;
            photoViewer.f43214f6 = 0.0f;
        }
        if (n10 != null) {
            float q10 = photoViewer.C4.q();
            float o4 = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.g1(2) / q10, photoViewer.d1(2, false) / o4);
            if (photoViewer.d2 == 1) {
                photoViewer.f43194d6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.h1(false);
            } else {
                int i12 = -org.telegram.messenger.g0.L(93.0f);
                if (!photoViewer.f43320s) {
                    i7 = org.telegram.messenger.g0.f24115m / 2;
                } else {
                    i7 = 0;
                }
                photoViewer.f43194d6 = i12 + i7;
                org.telegram.messenger.we weVar = photoViewer.X4.f50282c;
                if (weVar != null && ((i10 = weVar.f27683k) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.g1(photoViewer.f43341u4) / o4, photoViewer.e1() / q10);
                } else {
                    min = Math.min(photoViewer.g1(photoViewer.f43341u4) / q10, photoViewer.e1() / o4);
                }
            }
            photoViewer.f43204e6 = min2 / min;
            Rect rect = photoViewer.f43331t2;
            photoViewer.f43186c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f43281n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f43298p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.f38716g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.f43298p6.setDuration(200L);
        photoViewer.f43298p6.addListener(new ay(this, 13));
        photoViewer.f43298p6.start();
    }
}
