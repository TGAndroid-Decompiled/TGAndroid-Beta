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
public final class ss0 extends AnimatorListenerAdapter {
    public final int f42457a;
    public final PhotoViewer f42458b;

    public ss0(PhotoViewer photoViewer, int i10) {
        this.f42458b = photoViewer;
        this.f42457a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f42458b;
        ot0 ot0Var = photoViewer.T4;
        org.telegram.ui.Components.l61 l61Var = null;
        photoViewer.f35760m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.f35729j0.setVisibility(8);
        photoViewer.f35648a1.setVisibility(8);
        photoViewer.f35657b1.setVisibility(8);
        photoViewer.f35667c1.setVisibility(8);
        photoViewer.f35739k1.setVisibility(8);
        photoViewer.f35739k1.setAlpha(0.0f);
        photoViewer.f35739k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.f35739k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.f35685e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i11 = photoViewer.Y1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f35671c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.Y1 == 11) {
            photoViewer.f35689e6 = photoViewer.U5;
            photoViewer.f35679d6 = photoViewer.T5;
            photoViewer.f35699f6 = photoViewer.W5;
            photoViewer.f35708g6 = photoViewer.X5;
            photoViewer.f35662b6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.f35869y4.getBitmap();
        if (bitmap != null || photoViewer.f35765n1) {
            org.telegram.ui.Components.pe0 pe0Var = photoViewer.f35866y1;
            int orientation = photoViewer.f35869y4.getOrientation();
            if (photoViewer.Y1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            wf.f fVar = photoViewer.f35874z1;
            if (photoViewer.f35765n1) {
                l61Var = (org.telegram.ui.Components.l61) photoViewer.f35858x2;
            }
            pe0Var.b(bitmap, orientation, z10, false, fVar, l61Var, ot0Var.f41222c);
            photoViewer.f35866y1.a();
            int bitmapWidth = photoViewer.f35869y4.getBitmapWidth();
            int bitmapHeight = photoViewer.f35869y4.getBitmapHeight();
            MediaController.CropState cropState = ot0Var.f41222c;
            if (cropState != null) {
                int i12 = cropState.transformRotation;
                if (i12 == 90 || i12 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            float f9 = bitmapWidth;
            float f10 = bitmapHeight;
            float min = Math.min(photoViewer.k1(photoViewer.f35795q4) / f9, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f9, photoViewer.h1(1, false) / f10);
            if (photoViewer.Y1 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f9, min3 / f10);
            }
            photoViewer.f35652a6 = min2 / min;
            Rect rect = photoViewer.f35775o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f35808s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.Z5 = i13 + i10;
            photoViewer.f35735j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35752l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.Q0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f32225g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.f35866y1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f35752l6.setDuration(200L);
        photoViewer.f35752l6.addListener(new e50(this, 10));
        photoViewer.f35752l6.start();
    }
}
