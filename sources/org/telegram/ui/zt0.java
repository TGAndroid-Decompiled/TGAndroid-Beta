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
public final class zt0 extends AnimatorListenerAdapter {
    public final int f40344a;
    public final PhotoViewer f40345b;

    public zt0(PhotoViewer photoViewer, int i10) {
        this.f40345b = photoViewer;
        this.f40344a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f40345b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31031n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f30955e1.setVisibility(8);
        photoViewer.f30964f1.setVisibility(8);
        photoViewer.f30972g1.setVisibility(8);
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
        if (ue0Var != null) {
            ue0Var.setVisibility(4);
        }
        photoViewer.f31041o1.setVisibility(8);
        photoViewer.f31041o1.setAlpha(0.0f);
        photoViewer.f31041o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31041o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f30991i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f30938c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f30978g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f30938c2 == 11) {
            photoViewer.f30995i6 = photoViewer.Y5;
            photoViewer.f30986h6 = photoViewer.X5;
            photoViewer.f31003j6 = photoViewer.f30922a6;
            photoViewer.f31012k6 = photoViewer.f30932b6;
            photoViewer.f30969f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f30938c2 == 1) {
                photoViewer.f30951d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f31075s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f30951d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f38230c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f31098u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f31098u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f30960e6 = min2 / min;
            Rect rect = photoViewer.f31078s2;
            photoViewer.f30942c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f31037n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31054p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.f27228g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f31054p6.setDuration(200L);
        photoViewer.f31054p6.addListener(new er0(this, 3));
        photoViewer.f31054p6.start();
    }
}
