package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tv0 extends AnimatorListenerAdapter {
    public final int f37886a;
    public final aw0 f37887b;

    public tv0(aw0 aw0Var, int i10) {
        this.f37886a = i10;
        this.f37887b = aw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37886a) {
            case 0:
                this.f37887b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f37887b.R.setTranslationY(0.0f);
                return;
            default:
                aw0 aw0Var = this.f37887b;
                aw0Var.getClass();
                aw0Var.R.setTranslationY(0.0f);
                aw0Var.l0();
                return;
        }
    }
}
