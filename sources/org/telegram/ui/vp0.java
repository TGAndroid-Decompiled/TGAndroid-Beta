package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class vp0 extends AnimatorListenerAdapter {
    public final int f50775a;
    public final int f50776b;
    public final PhotoViewer f50777c;

    public vp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f50775a = i10;
        this.f50777c = photoViewer;
        this.f50776b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50775a) {
            case 0:
                PhotoViewer photoViewer = this.f50777c;
                wp0 wp0Var = photoViewer.N1;
                wp0Var.f55886e.setVisibility(0);
                FrameLayout frameLayout = wp0Var.f55889r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
                org.telegram.messenger.camera.q.l(translationY, wqVar, 320L);
                wp0Var.f55892x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(wqVar).setDuration(320L).start();
                photoViewer.f41517t4 = this.f50776b;
                photoViewer.f41482p6 = null;
                photoViewer.f41465n6 = -1;
                return;
            default:
                int i7 = this.f50776b;
                PhotoViewer photoViewer2 = this.f50777c;
                photoViewer2.f41517t4 = i7;
                photoViewer2.f41482p6 = null;
                photoViewer2.f41465n6 = -1;
                return;
        }
    }
}
