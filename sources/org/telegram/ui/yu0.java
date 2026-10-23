package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yu0 extends AnimatorListenerAdapter {
    public final int f43563a;
    public final fv0 f43564b;

    public yu0(fv0 fv0Var, int i10) {
        this.f43563a = i10;
        this.f43564b = fv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43563a) {
            case 0:
                this.f43564b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f43564b.R.setTranslationY(0.0f);
                return;
            default:
                fv0 fv0Var = this.f43564b;
                fv0Var.getClass();
                fv0Var.R.setTranslationY(0.0f);
                fv0Var.l0();
                return;
        }
    }
}
