package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class z20 extends AnimatorListenerAdapter {
    public final int f52401a;
    public final e40 f52402b;

    public z20(e40 e40Var, int i7) {
        this.f52401a = i7;
        this.f52402b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f52401a) {
            case 0:
                e40 e40Var = this.f52402b;
                e40Var.M1.setVisibility(4);
                e40Var.N1.setVisibility(4);
                e40Var.L1.setVisibility(4);
                return;
            case 1:
                this.f52402b.Y1 = null;
                return;
            default:
                e40 e40Var2 = this.f52402b;
                e40Var2.Y2 = null;
                Paint paint = e40Var2.X2;
                if (e40Var2.K3 == 3) {
                    i7 = -1163700;
                } else {
                    i7 = -12761513;
                }
                paint.setColor(i7);
                e40Var2.W2.invalidate();
                return;
        }
    }
}
