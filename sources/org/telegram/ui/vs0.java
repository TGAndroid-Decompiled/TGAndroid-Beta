package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

public final class vs0 extends AnimatorListenerAdapter {

    public final int f43519a;

    public final PhotoViewer f43520b;

    public vs0(PhotoViewer photoViewer, int i10) {
        this.f43520b = photoViewer;
        this.f43519a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float fMin;
        int i10;
        PhotoViewer photoViewer = this.f43520b;
        photoViewer.f35697m6 = null;
        photoViewer.L0.setVisibility(8);
        photoViewer.O0.setVisibility(8);
        photoViewer.f35666j0.setVisibility(8);
        photoViewer.B.setVisibility(8);
        photoViewer.f35584a1.setVisibility(8);
        photoViewer.f35592b1.setVisibility(8);
        photoViewer.f35602c1.setVisibility(8);
        org.telegram.ui.Components.ge0 ge0Var = photoViewer.f35802y1;
        if (ge0Var != null) {
            ge0Var.setVisibility(4);
        }
        photoViewer.f35676k1.setVisibility(8);
        photoViewer.f35676k1.setAlpha(0.0f);
        photoViewer.f35676k1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.K0.setRotationX(0.0f);
        photoViewer.f35676k1.setEnabled(false);
        photoViewer.G = false;
        if (photoViewer.f35622e2) {
            photoViewer.M1.setVisibility(4);
        }
        int i11 = photoViewer.Y1;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f35608c7.size() > 1)) {
            photoViewer.J0.setVisibility(8);
            photoViewer.K0.setVisibility(8);
            photoViewer.s3();
        }
        Bitmap bitmap = photoViewer.f35805y4.getBitmap();
        if (photoViewer.Y1 == 11) {
            photoViewer.f35626e6 = photoViewer.U5;
            photoViewer.f35616d6 = photoViewer.T5;
            photoViewer.f35636f6 = photoViewer.W5;
            photoViewer.f35645g6 = photoViewer.X5;
            photoViewer.f35597b6 = 0.0f;
        }
        if (bitmap != null) {
            float bitmapWidth = photoViewer.f35805y4.getBitmapWidth();
            float bitmapHeight = photoViewer.f35805y4.getBitmapHeight();
            float fMin2 = Math.min(photoViewer.k1(2) / bitmapWidth, photoViewer.h1(2, false) / bitmapHeight);
            if (photoViewer.Y1 == 1) {
                photoViewer.Z5 = -AndroidUtilities.dp(36.0f);
                fMin = photoViewer.l1(false);
            } else {
                photoViewer.Z5 = (-AndroidUtilities.dp(93.0f)) + (!photoViewer.f35745s ? AndroidUtilities.statusBarHeight / 2 : 0);
                MediaController.CropState cropState = photoViewer.T4.f42331c;
                fMin = (cropState == null || !((i10 = cropState.transformRotation) == 90 || i10 == 270)) ? Math.min(photoViewer.k1(photoViewer.f35731q4) / bitmapWidth, photoViewer.i1() / bitmapHeight) : Math.min(photoViewer.k1(photoViewer.f35731q4) / bitmapHeight, photoViewer.i1() / bitmapWidth);
            }
            photoViewer.f35587a6 = fMin2 / fMin;
            Rect rect = photoViewer.f35712o2;
            photoViewer.Y5 = (rect.left / 2) - (rect.right / 2);
            photoViewer.f35672j6 = System.currentTimeMillis();
            photoViewer.N6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f35689l6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.m6.f30583g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.E1.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
        photoViewer.f35689l6.setDuration(200L);
        photoViewer.f35689l6.addListener(new f50(this, 11));
        photoViewer.f35689l6.start();
    }
}
