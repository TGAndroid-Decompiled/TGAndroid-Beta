package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class qt0 extends AnimatorListenerAdapter {
    public final float f39535a;
    public final Runnable f39536b;
    public final PhotoViewer f39537c;

    public qt0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f39537c = photoViewer;
        this.f39535a = f7;
        this.f39536b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f39537c;
        photoViewer.f32327p6 = null;
        photoViewer.f32241f6 = 0.0f;
        photoViewer.f32204b6 = 0.0f;
        photoViewer.f32249g6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f32232e6 = r22;
        photoViewer.f32194a6 = r22;
        photoViewer.f32226e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f29369b.f15824a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f23140n0 = 0.0f;
        cropAreaView.f23141o0 = r23;
        cropAreaView.f23142p0 = 0.0f;
        cropAreaView.f23143q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f29370c.setRotated(false);
        float f7 = this.f39535a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.tf0 tf0Var = photoViewer.C1;
            mg.f fVar = tf0Var.f29370c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (tf0Var.f29369b.m(f7)) {
                photoViewer.f32199b1.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.g6.f20313zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.f32199b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f42716c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f39536b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
