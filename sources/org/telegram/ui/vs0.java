package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class vs0 extends AnimatorListenerAdapter {
    public final float f39184a;
    public final Runnable f39185b;
    public final PhotoViewer f39186c;

    public vs0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.f39186c = photoViewer;
        this.f39184a = f10;
        this.f39185b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f39186c;
        photoViewer.f31782m6 = null;
        photoViewer.f31694c6 = 0.0f;
        photoViewer.Y5 = 0.0f;
        photoViewer.f31703d6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f31685b6 = r22;
        photoViewer.X5 = r22;
        photoViewer.f31679b0.invalidate();
        CropAreaView cropAreaView = photoViewer.f31898z1.f31372b.f47310a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f22983k0 = 0.0f;
        cropAreaView.f22984l0 = r23;
        cropAreaView.m0 = 0.0f;
        cropAreaView.f22986n0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.f31898z1.f31373c.setRotated(false);
        float f10 = this.f39184a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.ze0 ze0Var = photoViewer.f31898z1;
            yf.e eVar = ze0Var.f31373c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (ze0Var.f31372b.m(f10)) {
                photoViewer.Y0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f20279zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.Y0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.U4.f33855c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f39185b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
