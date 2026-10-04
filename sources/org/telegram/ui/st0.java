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
public final class st0 extends AnimatorListenerAdapter {
    public final int f40622a;
    public final PhotoViewer f40623b;

    public st0(PhotoViewer photoViewer, int i10) {
        this.f40623b = photoViewer;
        this.f40622a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f40623b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33978n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33902e1.setVisibility(8);
        photoViewer.f33911f1.setVisibility(8);
        photoViewer.f33919g1.setVisibility(8);
        org.telegram.ui.Components.gf0 gf0Var = photoViewer.C1;
        if (gf0Var != null) {
            gf0Var.setVisibility(4);
        }
        photoViewer.f33988o1.setVisibility(8);
        photoViewer.f33988o1.setAlpha(0.0f);
        photoViewer.f33988o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33988o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33938i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33884c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33925g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33884c2 == 11) {
            photoViewer.f33942i6 = photoViewer.Y5;
            photoViewer.f33933h6 = photoViewer.X5;
            photoViewer.f33950j6 = photoViewer.f33868a6;
            photoViewer.f33959k6 = photoViewer.f33878b6;
            photoViewer.f33916f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f33884c2 == 1) {
                photoViewer.f33897d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f34022s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33897d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f39046c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f34045u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f34045u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f33907e6 = min2 / min;
            Rect rect = photoViewer.f34025s2;
            photoViewer.f33888c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33984n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f34001p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.s6.f30641g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f34001p6.setDuration(200L);
        photoViewer.f34001p6.addListener(new ap0(this, 4));
        photoViewer.f34001p6.start();
    }
}
