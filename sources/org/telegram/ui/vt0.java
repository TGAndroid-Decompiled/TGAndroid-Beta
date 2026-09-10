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
    public final int f37622a;
    public final PhotoViewer f37623b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.f37623b = photoViewer;
        this.f37622a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        PhotoViewer photoViewer = this.f37623b;
        su0 su0Var = photoViewer.X4;
        org.telegram.ui.Components.h71 h71Var = null;
        photoViewer.q6 = null;
        photoViewer.P0.setVisibility(8);
        photoViewer.S0.setVisibility(8);
        photoViewer.f30126n0.setVisibility(8);
        photoViewer.f30050e1.setVisibility(8);
        photoViewer.f30059f1.setVisibility(8);
        photoViewer.f30067g1.setVisibility(8);
        photoViewer.f30136o1.setVisibility(8);
        photoViewer.f30136o1.setAlpha(0.0f);
        photoViewer.f30136o1.setTranslationY(-AndroidUtilities.dp(10.0f));
        photoViewer.O0.setRotationX(0.0f);
        photoViewer.f30136o1.setEnabled(false);
        photoViewer.K = false;
        if (photoViewer.f30086i2) {
            photoViewer.Q1.setVisibility(4);
        }
        int i11 = photoViewer.f30033c2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && photoViewer.f30073g7.size() > 1)) {
            photoViewer.N0.setVisibility(8);
            photoViewer.O0.setVisibility(8);
            photoViewer.s3();
        }
        if (photoViewer.f30033c2 == 11) {
            photoViewer.f30090i6 = photoViewer.Y5;
            photoViewer.f30081h6 = photoViewer.X5;
            photoViewer.f30098j6 = photoViewer.f30017a6;
            photoViewer.f30107k6 = photoViewer.f30027b6;
            photoViewer.f30064f6 = 0.0f;
        }
        Bitmap bitmap = photoViewer.C4.getBitmap();
        if (bitmap != null || photoViewer.f30162r1) {
            org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
            int orientation = photoViewer.C4.getOrientation();
            if (photoViewer.f30033c2 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            kg.g gVar = photoViewer.D1;
            if (photoViewer.f30162r1) {
                h71Var = (org.telegram.ui.Components.h71) photoViewer.B2;
            }
            df0Var.b(bitmap, orientation, z10, false, gVar, h71Var, su0Var.f36761c);
            photoViewer.C1.a();
            int bitmapWidth = photoViewer.C4.getBitmapWidth();
            int bitmapHeight = photoViewer.C4.getBitmapHeight();
            MediaController.CropState cropState = su0Var.f36761c;
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
            float min = Math.min(photoViewer.k1(photoViewer.f30193u4) / f7, photoViewer.i1() / f10);
            float min2 = Math.min(photoViewer.k1(1) / f7, photoViewer.h1(1, false) / f10);
            if (photoViewer.f30033c2 == 1) {
                float min3 = Math.min(photoViewer.k1(1), photoViewer.h1(1, false));
                min2 = Math.max(min3 / f7, min3 / f10);
            }
            photoViewer.f30055e6 = min2 / min;
            Rect rect = photoViewer.f30173s2;
            photoViewer.f30037c6 = (rect.left / 2) - (rect.right / 2);
            int i13 = -AndroidUtilities.dp(56.0f);
            if (!photoViewer.f30170s) {
                i10 = AndroidUtilities.statusBarHeight / 2;
            } else {
                i10 = 0;
            }
            photoViewer.f30046d6 = i13 + i10;
            photoViewer.f30132n6 = System.currentTimeMillis();
            photoViewer.R6 = true;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        photoViewer.f30149p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.U0, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(photoViewer, org.telegram.ui.Components.r6.f26603g, 0.0f, 1.0f), ObjectAnimator.ofFloat(photoViewer.C1, View.ALPHA, 0.0f, 1.0f));
        photoViewer.f30149p6.setDuration(200L);
        photoViewer.f30149p6.addListener(new org.telegram.ui.Components.voip.v2(this, 22));
        photoViewer.f30149p6.start();
    }
}
