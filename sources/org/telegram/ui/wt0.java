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
public final class wt0 extends AnimatorListenerAdapter {
    public final int f43874a;
    public final PhotoViewer f43875b;

    public wt0(PhotoViewer photoViewer, int i10) {
        this.f43875b = photoViewer;
        this.f43874a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f43875b;
        su0 su0Var = photoViewer.X4;
        org.telegram.ui.Components.b81 b81Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f34009n0.setVisibility(8);
        photoViewer.f33933e1.setVisibility(8);
        photoViewer.f33942f1.setVisibility(8);
        photoViewer.f33950g1.setVisibility(8);
        photoViewer.f34019o1.setVisibility(8);
        photoViewer.f34019o1.setAlpha(0.0f);
        photoViewer.f34019o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f34019o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33969i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33915c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33956g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f33915c2 == 11) {
            photoViewer.f33973i6 = photoViewer.Y5;
            photoViewer.f33964h6 = photoViewer.X5;
            photoViewer.f33981j6 = photoViewer.f33899a6;
            photoViewer.f33990k6 = photoViewer.f33909b6;
            photoViewer.f33947f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f34045r1) {
            org.telegram.ui.Components.xf0 xf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33915c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f34045r1) {
                b81Var = (org.telegram.ui.Components.b81) photoViewer.B2;
            }
            xf0Var.b(bitmap, orientation, z10, false, gVar, b81Var, su0Var.f41859c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = su0Var.f41859c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f34076u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f33915c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33938e6 = min2 / min;
            Rect rect = photoViewer.f34056s2;
            photoViewer.f33919c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f34053s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33928d6 = i13 + i10;
            photoViewer.f34015n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f34032p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.u6.f31256g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f34032p6.setDuration(200L);
        photoViewer.f34032p6.addListener(new dp0(this, 3));
        photoViewer.f34032p6.start();
    }
}
