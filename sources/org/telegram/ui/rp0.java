package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f51808a;
    public final PhotoViewer f51809b;

    public rp0(PhotoViewer photoViewer, int i7) {
        this.f51809b = photoViewer;
        this.f51808a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7;
        PhotoViewer photoViewer = this.f51809b;
        nq0 nq0Var = photoViewer.X4;
        org.telegram.ui.Components.x51 x51Var = null;
        photoViewer.f43433q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f43410o0.setVisibility(8);
        photoViewer.f43335f1.setVisibility(8);
        photoViewer.f43344g1.setVisibility(8);
        photoViewer.f43353h1.setVisibility(8);
        photoViewer.f43419p1.setVisibility(8);
        photoViewer.f43419p1.setAlpha(0.0f);
        photoViewer.f43419p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f43419p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f43370j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i10 = photoViewer.d2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f43350g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.r3();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.f43366i6 = photoViewer.Y5;
            photoViewer.f43358h6 = photoViewer.X5;
            photoViewer.f43373j6 = photoViewer.f43287a6;
            photoViewer.f43382k6 = photoViewer.f43298b6;
            photoViewer.f43340f6 = 0.0f;
        }
        Bitmap n10 = photoViewer.C4.n();
        if (n10 != null || photoViewer.f43448s1) {
            org.telegram.ui.Components.qd0 qd0Var = photoViewer.D1;
            int i11 = photoViewer.C4.V;
            if (photoViewer.d2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            og.g gVar = photoViewer.E1;
            if (photoViewer.f43448s1) {
                x51Var = (org.telegram.ui.Components.x51) photoViewer.C2;
            }
            qd0Var.b(n10, i11, z10, false, gVar, x51Var, nq0Var.f50393c);
            photoViewer.D1.a();
            int q10 = photoViewer.C4.q();
            int o4 = photoViewer.C4.o();
            org.telegram.messenger.we weVar = nq0Var.f50393c;
            if (weVar != null) {
                int i12 = weVar.f27775k;
                if (i12 == 90 || i12 == 270) {
                    o4 = q10;
                    q10 = o4;
                }
                q10 = (int) (q10 * weVar.f27771e);
                o4 = (int) (o4 * weVar.f27772f);
            }
            float f10 = q10;
            float f11 = o4;
            float min = Math.min(photoViewer.g1(photoViewer.f43467u4) / f10, photoViewer.e1() / f11);
            float min2 = Math.min(photoViewer.g1(1) / f10, photoViewer.d1(1, false) / f11);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.g1(1), photoViewer.d1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f43329e6 = min2 / min;
            Rect rect = photoViewer.f43457t2;
            photoViewer.f43309c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -org.telegram.messenger.g0.L(56.0f);
            if (!photoViewer.f43446s) {
                i7 = org.telegram.messenger.g0.f24220m / 2;
            } else {
                i7 = 0;
            }
            photoViewer.f43318d6 = i13 + i7;
            photoViewer.f43407n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f43424p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.f38715g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f43424p6.setDuration(200L);
        photoViewer.f43424p6.addListener(new zx(this, 12));
        photoViewer.f43424p6.start();
    }
}
