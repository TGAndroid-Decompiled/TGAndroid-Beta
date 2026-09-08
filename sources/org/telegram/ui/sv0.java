package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sv0 extends AnimatorListenerAdapter {
    public final int f40585a;
    public final zv0 f40586b;

    public sv0(zv0 zv0Var, int i10) {
        this.f40585a = i10;
        this.f40586b = zv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40585a) {
            case 0:
                this.f40586b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f40586b.R.setTranslationY(0.0f);
                return;
            default:
                zv0 zv0Var = this.f40586b;
                zv0Var.getClass();
                zv0Var.R.setTranslationY(0.0f);
                zv0Var.l0();
                return;
        }
    }
}
