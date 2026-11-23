package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f52128a;
    public final PhotoViewer f52129b;

    public sp0(PhotoViewer photoViewer, int i7) {
        this.f52129b = photoViewer;
        this.f52128a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f52129b;
        photoViewer.f43433q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f43410o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f43335f1.setVisibility(8);
        photoViewer.f43344g1.setVisibility(8);
        photoViewer.f43353h1.setVisibility(8);
        org.telegram.ui.Components.qd0 qd0Var = photoViewer.D1;
        if (qd0Var != null) {
            qd0Var.setVisibility(4);
        }
        photoViewer.f43419p1.setVisibility(8);
        photoViewer.f43419p1.setAlpha(0.0f);
        photoViewer.f43419p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f43419p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f43370j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i11 = photoViewer.d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f43350g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.r3();
        }
        Bitmap n10 = photoViewer.C4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.f43366i6 = photoViewer.Y5;
            photoViewer.f43358h6 = photoViewer.X5;
            photoViewer.f43373j6 = photoViewer.f43287a6;
            photoViewer.f43382k6 = photoViewer.f43298b6;
            photoViewer.f43340f6 = 0.0f;
        }
        if (n10 != null) {
            float q10 = photoViewer.C4.q();
            float o4 = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.g1(2) / q10, photoViewer.d1(2, false) / o4);
            if (photoViewer.d2 == 1) {
                photoViewer.f43318d6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.h1(false);
            } else {
                int i12 = -org.telegram.messenger.g0.L(93.0f);
                if (!photoViewer.f43446s) {
                    i7 = org.telegram.messenger.g0.f24220m / 2;
                } else {
                    i7 = 0;
                }
                photoViewer.f43318d6 = i12 + i7;
                org.telegram.messenger.we weVar = photoViewer.X4.f50393c;
                if (weVar != null && ((i10 = weVar.f27775k) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.g1(photoViewer.f43467u4) / o4, photoViewer.e1() / q10);
                } else {
                    min = Math.min(photoViewer.g1(photoViewer.f43467u4) / q10, photoViewer.e1() / o4);
                }
            }
            photoViewer.f43329e6 = min2 / min;
            Rect rect = photoViewer.f43457t2;
            photoViewer.f43309c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f43407n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f43424p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.f38715g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.f43424p6.setDuration(200L);
        photoViewer.f43424p6.addListener(new zx(this, 13));
        photoViewer.f43424p6.start();
    }
}
