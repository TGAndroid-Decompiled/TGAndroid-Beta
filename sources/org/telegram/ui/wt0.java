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
    public final int f38389a;
    public final PhotoViewer f38390b;

    public wt0(PhotoViewer photoViewer, int i10) {
        this.f38390b = photoViewer;
        this.f38389a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f38390b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f30126n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f30050e1.setVisibility(8);
        photoViewer.f30059f1.setVisibility(8);
        photoViewer.f30067g1.setVisibility(8);
        org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
        if (df0Var != null) {
            df0Var.setVisibility(4);
        }
        photoViewer.f30136o1.setVisibility(8);
        photoViewer.f30136o1.setAlpha(0.0f);
        photoViewer.f30136o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f30136o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f30086i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f30033c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f30073g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f30033c2 == 11) {
            photoViewer.f30090i6 = photoViewer.Y5;
            photoViewer.f30081h6 = photoViewer.X5;
            photoViewer.f30098j6 = photoViewer.f30017a6;
            photoViewer.f30107k6 = photoViewer.f30027b6;
            photoViewer.f30064f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f30033c2 == 1) {
                photoViewer.f30046d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f30170s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f30046d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f36761c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f30193u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f30193u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f30055e6 = min2 / min;
            Rect rect = photoViewer.f30173s2;
            photoViewer.f30037c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f30132n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f30149p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f26603g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f30149p6.setDuration(200L);
        photoViewer.f30149p6.addListener(new org.telegram.ui.Components.voip.v2(this, 23));
        photoViewer.f30149p6.start();
    }
}
