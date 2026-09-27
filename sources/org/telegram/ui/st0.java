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
    public final int f37578a;
    public final PhotoViewer f37579b;

    public st0(PhotoViewer photoViewer, int i10) {
        this.f37579b = photoViewer;
        this.f37578a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f37579b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31302n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f31226e1.setVisibility(8);
        photoViewer.f31235f1.setVisibility(8);
        photoViewer.f31243g1.setVisibility(8);
        org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
        if (ef0Var != null) {
            ef0Var.setVisibility(4);
        }
        photoViewer.f31312o1.setVisibility(8);
        photoViewer.f31312o1.setAlpha(0.0f);
        photoViewer.f31312o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31312o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31262i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f31209c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f31249g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f31209c2 == 11) {
            photoViewer.f31266i6 = photoViewer.Y5;
            photoViewer.f31257h6 = photoViewer.X5;
            photoViewer.f31274j6 = photoViewer.f31193a6;
            photoViewer.f31283k6 = photoViewer.f31203b6;
            photoViewer.f31240f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f31209c2 == 1) {
                photoViewer.f31222d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f31346s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f31222d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f36087c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f31369u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f31369u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f31231e6 = min2 / min;
            Rect rect = photoViewer.f31349s2;
            photoViewer.f31213c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f31308n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31325p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.s6.f28176g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f31325p6.setDuration(200L);
        photoViewer.f31325p6.addListener(new ap0(this, 4));
        photoViewer.f31325p6.start();
    }
}
