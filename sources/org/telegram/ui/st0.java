package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class st0 extends AnimatorListenerAdapter {
    public final tt0 f38309a;

    public st0(tt0 tt0Var) {
        this.f38309a = tt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        tt0 tt0Var = this.f38309a;
        PhotoViewer photoViewer = tt0Var.f38589c;
        photoViewer.f31764k4 = 0;
        photoViewer.F1();
        photoViewer.I0.setAlpha(255);
        photoViewer.f31679b0.invalidate();
        photoViewer.M0.setTranslationY(0.0f);
        if (photoViewer.f31817q4) {
            PhotoViewer.a0(photoViewer, tt0Var.f38588b.intValue());
        }
        ou0 ou0Var = tt0Var.f38587a;
        if (ou0Var != null) {
            ou0Var.d();
        }
    }
}
