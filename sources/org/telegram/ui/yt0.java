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
public final class yt0 extends AnimatorListenerAdapter {
    public final int f40020a;
    public final PhotoViewer f40021b;

    public yt0(PhotoViewer photoViewer, int i10) {
        this.f40021b = photoViewer;
        this.f40020a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f40021b;
        uu0 uu0Var = photoViewer.X4;
        org.telegram.ui.Components.v61 v61Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31027n0.setVisibility(8);
        photoViewer.f30951e1.setVisibility(8);
        photoViewer.f30960f1.setVisibility(8);
        photoViewer.f30968g1.setVisibility(8);
        photoViewer.f31037o1.setVisibility(8);
        photoViewer.f31037o1.setAlpha(0.0f);
        photoViewer.f31037o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31037o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f30987i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f30934c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30974g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f30934c2 == 11) {
            photoViewer.f30991i6 = photoViewer.Y5;
            photoViewer.f30982h6 = photoViewer.X5;
            photoViewer.f30999j6 = photoViewer.f30918a6;
            photoViewer.f31008k6 = photoViewer.f30928b6;
            photoViewer.f30965f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f31063r1) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f30934c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f31063r1) {
                v61Var = (org.telegram.ui.Components.v61) photoViewer.B2;
            }
            ue0Var.b(bitmap, orientation, z10, false, gVar, v61Var, uu0Var.f38225c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = uu0Var.f38225c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f31094u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f30934c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f30956e6 = min2 / min;
            Rect rect = photoViewer.f31074s2;
            photoViewer.f30938c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f31071s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f30947d6 = i13 + i10;
            photoViewer.f31033n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31050p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.f27225g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f31050p6.setDuration(200L);
        photoViewer.f31050p6.addListener(new er0(this, 2));
        photoViewer.f31050p6.start();
    }
}
