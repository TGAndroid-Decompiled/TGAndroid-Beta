package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class qs0 extends AnimatorListenerAdapter {
    public final float f40664a;
    public final Runnable f40665b;
    public final PhotoViewer f40666c;

    public qs0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.f40666c = photoViewer;
        this.f40664a = f10;
        this.f40665b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f40666c;
        photoViewer.f34334m6 = null;
        photoViewer.f34245c6 = 0.0f;
        photoViewer.Y5 = 0.0f;
        photoViewer.f34254d6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.f34236b6 = r22;
        photoViewer.X5 = r22;
        photoViewer.f34230b0.invalidate();
        CropAreaView cropAreaView = photoViewer.f34450z1.f25248b.f51166a;
        float r23 = photoViewer.r2(false);
        cropAreaView.f24858k0 = 0.0f;
        cropAreaView.f24859l0 = r23;
        cropAreaView.m0 = 0.0f;
        cropAreaView.f24861n0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.f34450z1.f25249c.setRotated(false);
        float f10 = this.f40664a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.af0 af0Var = photoViewer.f34450z1;
            zf.e eVar = af0Var.f25249c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (af0Var.f25248b.m(f10)) {
                photoViewer.Y0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.k6.f22059zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.Y0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.U4.f43995c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f40665b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
