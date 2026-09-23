package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tc1 extends AnimatorListenerAdapter {
    public final od1 f37606a;

    public tc1(od1 od1Var) {
        this.f37606a = od1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        od1 od1Var = this.f37606a;
        org.telegram.ui.Components.i81[] i81VarArr = od1Var.J0;
        if (od1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        i81VarArr[c10].setVisibility(4);
    }
}
