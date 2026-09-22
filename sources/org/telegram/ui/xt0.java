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
    public final int f39753a;
    public final PhotoViewer f39754b;

    public xt0(PhotoViewer photoViewer, int i10) {
        this.f39754b = photoViewer;
        this.f39753a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f39754b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31319n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f31243e1.setVisibility(8);
        photoViewer.f31252f1.setVisibility(8);
        photoViewer.f31260g1.setVisibility(8);
        org.telegram.ui.Components.ff0 ff0Var = photoViewer.C1;
        if (ff0Var != null) {
            ff0Var.setVisibility(4);
        }
        photoViewer.f31329o1.setVisibility(8);
        photoViewer.f31329o1.setAlpha(0.0f);
        photoViewer.f31329o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31329o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31279i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f31226c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f31266g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f31226c2 == 11) {
            photoViewer.f31283i6 = photoViewer.Y5;
            photoViewer.f31274h6 = photoViewer.X5;
            photoViewer.f31291j6 = photoViewer.f31210a6;
            photoViewer.f31300k6 = photoViewer.f31220b6;
            photoViewer.f31257f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f31226c2 == 1) {
                photoViewer.f31239d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f31363s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f31239d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f37578c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f31386u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f31386u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f31248e6 = min2 / min;
            Rect rect = photoViewer.f31366s2;
            photoViewer.f31230c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f31325n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31342p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f27831g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f31342p6.setDuration(200L);
        photoViewer.f31342p6.addListener(new gp0(this, 4));
        photoViewer.f31342p6.start();
    }
}
