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
    public final int f39690a;
    public final PhotoViewer f39691b;

    public xt0(PhotoViewer photoViewer, int i10) {
        this.f39691b = photoViewer;
        this.f39690a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f39691b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31011n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f30935e1.setVisibility(8);
        photoViewer.f30944f1.setVisibility(8);
        photoViewer.f30952g1.setVisibility(8);
        org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
        if (ue0Var != null) {
            ue0Var.setVisibility(4);
        }
        photoViewer.f31021o1.setVisibility(8);
        photoViewer.f31021o1.setAlpha(0.0f);
        photoViewer.f31021o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31021o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f30971i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f30918c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f30958g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f30918c2 == 11) {
            photoViewer.f30975i6 = photoViewer.Y5;
            photoViewer.f30966h6 = photoViewer.X5;
            photoViewer.f30983j6 = photoViewer.f30902a6;
            photoViewer.f30992k6 = photoViewer.f30912b6;
            photoViewer.f30949f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f30918c2 == 1) {
                photoViewer.f30931d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f31055s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f30931d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f37490c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f31078u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f31078u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f30940e6 = min2 / min;
            Rect rect = photoViewer.f31058s2;
            photoViewer.f30922c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f31017n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31034p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.f27260g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f31034p6.setDuration(200L);
        photoViewer.f31034p6.addListener(new cr0(this, 3));
        photoViewer.f31034p6.start();
    }
}
