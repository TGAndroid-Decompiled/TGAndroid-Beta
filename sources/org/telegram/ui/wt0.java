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
    public final int f42505a;
    public final PhotoViewer f42506b;

    public wt0(PhotoViewer photoViewer, int i10) {
        this.f42506b = photoViewer;
        this.f42505a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f42506b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33654n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33578e1.setVisibility(8);
        photoViewer.f33587f1.setVisibility(8);
        photoViewer.f33595g1.setVisibility(8);
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
        if (ue0Var != null) {
            ue0Var.setVisibility(4);
        }
        photoViewer.f33664o1.setVisibility(8);
        photoViewer.f33664o1.setAlpha(0.0f);
        photoViewer.f33664o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33664o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33614i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33560c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33601g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33560c2 == 11) {
            photoViewer.f33618i6 = photoViewer.Y5;
            photoViewer.f33609h6 = photoViewer.X5;
            photoViewer.f33626j6 = photoViewer.f33544a6;
            photoViewer.f33635k6 = photoViewer.f33554b6;
            photoViewer.f33592f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f33560c2 == 1) {
                photoViewer.f33573d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f33698s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33573d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f40268c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f33721u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f33721u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f33583e6 = min2 / min;
            Rect rect = photoViewer.f33701s2;
            photoViewer.f33564c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33660n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33677p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30568g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f33677p6.setDuration(200L);
        photoViewer.f33677p6.addListener(new gk0(this, 6));
        photoViewer.f33677p6.start();
    }
}
