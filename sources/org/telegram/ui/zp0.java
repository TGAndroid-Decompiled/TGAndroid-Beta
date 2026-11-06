package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zp0 extends AnimatorListenerAdapter {
    public final aq0 f52634a;

    public zp0(aq0 aq0Var) {
        this.f52634a = aq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        aq0 aq0Var = this.f52634a;
        PhotoViewer photoViewer = aq0Var.f44058c;
        photoViewer.f41428m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f41356e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f41483s4) {
            PhotoViewer.S(photoViewer, aq0Var.f44057b.intValue());
        }
        tq0 tq0Var = aq0Var.f44056a;
        if (tq0Var != null) {
            tq0Var.d();
        }
    }
}
