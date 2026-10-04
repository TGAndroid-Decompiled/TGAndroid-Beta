package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xc1 extends AnimatorListenerAdapter {
    public final rd1 f42836a;

    public xc1(rd1 rd1Var) {
        this.f42836a = rd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rd1 rd1Var = this.f42836a;
        if (rd1Var.W0 == null) {
            rd1Var.J0[0].setVisibility(4);
        }
    }
}
