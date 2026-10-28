package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zb1 extends AnimatorListenerAdapter {
    public final vc1 f46217a;

    public zb1(vc1 vc1Var) {
        this.f46217a = vc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        vc1 vc1Var = this.f46217a;
        org.telegram.ui.Components.w91[] w91VarArr = vc1Var.K0;
        if (vc1Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        w91VarArr[c10].setVisibility(4);
    }
}
