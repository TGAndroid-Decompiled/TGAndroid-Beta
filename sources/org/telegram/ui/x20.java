package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class x20 extends AnimatorListenerAdapter {
    public final int f51719a;
    public final c40 f51720b;

    public x20(c40 c40Var, int i7) {
        this.f51719a = i7;
        this.f51720b = c40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f51719a) {
            case 0:
                c40 c40Var = this.f51720b;
                c40Var.M1.setVisibility(4);
                c40Var.N1.setVisibility(4);
                c40Var.L1.setVisibility(4);
                return;
            case 1:
                this.f51720b.Y1 = null;
                return;
            default:
                c40 c40Var2 = this.f51720b;
                c40Var2.Y2 = null;
                Paint paint = c40Var2.X2;
                if (c40Var2.K3 == 3) {
                    i7 = -1163700;
                } else {
                    i7 = -12761513;
                }
                paint.setColor(i7);
                c40Var2.W2.invalidate();
                return;
        }
    }
}
