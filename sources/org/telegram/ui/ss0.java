package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ss0 extends AnimatorListenerAdapter {
    public final int f41455a;
    public final zs0 f41456b;

    public ss0(zs0 zs0Var, int i10) {
        this.f41455a = i10;
        this.f41456b = zs0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41455a) {
            case 0:
                this.f41456b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f41456b.R.setTranslationY(0.0f);
                return;
            default:
                zs0 zs0Var = this.f41456b;
                zs0Var.getClass();
                zs0Var.R.setTranslationY(0.0f);
                zs0Var.q0();
                return;
        }
    }
}
