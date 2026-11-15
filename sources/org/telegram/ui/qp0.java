package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f50707a;
    public final PhotoViewer f50708b;

    public qp0(PhotoViewer photoViewer, int i7) {
        this.f50708b = photoViewer;
        this.f50707a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f50708b;
        photoViewer.f42862q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f42839o0.setVisibility(8);
        photoViewer.G.setVisibility(8);
        photoViewer.f42764f1.setVisibility(8);
        photoViewer.f42773g1.setVisibility(8);
        photoViewer.f42782h1.setVisibility(8);
        org.telegram.ui.Components.gd0 gd0Var = photoViewer.D1;
        if (gd0Var != null) {
            gd0Var.setVisibility(4);
        }
        photoViewer.f42848p1.setVisibility(8);
        photoViewer.f42848p1.setAlpha(0.0f);
        photoViewer.f42848p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f42848p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f42799j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i11 = photoViewer.d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f42779g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.q3();
        }
        Bitmap n10 = photoViewer.C4.n();
        if (photoViewer.d2 == 11) {
            photoViewer.f42795i6 = photoViewer.Y5;
            photoViewer.f42787h6 = photoViewer.X5;
            photoViewer.f42802j6 = photoViewer.f42721a6;
            photoViewer.f42811k6 = photoViewer.f42731b6;
            photoViewer.f42769f6 = 0.0f;
        }
        if (n10 != null) {
            float q10 = photoViewer.C4.q();
            float o4 = photoViewer.C4.o();
            float min2 = Math.min(photoViewer.g1(2) / q10, photoViewer.d1(2, false) / o4);
            if (photoViewer.d2 == 1) {
                photoViewer.f42749d6 = -org.telegram.messenger.g0.L(36.0f);
                min = photoViewer.h1(false);
            } else {
                int i12 = -org.telegram.messenger.g0.L(93.0f);
                if (!photoViewer.f42875s) {
                    i7 = org.telegram.messenger.g0.f23603m / 2;
                } else {
                    i7 = 0;
                }
                photoViewer.f42749d6 = i12 + i7;
                org.telegram.messenger.xe xeVar = photoViewer.X4.f49027c;
                if (xeVar != null && ((i10 = xeVar.f27495k) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.g1(photoViewer.f42896u4) / o4, photoViewer.e1() / q10);
                } else {
                    min = Math.min(photoViewer.g1(photoViewer.f42896u4) / q10, photoViewer.e1() / o4);
                }
            }
            photoViewer.f42759e6 = min2 / min;
            Rect rect = photoViewer.f42886t2;
            photoViewer.f42741c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f42836n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f42853p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.k6.f36302g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.J1.getToolsView(), View.TRANSLATION_Y, org.telegram.messenger.g0.L(186.0f), 0.0f));
        photoViewer.f42853p6.setDuration(200L);
        photoViewer.f42853p6.addListener(new xx(this, 13));
        photoViewer.f42853p6.start();
    }
}
