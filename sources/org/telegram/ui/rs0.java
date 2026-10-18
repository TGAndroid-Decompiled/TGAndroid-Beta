package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class rs0 extends AnimatorListenerAdapter {
    public final float f40825a;
    public final Runnable f40826b;
    public final PhotoViewer f40827c;

    public rs0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f40827c = photoViewer;
        this.f40825a = f7;
        this.f40826b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f40827c;
        photoViewer.f33374p6 = null;
        photoViewer.f33288f6 = 0.0f;
        photoViewer.f33251b6 = 0.0f;
        photoViewer.f33296g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f33279e6 = r22;
        photoViewer.f33241a6 = r22;
        photoViewer.f33273e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f28754b.f16918a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24202n0 = 0.0f;
        cropAreaView.f24203o0 = r23;
        cropAreaView.f24204p0 = 0.0f;
        cropAreaView.f24205q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f28755c.setRotated(false);
        float f7 = this.f40825a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.nf0 nf0Var = photoViewer.C1;
            mg.f fVar = nf0Var.f28755c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (nf0Var.f28754b.m(f7)) {
                photoViewer.f33246b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.h6.f21406zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f33246b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f35519c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f40826b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
