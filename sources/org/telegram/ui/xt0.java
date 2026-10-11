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
    public final int f44214a;
    public final PhotoViewer f44215b;

    public xt0(PhotoViewer photoViewer, int i10) {
        this.f44215b = photoViewer;
        this.f44214a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f44215b;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f34043n0.setVisibility(8);
        photoViewer.F.setVisibility(8);
        photoViewer.f33967e1.setVisibility(8);
        photoViewer.f33976f1.setVisibility(8);
        photoViewer.f33984g1.setVisibility(8);
        org.telegram.ui.Components.wf0 wf0Var = photoViewer.C1;
        if (wf0Var != null) {
            wf0Var.setVisibility(4);
        }
        photoViewer.f34053o1.setVisibility(8);
        photoViewer.f34053o1.setAlpha(0.0f);
        photoViewer.f34053o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f34053o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f34003i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i12 = photoViewer.f33949c2;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f33990g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (photoViewer.f33949c2 == 11) {
            photoViewer.f34007i6 = photoViewer.Y5;
            photoViewer.f33998h6 = photoViewer.X5;
            photoViewer.f34015j6 = photoViewer.f33933a6;
            photoViewer.f34024k6 = photoViewer.f33943b6;
            photoViewer.f33981f6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.C4.getBitmapWidth();
            float bitmapHeight = photoViewer.C4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.f33949c2 == 1) {
                photoViewer.f33962d6 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f34087s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.f33962d6 = i13 + i10;
                MediaController.CropState cropState = photoViewer.X4.f41893c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f34110u4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f34110u4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f33972e6 = min2 / min;
            Rect rect = photoViewer.f34090s2;
            photoViewer.f33953c6 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f34049n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f34066p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.u6.f31453g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.I1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f34066p6.setDuration(200L);
        photoViewer.f34066p6.addListener(new dp0(this, 4));
        photoViewer.f34066p6.start();
    }
}
