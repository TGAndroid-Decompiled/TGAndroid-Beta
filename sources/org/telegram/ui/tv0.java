package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tv0 extends AnimatorListenerAdapter {
    public final int f42130a;
    public final aw0 f42131b;

    public tv0(aw0 aw0Var, int i10) {
        this.f42130a = i10;
        this.f42131b = aw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42130a) {
            case 0:
                this.f42131b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f42131b.R.setTranslationY(0.0f);
                return;
            default:
                aw0 aw0Var = this.f42131b;
                aw0Var.getClass();
                aw0Var.R.setTranslationY(0.0f);
                aw0Var.l0();
                return;
        }
    }
}
