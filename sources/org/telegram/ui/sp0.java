package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f52097a;
    public final PhotoViewer f52098b;

    public sp0(PhotoViewer photoViewer, int i7) {
        this.f52098b = photoViewer;
        this.f52097a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f52098b;
        photoViewer.f43352q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f43329o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f43254f1.setVisibility(8);
        photoViewer.f43263g1.setVisibility(8);
        photoViewer.f43272h1.setVisibility(8);
        org.telegram.ui.Components.rd0 rd0Var = photoViewer.D1;
        if (rd0Var != null) {
            rd0Var.setVisibility(4);
        }
        photoViewer.f43338p1.setVisibility(8);
        photoViewer.f43338p1.setAlpha(0.0f);
        photoViewer.f43338p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f43338p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f43289j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i11 = photoViewer.d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f43269g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.q3();
        }
        Bitmap n10 = photoViewer.C4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.f43285i6 = photoViewer.Y5;
            photoViewer.f43277h6 = photoViewer.X5;
            photoViewer.f43292j6 = photoViewer.f43211a6;
            photoViewer.f43301k6 = photoViewer.f43221b6;
            photoViewer.f43259f6 = 0.0f;
        }
        if (n10 != null) {
            float q10 = photoViewer.C4.q();
            float o4 = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.g1(2) / q10, photoViewer.d1(2, false) / o4);
            if (photoViewer.d2 == 1) {
                photoViewer.f43239d6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.h1(false);
            } else {
                int i12 = -org.telegram.messenger.g0.L(93.0f);
                if (!photoViewer.f43365s) {
                    i7 = org.telegram.messenger.g0.f24040m / 2;
                } else {
                    i7 = 0;
                }
                photoViewer.f43239d6 = i12 + i7;
                org.telegram.messenger.xe xeVar = photoViewer.X4.f50277c;
                if (xeVar != null && ((i10 = xeVar.f27881k) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.g1(photoViewer.f43386u4) / o4, photoViewer.e1() / q10);
                } else {
                    min = Math.min(photoViewer.g1(photoViewer.f43386u4) / q10, photoViewer.e1() / o4);
                }
            }
            photoViewer.f43249e6 = min2 / min;
            Rect rect = photoViewer.f43376t2;
            photoViewer.f43231c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f43326n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f43343p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f39098g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.f43343p6.setDuration(200L);
        photoViewer.f43343p6.addListener(new ay(this, 13));
        photoViewer.f43343p6.start();
    }
}
