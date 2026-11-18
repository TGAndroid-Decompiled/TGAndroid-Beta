package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class tp0 extends AnimatorListenerAdapter {
    public final int f52325a;
    public final int f52326b;
    public final PhotoViewer f52327c;

    public tp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f52325a = i10;
        this.f52327c = photoViewer;
        this.f52326b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52325a) {
            case 0:
                PhotoViewer photoViewer = this.f52327c;
                up0 up0Var = photoViewer.O1;
                up0Var.f58063e.setVisibility(0);
                FrameLayout frameLayout = up0Var.f58066r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
                org.telegram.messenger.n10.o(translationY, lrVar, 320L);
                up0Var.f58069x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(lrVar).setDuration(320L).start();
                photoViewer.f43341u4 = this.f52326b;
                photoViewer.f43307q6 = null;
                photoViewer.f43289o6 = -1;
                return;
            default:
                int i7 = this.f52326b;
                PhotoViewer photoViewer2 = this.f52327c;
                photoViewer2.f43341u4 = i7;
                photoViewer2.f43307q6 = null;
                photoViewer2.f43289o6 = -1;
                return;
        }
    }
}
