package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vv0 extends AnimatorListenerAdapter {
    public final int f42861a;
    public final cw0 f42862b;

    public vv0(cw0 cw0Var, int i10) {
        this.f42861a = i10;
        this.f42862b = cw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42861a) {
            case 0:
                this.f42862b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f42862b.R.setTranslationY(0.0f);
                return;
            default:
                cw0 cw0Var = this.f42862b;
                cw0Var.getClass();
                cw0Var.R.setTranslationY(0.0f);
                cw0Var.l0();
                return;
        }
    }
}
