package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yt0 extends AnimatorListenerAdapter {
    public final zt0 f40234a;

    public yt0(zt0 zt0Var) {
        this.f40234a = zt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        zt0 zt0Var = this.f40234a;
        PhotoViewer photoViewer = zt0Var.f40564c;
        photoViewer.f31290n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f31209e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31344t4) {
            PhotoViewer.a0(photoViewer, zt0Var.f40563b.intValue());
        }
        tu0 tu0Var = zt0Var.f40562a;
        if (tu0Var != null) {
            tu0Var.d();
        }
    }
}
