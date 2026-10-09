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
    public final int f44147a;
    public final PhotoViewer f44148b;

    public xt0(PhotoViewer photoViewer, int i10) {
        this.f44148b = photoViewer;
        this.f44147a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f44148b;
        tu0 tu0Var = photoViewer.X4;
        org.telegram.ui.Components.z71 z71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33981n0.setVisibility(8);
        photoViewer.f33905e1.setVisibility(8);
        photoViewer.f33914f1.setVisibility(8);
        photoViewer.f33922g1.setVisibility(8);
        photoViewer.f33991o1.setVisibility(8);
        photoViewer.f33991o1.setAlpha(0.0f);
        photoViewer.f33991o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33991o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33941i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33887c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33928g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f33887c2 == 11) {
            photoViewer.f33945i6 = photoViewer.Y5;
            photoViewer.f33936h6 = photoViewer.X5;
            photoViewer.f33953j6 = photoViewer.f33871a6;
            photoViewer.f33962k6 = photoViewer.f33881b6;
            photoViewer.f33919f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f34017r1) {
            org.telegram.ui.Components.vf0 vf0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33887c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f34017r1) {
                z71Var = (org.telegram.ui.Components.z71) photoViewer.B2;
            }
            vf0Var.b(bitmap, orientation, z10, false, gVar, z71Var, tu0Var.f42124c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = tu0Var.f42124c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f34048u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f33887c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33910e6 = min2 / min;
            Rect rect = photoViewer.f34028s2;
            photoViewer.f33891c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f34025s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33900d6 = i13 + i10;
            photoViewer.f33987n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f34004p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.u6.f31383g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f34004p6.setDuration(200L);
        photoViewer.f34004p6.addListener(new ep0(this, 3));
        photoViewer.f34004p6.start();
    }
}
