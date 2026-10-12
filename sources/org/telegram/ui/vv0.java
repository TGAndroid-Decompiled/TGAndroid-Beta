package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vv0 extends AnimatorListenerAdapter {
    public final int f42863a;
    public final cw0 f42864b;

    public vv0(cw0 cw0Var, int i10) {
        this.f42863a = i10;
        this.f42864b = cw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42863a) {
            case 0:
                this.f42864b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f42864b.R.setTranslationY(0.0f);
                return;
            default:
                cw0 cw0Var = this.f42864b;
                cw0Var.getClass();
                cw0Var.R.setTranslationY(0.0f);
                cw0Var.l0();
                return;
        }
    }
}
