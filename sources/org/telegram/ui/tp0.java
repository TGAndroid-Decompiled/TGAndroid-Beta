package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class tp0 extends AnimatorListenerAdapter {
    public final int f52366a;
    public final int f52367b;
    public final PhotoViewer f52368c;

    public tp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f52366a = i10;
        this.f52368c = photoViewer;
        this.f52367b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52366a) {
            case 0:
                PhotoViewer photoViewer = this.f52368c;
                up0 up0Var = photoViewer.O1;
                up0Var.f58113e.setVisibility(0);
                FrameLayout frameLayout = up0Var.f58116r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                org.telegram.messenger.n10.o(translationY, nrVar, 320L);
                up0Var.f58119x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(nrVar).setDuration(320L).start();
                photoViewer.f43382u4 = this.f52367b;
                photoViewer.f43348q6 = null;
                photoViewer.f43330o6 = -1;
                return;
            default:
                int i7 = this.f52367b;
                PhotoViewer photoViewer2 = this.f52368c;
                photoViewer2.f43382u4 = i7;
                photoViewer2.f43348q6 = null;
                photoViewer2.f43330o6 = -1;
                return;
        }
    }
}
