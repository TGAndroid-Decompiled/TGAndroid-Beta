package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w extends AnimatorListenerAdapter {
    public final x a;

    public w(x xVar) {
        this.a = xVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        x xVar = this.a;
        PhotoViewer photoViewer = xVar.c;
        photoViewer.m4 = (byte) 0;
        photoViewer.H0();
        photoViewer.M0.setAlpha(255);
        photoViewer.f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            photoViewer.G0(xVar.b.intValue());
        }
        pb8 pb8Var = xVar.a;
        if (pb8Var != null) {
            pb8Var.e();
        }
    }
}
