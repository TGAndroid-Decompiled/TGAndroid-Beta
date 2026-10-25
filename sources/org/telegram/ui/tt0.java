package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tt0 extends AnimatorListenerAdapter {
    public final ut0 f43910a;

    public tt0(ut0 ut0Var) {
        this.f43910a = ut0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ut0 ut0Var = this.f43910a;
        PhotoViewer photoViewer = ut0Var.f44532c;
        photoViewer.f35725n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f35643e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f35779t4) {
            PhotoViewer.b0(photoViewer, ut0Var.f44531b.intValue());
        }
        ou0 ou0Var = ut0Var.f44530a;
        if (ou0Var != null) {
            ou0Var.d();
        }
    }
}
