package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yq0 extends AnimatorListenerAdapter {
    public final int f52382a;
    public final fr0 f52383b;

    public yq0(fr0 fr0Var, int i3) {
        this.f52382a = i3;
        this.f52383b = fr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52382a) {
            case 0:
                this.f52383b.S.setTranslationY(0.0f);
                return;
            case 1:
                this.f52383b.S.setTranslationY(0.0f);
                return;
            default:
                fr0 fr0Var = this.f52383b;
                fr0Var.getClass();
                fr0Var.S.setTranslationY(0.0f);
                fr0Var.q0();
                return;
        }
    }
}
