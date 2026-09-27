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
public final class rt0 extends AnimatorListenerAdapter {
    public final int f37236a;
    public final PhotoViewer f37237b;

    public rt0(PhotoViewer photoViewer, int i10) {
        this.f37237b = photoViewer;
        this.f37236a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f37237b;
        nu0 nu0Var = photoViewer.X4;
        org.telegram.ui.Components.k71 k71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f31302n0.setVisibility(8);
        photoViewer.f31226e1.setVisibility(8);
        photoViewer.f31235f1.setVisibility(8);
        photoViewer.f31243g1.setVisibility(8);
        photoViewer.f31312o1.setVisibility(8);
        photoViewer.f31312o1.setAlpha(0.0f);
        photoViewer.f31312o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f31312o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f31262i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f31209c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f31249g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.r3();
        }
        if (photoViewer.f31209c2 == 11) {
            photoViewer.f31266i6 = photoViewer.Y5;
            photoViewer.f31257h6 = photoViewer.X5;
            photoViewer.f31274j6 = photoViewer.f31193a6;
            photoViewer.f31283k6 = photoViewer.f31203b6;
            photoViewer.f31240f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f31338r1) {
            org.telegram.ui.Components.ef0 ef0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f31209c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = photoViewer.D1;
            if (photoViewer.f31338r1) {
                k71Var = (org.telegram.ui.Components.k71) photoViewer.B2;
            }
            ef0Var.b(bitmap, orientation, z10, false, gVar, k71Var, nu0Var.f36087c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = nu0Var.f36087c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f31369u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f31209c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f31231e6 = min2 / min;
            Rect rect = photoViewer.f31349s2;
            photoViewer.f31213c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f31346s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f31222d6 = i13 + i10;
            photoViewer.f31308n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f31325p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.s6.f28176g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f31325p6.setDuration(200L);
        photoViewer.f31325p6.addListener(new ap0(this, 3));
        photoViewer.f31325p6.start();
    }
}
