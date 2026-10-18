package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class rs0 extends AnimatorListenerAdapter {
    public final float f40787a;
    public final Runnable f40788b;
    public final PhotoViewer f40789c;

    public rs0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f40789c = photoViewer;
        this.f40787a = f7;
        this.f40788b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f40789c;
        photoViewer.f33367p6 = null;
        photoViewer.f33281f6 = 0.0f;
        photoViewer.f33244b6 = 0.0f;
        photoViewer.f33289g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33272e6 = r22;
        photoViewer.f33234a6 = r22;
        photoViewer.f33266e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28747b.f16916a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24195n0 = 0.0f;
        cropAreaView.f24196o0 = r23;
        cropAreaView.f24197p0 = 0.0f;
        cropAreaView.f24198q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28748c.setRotated(false);
        float f7 = this.f40787a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.nf0 nf0Var = photoViewer.C1;
            mg.f fVar = nf0Var.f28748c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (nf0Var.f28747b.m(f7)) {
                photoViewer.f33239b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f21399zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33239b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35480c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f40788b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
