package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class rs0 extends AnimatorListenerAdapter {
    public final float f41220a;
    public final Runnable f41221b;
    public final PhotoViewer f41222c;

    public rs0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f41222c = photoViewer;
        this.f41220a = f7;
        this.f41221b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f41222c;
        photoViewer.f33683p6 = null;
        photoViewer.f33597f6 = 0.0f;
        photoViewer.f33560b6 = 0.0f;
        photoViewer.f33605g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.f33588e6 = t22;
        photoViewer.f33550a6 = t22;
        photoViewer.f33582e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f29903b.f16980a;
        float t23 = photoViewer.t2(false);
        cropAreaView.f24345n0 = 0.0f;
        cropAreaView.f24346o0 = t23;
        cropAreaView.f24347p0 = 0.0f;
        cropAreaView.f24348q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f29904c.setRotated(false);
        float f7 = this.f41220a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.qf0 qf0Var = photoViewer.C1;
            mg.f fVar = qf0Var.f29904c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (qf0Var.f29903b.m(f7)) {
                org.telegram.ui.ActionBar.r6.t(photoViewer.f33555b1, org.telegram.ui.ActionBar.k6.f21597zf, photoViewer.f33734v2, PorterDuff.Mode.MULTIPLY);
            } else {
                photoViewer.f33555b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35839c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f41221b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
