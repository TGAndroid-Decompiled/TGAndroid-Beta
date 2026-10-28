package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vt0 extends AnimatorListenerAdapter {
    public final wt0 f44425a;

    public vt0(wt0 wt0Var) {
        this.f44425a = wt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        wt0 wt0Var = this.f44425a;
        PhotoViewer photoViewer = wt0Var.f45403c;
        photoViewer.f35752n4 = 0;
        photoViewer.I1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f35670e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f35806t4) {
            PhotoViewer.b0(photoViewer, wt0Var.f45402b.intValue());
        }
        qu0 qu0Var = wt0Var.f45401a;
        if (qu0Var != null) {
            qu0Var.d();
        }
    }
}
