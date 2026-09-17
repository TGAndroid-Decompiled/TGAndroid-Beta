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
public final class vt0 extends AnimatorListenerAdapter {
    public final int f41724a;
    public final PhotoViewer f41725b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.f41725b = photoViewer;
        this.f41724a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f41725b;
        ru0 ru0Var = photoViewer.X4;
        org.telegram.ui.Components.u61 u61Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f33654n0.setVisibility(8);
        photoViewer.f33578e1.setVisibility(8);
        photoViewer.f33587f1.setVisibility(8);
        photoViewer.f33595g1.setVisibility(8);
        photoViewer.f33664o1.setVisibility(8);
        photoViewer.f33664o1.setAlpha(0.0f);
        photoViewer.f33664o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f33664o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f33614i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f33560c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f33601g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f33560c2 == 11) {
            photoViewer.f33618i6 = photoViewer.Y5;
            photoViewer.f33609h6 = photoViewer.X5;
            photoViewer.f33626j6 = photoViewer.f33544a6;
            photoViewer.f33635k6 = photoViewer.f33554b6;
            photoViewer.f33592f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f33690r1) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f33560c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mg.g gVar = photoViewer.D1;
            if (photoViewer.f33690r1) {
                u61Var = (org.telegram.ui.Components.u61) photoViewer.B2;
            }
            ue0Var.b(bitmap, orientation, z10, false, gVar, u61Var, ru0Var.f40268c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = ru0Var.f40268c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f33721u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f33560c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f33583e6 = min2 / min;
            Rect rect = photoViewer.f33701s2;
            photoViewer.f33564c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f33698s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f33573d6 = i13 + i10;
            photoViewer.f33660n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f33677p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.t6.f30568g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f33677p6.setDuration(200L);
        photoViewer.f33677p6.addListener(new gk0(this, 5));
        photoViewer.f33677p6.start();
    }
}
