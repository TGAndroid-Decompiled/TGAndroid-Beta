package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ss0 extends AnimatorListenerAdapter {
    public final float f41797a;
    public final Runnable f41798b;
    public final PhotoViewer f41799c;

    public ss0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f41799c = photoViewer;
        this.f41797a = f7;
        this.f41798b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f41799c;
        photoViewer.f33681p6 = null;
        photoViewer.f33595f6 = 0.0f;
        photoViewer.f33558b6 = 0.0f;
        photoViewer.f33603g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.f33586e6 = t22;
        photoViewer.f33548a6 = t22;
        photoViewer.f33580e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f30163b.f16980a;
        float t23 = photoViewer.t2(false);
        cropAreaView.f24344n0 = 0.0f;
        cropAreaView.f24345o0 = t23;
        cropAreaView.f24346p0 = 0.0f;
        cropAreaView.f24347q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f30164c.setRotated(false);
        float f7 = this.f41797a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.rf0 rf0Var = photoViewer.C1;
            mg.f fVar = rf0Var.f30164c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (rf0Var.f30163b.m(f7)) {
                org.telegram.ui.ActionBar.r6.t(photoViewer.f33553b1, org.telegram.ui.ActionBar.k6.f21596zf, photoViewer.f33732v2, PorterDuff.Mode.MULTIPLY);
            } else {
                photoViewer.f33553b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f36169c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f41798b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
