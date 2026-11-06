package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class qp0 extends AnimatorListenerAdapter {
    public final int f49291a;
    public final PhotoViewer f49292b;

    public qp0(PhotoViewer photoViewer, int i7) {
        this.f49292b = photoViewer;
        this.f49291a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7;
        PhotoViewer photoViewer = this.f49292b;
        mq0 mq0Var = photoViewer.W4;
        org.telegram.ui.Components.g51 g51Var = null;
        photoViewer.f41481p6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f41459n0.setVisibility(8);
        photoViewer.f41382e1.setVisibility(8);
        photoViewer.f41392f1.setVisibility(8);
        photoViewer.f41401g1.setVisibility(8);
        photoViewer.f41468o1.setVisibility(8);
        photoViewer.f41468o1.setAlpha(0.0f);
        photoViewer.f41468o1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f41468o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f41419i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i10 = photoViewer.f41365c2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f41398f7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.p3();
        }
        if (photoViewer.f41365c2 == 11) {
            photoViewer.f41415h6 = photoViewer.X5;
            photoViewer.f41406g6 = photoViewer.W5;
            photoViewer.f41423i6 = photoViewer.Z5;
            photoViewer.f41430j6 = photoViewer.f41349a6;
            photoViewer.f41387e6 = 0.0f;
        }
        Bitmap n10 = photoViewer.B4.n();
        if (n10 != null || photoViewer.f41495r1) {
            org.telegram.ui.Components.fd0 fd0Var = photoViewer.C1;
            int i11 = photoViewer.B4.U;
            if (photoViewer.f41365c2 != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            og.g gVar = photoViewer.D1;
            if (photoViewer.f41495r1) {
                g51Var = (org.telegram.ui.Components.g51) photoViewer.B2;
            }
            fd0Var.b(n10, i11, z9, false, gVar, g51Var, mq0Var.f47866c);
            photoViewer.C1.a();
            int q10 = photoViewer.B4.q();
            int o4 = photoViewer.B4.o();
            org.telegram.messenger.ye yeVar = mq0Var.f47866c;
            if (yeVar != null) {
                int i12 = yeVar.f26625k;
                if (i12 == 90 || i12 == 270) {
                    o4 = q10;
                    q10 = o4;
                }
                q10 = (int) (q10 * yeVar.f26621e);
                o4 = (int) (o4 * yeVar.f26622f);
            }
            float f10 = q10;
            float f11 = o4;
            float min = Math.min(photoViewer.g1(photoViewer.f41516t4) / f10, photoViewer.e1() / f11);
            float min2 = Math.min(photoViewer.g1(1) / f10, photoViewer.c1(1, false) / f11);
            if (photoViewer.f41365c2 == 1) {
                float min3 = Math.min(photoViewer.g1(1), photoViewer.c1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f41377d6 = min2 / min;
            Rect rect = photoViewer.f41506s2;
            photoViewer.f41359b6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -org.telegram.messenger.g0.L(56.0f);
            if (!photoViewer.f41503s) {
                i7 = org.telegram.messenger.g0.f22531m / 2;
            } else {
                i7 = 0;
            }
            photoViewer.f41369c6 = i13 + i7;
            photoViewer.f41455m6 = System.currentTimeMillis();
            photoViewer.Q6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f41472o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f35881g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f41472o6.setDuration(200L);
        photoViewer.f41472o6.addListener(new d30(this, 11));
        photoViewer.f41472o6.start();
    }
}
