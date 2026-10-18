package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rb1 extends AnimatorListenerAdapter {
    public final mc1 f40686a;

    public rb1(mc1 mc1Var) {
        this.f40686a = mc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        mc1 mc1Var = this.f40686a;
        org.telegram.ui.Components.d91[] d91VarArr = mc1Var.J0;
        if (mc1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        d91VarArr[c10].setVisibility(4);
    }
}
