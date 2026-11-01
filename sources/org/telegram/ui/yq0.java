package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class yq0 extends AnimatorListenerAdapter {
    public final int f43709a;
    public final PhotoViewer f43710b;

    public yq0(PhotoViewer photoViewer, int i10) {
        this.f43710b = photoViewer;
        this.f43709a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f43710b;
        wr0 wr0Var = photoViewer.X4;
        org.telegram.ui.Components.l61 l61Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33555n0.setVisibility(8);
        photoViewer.f33478e1.setVisibility(8);
        photoViewer.f33487f1.setVisibility(8);
        photoViewer.f33495g1.setVisibility(8);
        photoViewer.f33565o1.setVisibility(8);
        photoViewer.f33565o1.setAlpha(0.0f);
        photoViewer.f33565o1.setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33565o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33514i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33461c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33501g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.v3();
        }
        if (photoViewer.f33461c2 == 11) {
            photoViewer.f33518i6 = photoViewer.Y5;
            photoViewer.f33509h6 = photoViewer.X5;
            photoViewer.f33527j6 = photoViewer.f33445a6;
            photoViewer.f33536k6 = photoViewer.f33455b6;
            photoViewer.f33492f6 = 0.0f;
        }
        Bitmap n10 = photoViewer.C4.n();
        if (n10 != null || photoViewer.f33591r1) {
            org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
            int i12 = photoViewer.C4.U;
            if (photoViewer.f33461c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            eg.g gVar = photoViewer.D1;
            if (photoViewer.f33591r1) {
                l61Var = (org.telegram.ui.Components.l61) photoViewer.B2;
            }
            be0Var.b(n10, i12, z10, false, gVar, l61Var, wr0Var.f43155c);
            photoViewer.C1.a();
            int q6 = photoViewer.C4.q();
            int o10 = photoViewer.C4.o();
            org.telegram.messenger.ze zeVar = wr0Var.f43155c;
            if (zeVar != null) {
                int i13 = zeVar.f19698k;
                if (i13 == 90 || i13 == 270) {
                    o10 = q6;
                    q6 = o10;
                }
                q6 = (int) (q6 * zeVar.e);
                o10 = (int) (o10 * zeVar.f19695f);
            }
            float f7 = q6;
            float f10 = o10;
            float min = Math.min(photoViewer.m1(photoViewer.f33622u4) / f7, photoViewer.k1() / f10);
            float min2 = Math.min(photoViewer.m1(1) / f7, photoViewer.j1(1, false) / f10);
            if (photoViewer.f33461c2 == 1) {
                float min3 = Math.min(photoViewer.m1(1), photoViewer.j1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33483e6 = min2 / min;
            Rect rect = photoViewer.f33602s2;
            photoViewer.f33465c6 = (rect.left / 2) - (rect.right / 2);
            int i14 = -org.telegram.messenger.i0.L(56.0f);
            if (!photoViewer.f33599s) {
                i10 = org.telegram.messenger.i0.f16166m / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33474d6 = i14 + i10;
            photoViewer.f33561n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33578p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, org.telegram.messenger.i0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.i6.f27010g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33578p6.setDuration(200L);
        photoViewer.f33578p6.addListener(new org.telegram.ui.Components.voip.i2(this, 22));
        photoViewer.f33578p6.start();
    }
}
