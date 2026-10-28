package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ys0 extends AnimatorListenerAdapter {
    public final float f46076a;
    public final Runnable f46077b;
    public final PhotoViewer f46078c;

    public ys0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.f46078c = photoViewer;
        this.f46076a = f7;
        this.f46077b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.f46078c;
        photoViewer.f35772p6 = null;
        photoViewer.f35686f6 = 0.0f;
        photoViewer.f35648b6 = 0.0f;
        photoViewer.f35694g6 = 0.0f;
        float u22 = photoViewer.u2(false);
        photoViewer.f35676e6 = u22;
        photoViewer.f35638a6 = u22;
        photoViewer.f35670e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.f31597b.f18842a;
        float u23 = photoViewer.u2(false);
        cropAreaView.f26139n0 = 0.0f;
        cropAreaView.f26140o0 = u23;
        cropAreaView.f26141p0 = 0.0f;
        cropAreaView.f26142q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.f31598c.setRotated(false);
        float f7 = this.f46076a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.pf0 pf0Var = photoViewer.C1;
            ng.f fVar = pf0Var.f31598c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (pf0Var.f31597b.m(f7)) {
                org.telegram.ui.ActionBar.f7.t(photoViewer.f35643b1, org.telegram.ui.ActionBar.y6.zf, photoViewer.f35822v2, PorterDuff.Mode.MULTIPLY);
            } else {
                photoViewer.f35643b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.f39990c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.f46077b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
