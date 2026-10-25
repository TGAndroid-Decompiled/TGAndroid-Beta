package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ws0 extends AnimatorListenerAdapter {
    public final float f45545a;
    public final Runnable f45546b;
    public final PhotoViewer f45547c;

    public ws0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f45547c = photoViewer;
        this.f45545a = f7;
        this.f45546b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f45547c;
        photoViewer.f35745p6 = null;
        photoViewer.f35659f6 = 0.0f;
        photoViewer.f35621b6 = 0.0f;
        photoViewer.f35667g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.f35649e6 = t22;
        photoViewer.f35611a6 = t22;
        photoViewer.f35643e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f31283b.f18843a;
        float t23 = photoViewer.t2(false);
        cropAreaView.f26135n0 = 0.0f;
        cropAreaView.f26136o0 = t23;
        cropAreaView.f26137p0 = 0.0f;
        cropAreaView.f26138q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f31284c.setRotated(false);
        float f7 = this.f45545a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            ng.f fVar = of0Var.f31284c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (of0Var.f31283b.m(f7)) {
                org.telegram.ui.ActionBar.f7.t(photoViewer.f35616b1, org.telegram.ui.ActionBar.y6.zf, photoViewer.f35795v2, PorterDuff.Mode.MULTIPLY);
            } else {
                photoViewer.f35616b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f39472c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f45546b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
