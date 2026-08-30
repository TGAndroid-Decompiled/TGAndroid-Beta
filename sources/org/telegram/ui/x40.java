package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class x40 extends AnimatorListenerAdapter {
    public final int f39853a;
    public final c60 f39854b;

    public x40(c60 c60Var, int i10) {
        this.f39853a = i10;
        this.f39854b = c60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f39853a) {
            case 0:
                c60 c60Var = this.f39854b;
                c60Var.S.setVisibility(4);
                c60Var.T.setVisibility(4);
                c60Var.R.setVisibility(4);
                return;
            case 1:
                this.f39854b.f33114e0 = null;
                return;
            default:
                c60 c60Var2 = this.f39854b;
                c60Var2.f33115e1 = null;
                Paint paint = c60Var2.f33111d1;
                if (c60Var2.Q1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                c60Var2.f33108c1.invalidate();
                return;
        }
    }
}
