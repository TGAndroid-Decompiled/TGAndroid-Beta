package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class tp0 extends AnimatorListenerAdapter {
    public final int f52370a;
    public final int f52371b;
    public final PhotoViewer f52372c;

    public tp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f52370a = i10;
        this.f52372c = photoViewer;
        this.f52371b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52370a) {
            case 0:
                PhotoViewer photoViewer = this.f52372c;
                up0 up0Var = photoViewer.O1;
                up0Var.f58117e.setVisibility(0);
                FrameLayout frameLayout = up0Var.f58120r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                org.telegram.messenger.o10.o(translationY, nrVar, 320L);
                up0Var.f58123x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(nrVar).setDuration(320L).start();
                photoViewer.f43386u4 = this.f52371b;
                photoViewer.f43352q6 = null;
                photoViewer.f43334o6 = -1;
                return;
            default:
                int i7 = this.f52371b;
                PhotoViewer photoViewer2 = this.f52372c;
                photoViewer2.f43386u4 = i7;
                photoViewer2.f43352q6 = null;
                photoViewer2.f43334o6 = -1;
                return;
        }
    }
}
