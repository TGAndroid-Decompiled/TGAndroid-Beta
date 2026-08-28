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
public final class us0 extends AnimatorListenerAdapter {
    public final int f43307a;
    public final PhotoViewer f43308b;

    public us0(PhotoViewer photoViewer, int i9) {
        this.f43308b = photoViewer;
        this.f43307a = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        float min;
        int i10;
        PhotoViewer photoViewer = this.f43308b;
        photoViewer.f35694m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.f35663j0.setVisibility(8);
        photoViewer.B.setVisibility(8);
        photoViewer.f35581a1.setVisibility(8);
        photoViewer.f35589b1.setVisibility(8);
        photoViewer.f35599c1.setVisibility(8);
        org.telegram.ui.Components.be0 be0Var = photoViewer.f35799y1;
        if (be0Var != null) {
            be0Var.setVisibility(4);
        }
        photoViewer.f35673k1.setVisibility(8);
        photoViewer.f35673k1.setAlpha(0.0f);
        photoViewer.f35673k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.f35673k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.f35619e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i11 = photoViewer.Y1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f35605c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.f35802y4.getBitmap();
        if (photoViewer.Y1 == 11) {
            photoViewer.f35623e6 = photoViewer.U5;
            photoViewer.f35613d6 = photoViewer.T5;
            photoViewer.f35633f6 = photoViewer.W5;
            photoViewer.f35642g6 = photoViewer.X5;
            photoViewer.f35594b6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.f35802y4.getBitmapWidth();
            float bitmapHeight = photoViewer.f35802y4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Y1 == 1) {
                photoViewer.Z5 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i12 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f35742s) {
                    i9 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i9 = 0;
                }
                photoViewer.Z5 = i12 + i9;
                MediaController.CropState cropState = photoViewer.T4.f42197c;
                if (cropState != null && ((i10 = cropState.transformRotation) == 90 || i10 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f35727q4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f35727q4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f35584a6 = min2 / min;
            Rect rect = photoViewer.f35709o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f35669j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35686l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f30705g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.E1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f35686l6.setDuration(200L);
        photoViewer.f35686l6.addListener(new bc0(this, 9));
        photoViewer.f35686l6.start();
    }
}
