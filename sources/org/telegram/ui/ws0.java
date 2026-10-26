package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ws0 extends AnimatorListenerAdapter {
    public final float f45548a;
    public final Runnable f45549b;
    public final PhotoViewer f45550c;

    public ws0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f45550c = photoViewer;
        this.f45548a = f7;
        this.f45549b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f45550c;
        photoViewer.f35748p6 = null;
        photoViewer.f35662f6 = 0.0f;
        photoViewer.f35624b6 = 0.0f;
        photoViewer.f35670g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.f35652e6 = t22;
        photoViewer.f35614a6 = t22;
        photoViewer.f35646e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f31285b.f18843a;
        float t23 = photoViewer.t2(false);
        cropAreaView.f26137n0 = 0.0f;
        cropAreaView.f26138o0 = t23;
        cropAreaView.f26139p0 = 0.0f;
        cropAreaView.f26140q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f31286c.setRotated(false);
        float f7 = this.f45548a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            ng.f fVar = of0Var.f31286c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (of0Var.f31285b.m(f7)) {
                org.telegram.ui.ActionBar.f7.t(photoViewer.f35619b1, org.telegram.ui.ActionBar.y6.zf, photoViewer.f35798v2, PorterDuff.Mode.MULTIPLY);
            } else {
                photoViewer.f35619b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f39475c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f45549b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
