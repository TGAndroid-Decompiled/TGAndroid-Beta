package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f52069a;
    public final PhotoViewer f52070b;

    public sp0(PhotoViewer photoViewer, int i7) {
        this.f52070b = photoViewer;
        this.f52069a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7;
        PhotoViewer photoViewer = this.f52070b;
        oq0 oq0Var = photoViewer.X4;
        org.telegram.ui.Components.y51 y51Var = null;
        photoViewer.f43317q6 = null;
        photoViewer.Q0.setVisibility(8);
        photoViewer.T0.setVisibility(8);
        photoViewer.f43294o0.setVisibility(8);
        photoViewer.f43219f1.setVisibility(8);
        photoViewer.f43228g1.setVisibility(8);
        photoViewer.f43237h1.setVisibility(8);
        photoViewer.f43303p1.setVisibility(8);
        photoViewer.f43303p1.setAlpha(0.0f);
        photoViewer.f43303p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        photoViewer.P0.setRotationX(0.0f);
        photoViewer.f43303p1.setEnabled(false);
        photoViewer.L = false;
        if (photoViewer.f43254j2) {
            photoViewer.R1.setVisibility(4);
        }
        int i10 = photoViewer.d2;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f43234g7.size() > 1)) {
            photoViewer.O0.setVisibility(8);
            photoViewer.P0.setVisibility(8);
            photoViewer.q3();
        }
        if (photoViewer.d2 == 11) {
            photoViewer.f43250i6 = photoViewer.Y5;
            photoViewer.f43242h6 = photoViewer.X5;
            photoViewer.f43257j6 = photoViewer.f43176a6;
            photoViewer.f43266k6 = photoViewer.f43186b6;
            photoViewer.f43224f6 = 0.0f;
        }
        Bitmap n10 = photoViewer.C4.n();
        if (n10 != null || photoViewer.f43332s1) {
            org.telegram.ui.Components.rd0 rd0Var = photoViewer.D1;
            int i11 = photoViewer.C4.V;
            if (photoViewer.d2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            og.g gVar = photoViewer.E1;
            if (photoViewer.f43332s1) {
                y51Var = (org.telegram.ui.Components.y51) photoViewer.C2;
            }
            rd0Var.b(n10, i11, z10, false, gVar, y51Var, oq0Var.f50620c);
            photoViewer.D1.a();
            int q10 = photoViewer.C4.q();
            int o4 = photoViewer.C4.o();
            org.telegram.messenger.xe xeVar = oq0Var.f50620c;
            if (xeVar != null) {
                int i12 = xeVar.f27845k;
                if (i12 == 90 || i12 == 270) {
                    o4 = q10;
                    q10 = o4;
                }
                q10 = (int) (q10 * xeVar.f27841e);
                o4 = (int) (o4 * xeVar.f27842f);
            }
            float f10 = q10;
            float f11 = o4;
            float min = Math.min(photoViewer.g1(photoViewer.f43351u4) / f10, photoViewer.e1() / f11);
            float min2 = Math.min(photoViewer.g1(1) / f10, photoViewer.d1(1, false) / f11);
            if (photoViewer.d2 == 1) {
                float min3 = Math.min(photoViewer.g1(1), photoViewer.d1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f43214e6 = min2 / min;
            Rect rect = photoViewer.f43341t2;
            photoViewer.f43196c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -org.telegram.messenger.g0.L(56.0f);
            if (!photoViewer.f43330s) {
                i7 = org.telegram.messenger.g0.f24004m / 2;
            } else {
                i7 = 0;
            }
            photoViewer.f43204d6 = i13 + i7;
            photoViewer.f43291n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f43308p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.V0, View.TRANSLATION_Y, org.telegram.messenger.g0.L(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f39053g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.D1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f43308p6.setDuration(200L);
        photoViewer.f43308p6.addListener(new ay(this, 12));
        photoViewer.f43308p6.start();
    }
}
