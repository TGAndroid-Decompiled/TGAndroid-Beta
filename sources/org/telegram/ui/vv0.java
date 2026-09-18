package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vv0 extends AnimatorListenerAdapter {
    public final int f38513a;
    public final cw0 f38514b;

    public vv0(cw0 cw0Var, int i10) {
        this.f38513a = i10;
        this.f38514b = cw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38513a) {
            case 0:
                this.f38514b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f38514b.R.setTranslationY(0.0f);
                return;
            default:
                cw0 cw0Var = this.f38514b;
                cw0Var.getClass();
                cw0Var.R.setTranslationY(0.0f);
                cw0Var.l0();
                return;
        }
    }
}
