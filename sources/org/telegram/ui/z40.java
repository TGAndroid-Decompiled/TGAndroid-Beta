package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class z40 extends AnimatorListenerAdapter {
    public final int f40394a;
    public final e60 f40395b;

    public z40(e60 e60Var, int i10) {
        this.f40394a = i10;
        this.f40395b = e60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f40394a) {
            case 0:
                e60 e60Var = this.f40395b;
                e60Var.S.setVisibility(4);
                e60Var.T.setVisibility(4);
                e60Var.R.setVisibility(4);
                return;
            case 1:
                this.f40395b.f33633e0 = null;
                return;
            default:
                e60 e60Var2 = this.f40395b;
                e60Var2.f33634e1 = null;
                Paint paint = e60Var2.f33630d1;
                if (e60Var2.Q1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                e60Var2.f33627c1.invalidate();
                return;
        }
    }
}
