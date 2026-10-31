package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ts0 extends AnimatorListenerAdapter {
    public final int f41935a;
    public final at0 f41936b;

    public ts0(at0 at0Var, int i10) {
        this.f41935a = i10;
        this.f41936b = at0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41935a) {
            case 0:
                this.f41936b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f41936b.R.setTranslationY(0.0f);
                return;
            default:
                at0 at0Var = this.f41936b;
                at0Var.getClass();
                at0Var.R.setTranslationY(0.0f);
                at0Var.p0();
                return;
        }
    }
}
