package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class w30 extends AnimatorListenerAdapter {
    public final int f42866a;
    public final b50 f42867b;

    public w30(b50 b50Var, int i10) {
        this.f42866a = i10;
        this.f42867b = b50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f42866a) {
            case 0:
                b50 b50Var = this.f42867b;
                b50Var.M1.setVisibility(4);
                b50Var.N1.setVisibility(4);
                b50Var.L1.setVisibility(4);
                return;
            case 1:
                this.f42867b.Y1 = null;
                return;
            default:
                b50 b50Var2 = this.f42867b;
                b50Var2.Y2 = null;
                Paint paint = b50Var2.X2;
                if (b50Var2.K3 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                b50Var2.W2.invalidate();
                return;
        }
    }
}
