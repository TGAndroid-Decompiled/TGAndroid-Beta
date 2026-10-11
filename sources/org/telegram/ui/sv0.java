package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sv0 extends AnimatorListenerAdapter {
    public final int f41899a;
    public final zv0 f41900b;

    public sv0(zv0 zv0Var, int i10) {
        this.f41899a = i10;
        this.f41900b = zv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41899a) {
            case 0:
                this.f41900b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f41900b.R.setTranslationY(0.0f);
                return;
            default:
                zv0 zv0Var = this.f41900b;
                zv0Var.getClass();
                zv0Var.R.setTranslationY(0.0f);
                zv0Var.l0();
                return;
        }
    }
}
