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
    public final int f44921a;
    public final PhotoViewer f44922b;

    public zt0(PhotoViewer photoViewer, int i10) {
        this.f44922b = photoViewer;
        this.f44921a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f44922b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33820n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33744e1.setVisibility(8);
        photoViewer.f33753f1.setVisibility(8);
        photoViewer.f33761g1.setVisibility(8);
        org.telegram.ui.Components.zf0 zf0Var = photoViewer.C1;
        if (zf0Var != null) {
            zf0Var.setVisibility(4);
        }
        photoViewer.f33830o1.setVisibility(8);
        photoViewer.f33830o1.setAlpha(0.0f);
        photoViewer.f33830o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33830o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33780i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33726c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33767g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33726c2 == 11) {
            photoViewer.f33784i6 = photoViewer.Y5;
            photoViewer.f33775h6 = photoViewer.X5;
            photoViewer.f33792j6 = photoViewer.f33710a6;
            photoViewer.f33801k6 = photoViewer.f33720b6;
            photoViewer.f33758f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f33726c2 == 1) {
                photoViewer.f33739d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f33864s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33739d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f42856c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f33887u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f33887u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f33749e6 = min2 / min;
            Rect rect = photoViewer.f33867s2;
            photoViewer.f33730c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f33826n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33843p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.u6.f31059g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f33843p6.setDuration(200L);
        photoViewer.f33843p6.addListener(new gp0(this, 4));
        photoViewer.f33843p6.start();
    }
}
