package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f49802a;
    public final int f49803b;
    public final PhotoViewer f49804c;

    public sp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f49802a = i10;
        this.f49804c = photoViewer;
        this.f49803b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49802a) {
            case 0:
                PhotoViewer photoViewer = this.f49804c;
                tp0 tp0Var = photoViewer.N1;
                tp0Var.f55874e.setVisibility(0);
                FrameLayout frameLayout = tp0Var.f55877r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
                tp0Var.f55880x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                photoViewer.f41519t4 = this.f49803b;
                photoViewer.f41484p6 = null;
                photoViewer.f41467n6 = -1;
                return;
            default:
                int i7 = this.f49803b;
                PhotoViewer photoViewer2 = this.f49804c;
                photoViewer2.f41519t4 = i7;
                photoViewer2.f41484p6 = null;
                photoViewer2.f41467n6 = -1;
                return;
        }
    }
}
