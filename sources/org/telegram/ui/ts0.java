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
    public final int f43094a;
    public final PhotoViewer f43095b;

    public ts0(PhotoViewer photoViewer, int i10) {
        this.f43095b = photoViewer;
        this.f43094a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float min;
        int i11;
        PhotoViewer photoViewer = this.f43095b;
        photoViewer.f35760m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.f35729j0.setVisibility(8);
        photoViewer.B.setVisibility(8);
        photoViewer.f35648a1.setVisibility(8);
        photoViewer.f35657b1.setVisibility(8);
        photoViewer.f35667c1.setVisibility(8);
        org.telegram.ui.Components.pe0 pe0Var = photoViewer.f35866y1;
        if (pe0Var != null) {
            pe0Var.setVisibility(4);
        }
        photoViewer.f35739k1.setVisibility(8);
        photoViewer.f35739k1.setAlpha(0.0f);
        photoViewer.f35739k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.f35739k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.f35685e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i12 = photoViewer.Y1;
        if (i12 == 0 || i12 == 4 || ((i12 == 2 || i12 == 5) && photoViewer.f35671c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.f35869y4.getBitmap();
        if (photoViewer.Y1 == 11) {
            photoViewer.f35689e6 = photoViewer.U5;
            photoViewer.f35679d6 = photoViewer.T5;
            photoViewer.f35699f6 = photoViewer.W5;
            photoViewer.f35708g6 = photoViewer.X5;
            photoViewer.f35662b6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.f35869y4.getBitmapWidth();
            float bitmapHeight = photoViewer.f35869y4.getBitmapHeight();
            float min2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Y1 == 1) {
                photoViewer.Z5 = -AndroidUtilities.dp(36.0f);
                min = photoViewer.l1(false);
            } else {
                int i13 = -AndroidUtilities.dp(93.0f);
                if (!photoViewer.f35808s) {
                    i10 = AndroidUtilities.statusBarHeight / 2;
                } else {
                    i10 = 0;
                }
                photoViewer.Z5 = i13 + i10;
                MediaController.CropState cropState = photoViewer.T4.f41222c;
                if (cropState != null && ((i11 = cropState.transformRotation) == 90 || i11 == 270)) {
                    min = Math.min(photoViewer.k1(photoViewer.f35795q4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
                } else {
                    min = Math.min(photoViewer.k1(photoViewer.f35795q4) / bitmapWidth, photoViewer.i1() / bitmapHeight);
                }
            }
            photoViewer.f35652a6 = min2 / min;
            Rect rect = photoViewer.f35775o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f35735j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35752l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f32225g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.E1.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f35752l6.setDuration(200L);
        photoViewer.f35752l6.addListener(new e50(this, 11));
        photoViewer.f35752l6.start();
    }
}
