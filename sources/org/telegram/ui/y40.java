package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class y40 extends AnimatorListenerAdapter {
    public final int f43542a;
    public final d60 f43543b;

    public y40(d60 d60Var, int i10) {
        this.f43542a = i10;
        this.f43543b = d60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f43542a) {
            case 0:
                d60 d60Var = this.f43543b;
                d60Var.S.setVisibility(4);
                d60Var.T.setVisibility(4);
                d60Var.R.setVisibility(4);
                return;
            case 1:
                this.f43543b.f36028e0 = null;
                return;
            default:
                d60 d60Var2 = this.f43543b;
                d60Var2.f36029e1 = null;
                Paint paint = d60Var2.f36024d1;
                if (d60Var2.Q1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                d60Var2.f36021c1.invalidate();
                return;
        }
    }
}
