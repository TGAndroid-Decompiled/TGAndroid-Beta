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
    public final int f39386a;
    public final PhotoViewer f39387b;

    public wt0(PhotoViewer photoViewer, int i10) {
        this.f39387b = photoViewer;
        this.f39386a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f39387b;
        su0 su0Var = photoViewer.X4;
        org.telegram.ui.Components.u61 u61Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31011n0.setVisibility(8);
        photoViewer.f30935e1.setVisibility(8);
        photoViewer.f30944f1.setVisibility(8);
        photoViewer.f30952g1.setVisibility(8);
        photoViewer.f31021o1.setVisibility(8);
        photoViewer.f31021o1.setAlpha(0.0f);
        photoViewer.f31021o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31021o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f30971i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f30918c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30958g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        if (photoViewer.f30918c2 == 11) {
            photoViewer.f30975i6 = photoViewer.Y5;
            photoViewer.f30966h6 = photoViewer.X5;
            photoViewer.f30983j6 = photoViewer.f30902a6;
            photoViewer.f30992k6 = photoViewer.f30912b6;
            photoViewer.f30949f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f31047r1) {
            org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f30918c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f31047r1) {
                u61Var = (org.telegram.ui.Components.u61) photoViewer.B2;
            }
            ue0Var.b(bitmap, orientation, z10, false, gVar, u61Var, su0Var.f37490c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = su0Var.f37490c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f31078u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f30918c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f30940e6 = min2 / min;
            Rect rect = photoViewer.f31058s2;
            photoViewer.f30922c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f31055s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f30931d6 = i13 + i10;
            photoViewer.f31017n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31034p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.q6.f27260g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f31034p6.setDuration(200L);
        photoViewer.f31034p6.addListener(new cr0(this, 2));
        photoViewer.f31034p6.start();
    }
}
