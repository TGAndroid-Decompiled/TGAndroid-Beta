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
public final class xt0 extends AnimatorListenerAdapter {
    public final int f44180a;
    public final PhotoViewer f44181b;

    public xt0(PhotoViewer photoViewer, int i10) {
        this.f44181b = photoViewer;
        this.f44180a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f44181b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f34009n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33933e1.setVisibility(8);
        photoViewer.f33942f1.setVisibility(8);
        photoViewer.f33950g1.setVisibility(8);
        org.telegram.ui.Components.xf0 xf0Var = photoViewer.C1;
        if (xf0Var != null) {
            xf0Var.setVisibility(4);
        }
        photoViewer.f34019o1.setVisibility(8);
        photoViewer.f34019o1.setAlpha(0.0f);
        photoViewer.f34019o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f34019o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33969i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33915c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33956g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33915c2 == 11) {
            photoViewer.f33973i6 = photoViewer.Y5;
            photoViewer.f33964h6 = photoViewer.X5;
            photoViewer.f33981j6 = photoViewer.f33899a6;
            photoViewer.f33990k6 = photoViewer.f33909b6;
            photoViewer.f33947f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f33915c2 == 1) {
                photoViewer.f33928d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f34053s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33928d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f41859c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f34076u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f34076u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f33938e6 = min2 / min;
            Rect rect = photoViewer.f34056s2;
            photoViewer.f33919c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f34015n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f34032p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.u6.f31256g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f34032p6.setDuration(200L);
        photoViewer.f34032p6.addListener(new dp0(this, 4));
        photoViewer.f34032p6.start();
    }
}
