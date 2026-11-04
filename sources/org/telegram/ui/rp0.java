package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rp0 extends AnimatorListenerAdapter {
    public final sp0 f49260a;

    public rp0(sp0 sp0Var) {
        this.f49260a = sp0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        sp0 sp0Var = this.f49260a;
        PhotoViewer photoViewer = sp0Var.f49589c;
        photoViewer.f41499o4 = 0;
        photoViewer.I1();
        photoViewer.M0.setAlpha(255);
        photoViewer.f41420f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.f41553u4) {
            PhotoViewer.b0(photoViewer, sp0Var.f49588b.intValue());
        }
        kq0 kq0Var = sp0Var.f49587a;
        if (kq0Var != null) {
            kq0Var.d();
        }
    }
}
