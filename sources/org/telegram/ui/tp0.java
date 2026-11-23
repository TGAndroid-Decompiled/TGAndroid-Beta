package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class tp0 extends AnimatorListenerAdapter {
    public final int f52443a;
    public final int f52444b;
    public final PhotoViewer f52445c;

    public tp0(PhotoViewer photoViewer, int i7, int i10) {
        this.f52443a = i10;
        this.f52445c = photoViewer;
        this.f52444b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52443a) {
            case 0:
                PhotoViewer photoViewer = this.f52445c;
                up0 up0Var = photoViewer.O1;
                up0Var.f58236e.setVisibility(0);
                FrameLayout frameLayout = up0Var.f58239r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
                org.telegram.messenger.m10.o(translationY, krVar, 320L);
                up0Var.f58242x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(krVar).setDuration(320L).start();
                photoViewer.f43467u4 = this.f52444b;
                photoViewer.f43433q6 = null;
                photoViewer.f43415o6 = -1;
                return;
            default:
                int i7 = this.f52444b;
                PhotoViewer photoViewer2 = this.f52445c;
                photoViewer2.f43467u4 = i7;
                photoViewer2.f43433q6 = null;
                photoViewer2.f43415o6 = -1;
                return;
        }
    }
}
