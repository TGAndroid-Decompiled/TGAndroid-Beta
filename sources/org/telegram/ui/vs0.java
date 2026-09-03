package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class vs0 extends AnimatorListenerAdapter {
    public final float f42204a;
    public final Runnable f42205b;
    public final PhotoViewer f42206c;

    public vs0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.f42206c = photoViewer;
        this.f42204a = f10;
        this.f42205b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f42206c;
        photoViewer.f34334m6 = null;
        photoViewer.f34245c6 = 0.0f;
        photoViewer.Y5 = 0.0f;
        photoViewer.f34254d6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f34236b6 = r22;
        photoViewer.X5 = r22;
        photoViewer.f34230b0.invalidate();
        CropAreaView cropAreaView = photoViewer.f34450z1.f25240b.f51201a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24860k0 = 0.0f;
        cropAreaView.f24861l0 = r23;
        cropAreaView.m0 = 0.0f;
        cropAreaView.f24863n0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.f34450z1.f25241c.setRotated(false);
        float f10 = this.f42204a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.af0 af0Var = photoViewer.f34450z1;
            zf.e eVar = af0Var.f25241c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (af0Var.f25240b.m(f10)) {
                photoViewer.Y0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.k6.f22061zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.Y0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.U4.f36590c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f42205b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
