package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class sp0 extends AnimatorListenerAdapter {
    public final int f49812a;
    public final int f49813b;
    public final PhotoViewer f49814c;

    public sp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f49812a = i10;
        this.f49814c = photoViewer;
        this.f49813b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49812a) {
            case 0:
                PhotoViewer photoViewer = this.f49814c;
                tp0 tp0Var = photoViewer.N1;
                tp0Var.f55783e.setVisibility(0);
                FrameLayout frameLayout = tp0Var.f55786r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
                tp0Var.f55789x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                photoViewer.f41516t4 = this.f49813b;
                photoViewer.f41481p6 = null;
                photoViewer.f41464n6 = -1;
                return;
            default:
                int i7 = this.f49813b;
                PhotoViewer photoViewer2 = this.f49814c;
                photoViewer2.f41516t4 = i7;
                photoViewer2.f41481p6 = null;
                photoViewer2.f41464n6 = -1;
                return;
        }
    }
}
