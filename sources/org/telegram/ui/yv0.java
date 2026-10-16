package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yv0 extends AnimatorListenerAdapter {
    public final int f41966a;
    public final fw0 f41967b;

    public yv0(fw0 fw0Var, int i10) {
        this.f41966a = i10;
        this.f41967b = fw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41966a) {
            case 0:
                this.f41967b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f41967b.R.setTranslationY(0.0f);
                return;
            default:
                fw0 fw0Var = this.f41967b;
                fw0Var.getClass();
                fw0Var.R.setTranslationY(0.0f);
                fw0Var.l0();
                return;
        }
    }
}
