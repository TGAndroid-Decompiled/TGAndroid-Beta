package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class z20 extends AnimatorListenerAdapter {
    public final int f54500a;
    public final e40 f54501b;

    public z20(e40 e40Var, int i7) {
        this.f54500a = i7;
        this.f54501b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f54500a) {
            case 0:
                e40 e40Var = this.f54501b;
                e40Var.Q1.setVisibility(4);
                e40Var.R1.setVisibility(4);
                e40Var.P1.setVisibility(4);
                return;
            case 1:
                this.f54501b.f47329c2 = null;
                return;
            default:
                e40 e40Var2 = this.f54501b;
                e40Var2.f47330c3 = null;
                Paint paint = e40Var2.f47326b3;
                if (e40Var2.S3 == 3) {
                    i7 = -1163700;
                } else {
                    i7 = -12761513;
                }
                paint.setColor(i7);
                e40Var2.f47322a3.invalidate();
                return;
        }
    }
}
