package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wc1 extends AnimatorListenerAdapter {
    public final rd1 f42063a;

    public wc1(rd1 rd1Var) {
        this.f42063a = rd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        rd1 rd1Var = this.f42063a;
        org.telegram.ui.Components.h91[] h91VarArr = rd1Var.J0;
        if (rd1Var.W0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        h91VarArr[c10].setVisibility(4);
    }
}
