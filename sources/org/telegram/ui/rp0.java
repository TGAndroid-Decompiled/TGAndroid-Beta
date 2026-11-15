package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class rp0 extends AnimatorListenerAdapter {
    public final int f50990a;
    public final int f50991b;
    public final PhotoViewer f50992c;

    public rp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f50990a = i10;
        this.f50992c = photoViewer;
        this.f50991b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50990a) {
            case 0:
                PhotoViewer photoViewer = this.f50992c;
                sp0 sp0Var = photoViewer.O1;
                sp0Var.f57488e.setVisibility(0);
                FrameLayout frameLayout = sp0Var.f57491r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.i20.n(translationY, erVar, 320L);
                sp0Var.f57494x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(erVar).setDuration(320L).start();
                photoViewer.f42896u4 = this.f50991b;
                photoViewer.f42862q6 = null;
                photoViewer.f42844o6 = -1;
                return;
            default:
                int i7 = this.f50991b;
                PhotoViewer photoViewer2 = this.f50992c;
                photoViewer2.f42896u4 = i7;
                photoViewer2.f42862q6 = null;
                photoViewer2.f42844o6 = -1;
                return;
        }
    }
}
