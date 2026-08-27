package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

public final class us0 extends AnimatorListenerAdapter {

    public final int f43281a;

    public final PhotoViewer f43282b;

    public us0(PhotoViewer photoViewer, int i10) {
        this.f43282b = photoViewer;
        this.f43281a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f43282b;
        rt0 rt0Var = photoViewer.T4;
        photoViewer.f35697m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.f35666j0.setVisibility(8);
        photoViewer.f35584a1.setVisibility(8);
        photoViewer.f35592b1.setVisibility(8);
        photoViewer.f35602c1.setVisibility(8);
        photoViewer.f35676k1.setVisibility(8);
        photoViewer.f35676k1.setAlpha(0.0f);
        photoViewer.f35676k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.f35676k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.f35622e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i10 = photoViewer.Y1;
        if (i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.f35608c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.Y1 == 11) {
            photoViewer.f35626e6 = photoViewer.U5;
            photoViewer.f35616d6 = photoViewer.T5;
            photoViewer.f35636f6 = photoViewer.W5;
            photoViewer.f35645g6 = photoViewer.X5;
            photoViewer.f35597b6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.f35805y4.getBitmap();
        if (bitmap != null || photoViewer.f35702n1) {
            photoViewer.f35802y1.b(bitmap, photoViewer.f35805y4.getOrientation(), photoViewer.Y1 != 1, false, photoViewer.f35811z1, photoViewer.f35702n1 ? (org.telegram.ui.Components.a61) photoViewer.f35794x2 : null, rt0Var.f42331c);
            photoViewer.f35802y1.a();
            int bitmapWidth = photoViewer.f35805y4.getBitmapWidth();
            int bitmapHeight = photoViewer.f35805y4.getBitmapHeight();
            MediaController.CropState cropState = rt0Var.f42331c;
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
            float fK1 = photoViewer.k1(photoViewer.f35731q4) / f10;
            float f11 = bitmapHeight;
            float fI1 = photoViewer.i1() / f11;
            float fK2 = photoViewer.k1(1) / f10;
            float fH1 = photoViewer.h1(1, false) / f11;
            float fMin = Math.min(fK1, fI1);
            float fMin2 = Math.min(fK2, fH1);
            if (photoViewer.Y1 == 1) {
                float fMin3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                fMin2 = Math.max(fMin3 / f10, fMin3 / f11);
            }
            photoViewer.f35587a6 = fMin2 / fMin;
            Rect rect = photoViewer.f35712o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.Z5 = (-AndroidUtilities.dp(56.0f)) + (!photoViewer.f35745s ? AndroidUtilities.statusBarHeight / 2 : 0);
            photoViewer.f35672j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35689l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.Q0, (Property<org.telegram.ui.Components.ff0, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f30583g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.f35802y1, (Property<org.telegram.ui.Components.ge0, Float>) View.ALPHA, 0.0f, 1.0f));
        photoViewer.f35689l6.setDuration(200L);
        photoViewer.f35689l6.addListener(new f50(this, 10));
        photoViewer.f35689l6.start();
    }
}
