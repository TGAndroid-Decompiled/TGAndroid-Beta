package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zv0 extends AnimatorListenerAdapter {
    public final int f42721a;
    public final gw0 f42722b;

    public zv0(gw0 gw0Var, int i10) {
        this.f42721a = i10;
        this.f42722b = gw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42721a) {
            case 0:
                this.f42722b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f42722b.R.setTranslationY(0.0f);
                return;
            default:
                gw0 gw0Var = this.f42722b;
                gw0Var.getClass();
                gw0Var.R.setTranslationY(0.0f);
                gw0Var.l0();
                return;
        }
    }
}
