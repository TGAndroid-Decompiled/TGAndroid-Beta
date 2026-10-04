package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class rt0 extends AnimatorListenerAdapter {
    public final int f40286a;
    public final PhotoViewer f40287b;

    public rt0(PhotoViewer photoViewer, int i10) {
        this.f40287b = photoViewer;
        this.f40286a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f40287b;
        nu0 nu0Var = photoViewer.X4;
        org.telegram.ui.Components.t71 t71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33972n0.setVisibility(8);
        photoViewer.f33896e1.setVisibility(8);
        photoViewer.f33905f1.setVisibility(8);
        photoViewer.f33913g1.setVisibility(8);
        photoViewer.f33982o1.setVisibility(8);
        photoViewer.f33982o1.setAlpha(0.0f);
        photoViewer.f33982o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33982o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33932i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33878c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33919g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f33878c2 == 11) {
            photoViewer.f33936i6 = photoViewer.Y5;
            photoViewer.f33927h6 = photoViewer.X5;
            photoViewer.f33944j6 = photoViewer.f33862a6;
            photoViewer.f33953k6 = photoViewer.f33872b6;
            photoViewer.f33910f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f34008r1) {
            org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33878c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f34008r1) {
                t71Var = (org.telegram.ui.Components.t71) photoViewer.B2;
            }
            gf0Var.b(bitmap, orientation, z10, false, gVar, t71Var, nu0Var.f39041c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = nu0Var.f39041c;
            if (cropState != null) {
                int i12 = cropState.transformRotation;
                if (i12 == 90 || i12 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f7 = bitmapWidth;
            float f10 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.f34039u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f33878c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33901e6 = min2 / min;
            Rect rect = photoViewer.f34019s2;
            photoViewer.f33882c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f34016s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33891d6 = i13 + i10;
            photoViewer.f33978n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33995p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.s6.f30635g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33995p6.setDuration(200L);
        photoViewer.f33995p6.addListener(new ap0(this, 3));
        photoViewer.f33995p6.start();
    }
}
