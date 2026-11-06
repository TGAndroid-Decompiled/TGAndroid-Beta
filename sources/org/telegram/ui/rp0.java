package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f49527a;
    public final int f49528b;
    public final PhotoViewer f49529c;

    public rp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f49527a = i10;
        this.f49529c = photoViewer;
        this.f49528b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49527a) {
            case 0:
                PhotoViewer photoViewer = this.f49529c;
                sp0 sp0Var = photoViewer.N1;
                sp0Var.f55758e.setVisibility(0);
                FrameLayout frameLayout = sp0Var.f55761r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
                sp0Var.f55764x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                photoViewer.f41491t4 = this.f49528b;
                photoViewer.f41456p6 = null;
                photoViewer.f41439n6 = -1;
                return;
            default:
                int i7 = this.f49528b;
                PhotoViewer photoViewer2 = this.f49529c;
                photoViewer2.f41491t4 = i7;
                photoViewer2.f41456p6 = null;
                photoViewer2.f41439n6 = -1;
                return;
        }
    }
}
