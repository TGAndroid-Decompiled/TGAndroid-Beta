package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f49293a;
    public final PhotoViewer f49294b;

    public qp0(PhotoViewer photoViewer, int i7) {
        this.f49294b = photoViewer;
        this.f49293a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7;
        PhotoViewer photoViewer = this.f49294b;
        mq0 mq0Var = photoViewer.W4;
        org.telegram.ui.Components.h51 h51Var = null;
        photoViewer.f41484p6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f41462n0.setVisibility(8);
        photoViewer.f41385e1.setVisibility(8);
        photoViewer.f41395f1.setVisibility(8);
        photoViewer.f41404g1.setVisibility(8);
        photoViewer.f41471o1.setVisibility(8);
        photoViewer.f41471o1.setAlpha(0.0f);
        photoViewer.f41471o1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f41471o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f41422i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i10 = photoViewer.f41368c2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f41401f7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.p3();
        }
        if (photoViewer.f41368c2 == 11) {
            photoViewer.f41418h6 = photoViewer.X5;
            photoViewer.f41409g6 = photoViewer.W5;
            photoViewer.f41426i6 = photoViewer.Z5;
            photoViewer.f41433j6 = photoViewer.f41352a6;
            photoViewer.f41390e6 = 0.0f;
        }
        Bitmap n10 = photoViewer.B4.n();
        if (n10 != null || photoViewer.f41498r1) {
            org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
            int i11 = photoViewer.B4.U;
            if (photoViewer.f41368c2 != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            og.g gVar = photoViewer.D1;
            if (photoViewer.f41498r1) {
                h51Var = (org.telegram.ui.Components.h51) photoViewer.B2;
            }
            fd0Var.b(n10, i11, z9, false, gVar, h51Var, mq0Var.f47865c);
            photoViewer.C1.a();
            int q10 = photoViewer.B4.q();
            int o4 = photoViewer.B4.o();
            org.telegram.messenger.ye yeVar = mq0Var.f47865c;
            if (yeVar != null) {
                int i12 = yeVar.f26642k;
                if (i12 == 90 || i12 == 270) {
                    o4 = q10;
                    q10 = o4;
                }
                q10 = (int) (q10 * yeVar.f26638e);
                o4 = (int) (o4 * yeVar.f26639f);
            }
            float f10 = q10;
            float f11 = o4;
            float min = Math.min(photoViewer.g1(photoViewer.f41519t4) / f10, photoViewer.e1() / f11);
            float min2 = Math.min(photoViewer.g1(1) / f10, photoViewer.c1(1, false) / f11);
            if (photoViewer.f41368c2 == 1) {
                float min3 = Math.min(photoViewer.g1(1), photoViewer.c1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f41380d6 = min2 / min;
            Rect rect = photoViewer.f41509s2;
            photoViewer.f41362b6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -org.telegram.messenger.g0.L(56.0f);
            if (!photoViewer.f41506s) {
                i7 = org.telegram.messenger.g0.f22557m / 2;
            } else {
                i7 = 0;
            }
            photoViewer.f41372c6 = i13 + i7;
            photoViewer.f41458m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f41475o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f35922g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f41475o6.setDuration(200L);
        photoViewer.f41475o6.addListener(new d30(this, 11));
        photoViewer.f41475o6.start();
    }
}
