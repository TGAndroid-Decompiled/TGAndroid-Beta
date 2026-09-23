package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zt0 extends AnimatorListenerAdapter {
    public final au0 f40245a;

    public zt0(au0 au0Var) {
        this.f40245a = au0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        au0 au0Var = this.f40245a;
        PhotoViewer photoViewer = au0Var.f31887c;
        photoViewer.f30989n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f30908e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31043t4) {
            PhotoViewer.a0(photoViewer, au0Var.f31886b.intValue());
        }
        uu0 uu0Var = au0Var.f31885a;
        if (uu0Var != null) {
            uu0Var.d();
        }
    }
}
