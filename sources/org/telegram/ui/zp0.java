package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zp0 extends AnimatorListenerAdapter {
    public final aq0 f54006a;

    public zp0(aq0 aq0Var) {
        this.f54006a = aq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        aq0 aq0Var = this.f54006a;
        PhotoViewer photoViewer = aq0Var.f45486c;
        photoViewer.f42834n4 = 0;
        photoViewer.D1();
        photoViewer.M0.setAlpha(255);
        photoViewer.f42763f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.f42888t4) {
            PhotoViewer.T(photoViewer, aq0Var.f45485b.intValue());
        }
        sq0 sq0Var = aq0Var.f45484a;
        if (sq0Var != null) {
            sq0Var.d();
        }
    }
}
