package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class v30 extends AnimatorListenerAdapter {
    public final int f42400a;
    public final a50 f42401b;

    public v30(a50 a50Var, int i10) {
        this.f42400a = i10;
        this.f42401b = a50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f42400a) {
            case 0:
                a50 a50Var = this.f42401b;
                a50Var.M1.setVisibility(4);
                a50Var.N1.setVisibility(4);
                a50Var.L1.setVisibility(4);
                return;
            case 1:
                this.f42401b.Y1 = null;
                return;
            default:
                a50 a50Var2 = this.f42401b;
                a50Var2.Y2 = null;
                Paint paint = a50Var2.X2;
                if (a50Var2.K3 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                a50Var2.W2.invalidate();
                return;
        }
    }
}
