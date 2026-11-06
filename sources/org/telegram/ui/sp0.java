package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f49811a;
    public final int f49812b;
    public final PhotoViewer f49813c;

    public sp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f49811a = i10;
        this.f49813c = photoViewer;
        this.f49812b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49811a) {
            case 0:
                PhotoViewer photoViewer = this.f49813c;
                tp0 tp0Var = photoViewer.N1;
                tp0Var.f55782e.setVisibility(0);
                FrameLayout frameLayout = tp0Var.f55785r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
                tp0Var.f55788x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                photoViewer.f41515t4 = this.f49812b;
                photoViewer.f41480p6 = null;
                photoViewer.f41463n6 = -1;
                return;
            default:
                int i7 = this.f49812b;
                PhotoViewer photoViewer2 = this.f49813c;
                photoViewer2.f41515t4 = i7;
                photoViewer2.f41480p6 = null;
                photoViewer2.f41463n6 = -1;
                return;
        }
    }
}
