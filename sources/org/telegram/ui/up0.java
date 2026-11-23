package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class up0 extends AnimatorListenerAdapter {
    public final int f52612a;
    public final int f52613b;
    public final PhotoViewer f52614c;

    public up0(PhotoViewer photoViewer, int i7, int i10) {
        this.f52612a = i10;
        this.f52614c = photoViewer;
        this.f52613b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52612a) {
            case 0:
                PhotoViewer photoViewer = this.f52614c;
                vp0 vp0Var = photoViewer.O1;
                vp0Var.f58082e.setVisibility(0);
                FrameLayout frameLayout = vp0Var.f58085r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                org.telegram.messenger.o10.o(translationY, nrVar, 320L);
                vp0Var.f58088x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(nrVar).setDuration(320L).start();
                photoViewer.f43351u4 = this.f52613b;
                photoViewer.f43317q6 = null;
                photoViewer.f43299o6 = -1;
                return;
            default:
                int i7 = this.f52613b;
                PhotoViewer photoViewer2 = this.f52614c;
                photoViewer2.f43351u4 = i7;
                photoViewer2.f43317q6 = null;
                photoViewer2.f43299o6 = -1;
                return;
        }
    }
}
