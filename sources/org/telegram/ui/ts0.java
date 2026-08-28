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
public final class ts0 extends AnimatorListenerAdapter {
    public final int f43055a;
    public final PhotoViewer f43056b;

    public ts0(PhotoViewer photoViewer, int i9) {
        this.f43056b = photoViewer;
        this.f43055a = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i9;
        PhotoViewer photoViewer = this.f43056b;
        qt0 qt0Var = photoViewer.T4;
        org.telegram.ui.Components.y51 y51Var = null;
        photoViewer.f35694m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.f35663j0.setVisibility(8);
        photoViewer.f35581a1.setVisibility(8);
        photoViewer.f35589b1.setVisibility(8);
        photoViewer.f35599c1.setVisibility(8);
        photoViewer.f35673k1.setVisibility(8);
        photoViewer.f35673k1.setAlpha(0.0f);
        photoViewer.f35673k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.f35673k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.f35619e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i10 = photoViewer.Y1;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f35605c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.Y1 == 11) {
            photoViewer.f35623e6 = photoViewer.U5;
            photoViewer.f35613d6 = photoViewer.T5;
            photoViewer.f35633f6 = photoViewer.W5;
            photoViewer.f35642g6 = photoViewer.X5;
            photoViewer.f35594b6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.f35802y4.getBitmap();
        if (bitmap != null || photoViewer.f35699n1) {
            org.telegram.ui.Components.be0 be0Var = photoViewer.f35799y1;
            int orientation = photoViewer.f35802y4.getOrientation();
            if (photoViewer.Y1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tf.f fVar = photoViewer.f35808z1;
            if (photoViewer.f35699n1) {
                y51Var = (org.telegram.ui.Components.y51) photoViewer.f35790x2;
            }
            be0Var.b(bitmap, orientation, z10, false, fVar, y51Var, qt0Var.f42197c);
            photoViewer.f35799y1.a();
            int bitmapWidth = photoViewer.f35802y4.getBitmapWidth();
            int bitmapHeight = photoViewer.f35802y4.getBitmapHeight();
            MediaController.CropState cropState = qt0Var.f42197c;
            if (cropState != null) {
                int i11 = cropState.transformRotation;
                if (i11 == 90 || i11 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f10 = bitmapWidth;
            float f11 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.f35727q4) / f10, photoViewer.i1() / f11);
            float min2 = Math.min(photoViewer.k1(1) / f10, photoViewer.h1(1, false) / f11);
            if (photoViewer.Y1 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f10, min3 / f11);
            }
            photoViewer.f35584a6 = min2 / min;
            Rect rect = photoViewer.f35709o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            int i12 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f35742s) {
                i9 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i9 = 0;
            }
            photoViewer.Z5 = i12 + i9;
            photoViewer.f35669j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35686l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.Q0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f30705g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.f35799y1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f35686l6.setDuration(200L);
        photoViewer.f35686l6.addListener(new bc0(this, 8));
        photoViewer.f35686l6.start();
    }
}
