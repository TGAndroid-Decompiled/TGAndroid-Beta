package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class x20 extends AnimatorListenerAdapter {
    public final int f53072a;
    public final c40 f53073b;

    public x20(c40 c40Var, int i7) {
        this.f53072a = i7;
        this.f53073b = c40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f53072a) {
            case 0:
                c40 c40Var = this.f53073b;
                c40Var.Q1.setVisibility(4);
                c40Var.R1.setVisibility(4);
                c40Var.P1.setVisibility(4);
                return;
            case 1:
                this.f53073b.f45893c2 = null;
                return;
            default:
                c40 c40Var2 = this.f53073b;
                c40Var2.f45894c3 = null;
                Paint paint = c40Var2.f45890b3;
                if (c40Var2.S3 == 3) {
                    i7 = -1163700;
                } else {
                    i7 = -12761513;
                }
                paint.setColor(i7);
                c40Var2.f45886a3.invalidate();
                return;
        }
    }
}
