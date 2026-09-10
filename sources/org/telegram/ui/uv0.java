package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uv0 extends AnimatorListenerAdapter {
    public final int f37349a;
    public final bw0 f37350b;

    public uv0(bw0 bw0Var, int i10) {
        this.f37349a = i10;
        this.f37350b = bw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37349a) {
            case 0:
                this.f37350b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f37350b.R.setTranslationY(0.0f);
                return;
            default:
                bw0 bw0Var = this.f37350b;
                bw0Var.getClass();
                bw0Var.R.setTranslationY(0.0f);
                bw0Var.l0();
                return;
        }
    }
}
