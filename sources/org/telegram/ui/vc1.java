package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class vc1 extends AnimatorListenerAdapter {
    public final int f41699a;
    public final rd1 f41700b;

    public vc1(rd1 rd1Var, int i10) {
        this.f41699a = i10;
        this.f41700b = rd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41699a) {
            case 0:
                super.onAnimationEnd(animator);
                rd1 rd1Var = this.f41700b;
                rd1Var.f40095x0.invalidate();
                rd1Var.f40092w0[1].setVisibility(8);
                rd1Var.f40042c2 = null;
                return;
            case 1:
                this.f41700b.B0 = null;
                return;
            case 2:
                rd1 rd1Var2 = this.f41700b;
                if (rd1Var2.D0.getTag() == null) {
                    rd1Var2.D0.setVisibility(4);
                }
                rd1Var2.H0 = null;
                return;
            case 3:
                rd1 rd1Var3 = this.f41700b;
                if (rd1Var3.E0.getTag() == null) {
                    rd1Var3.E0.setVisibility(4);
                }
                rd1Var3.I0 = null;
                return;
            case 4:
                rd1 rd1Var4 = this.f41700b;
                mc mcVar = rd1Var4.f40059h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) rd1Var4.f40059h2.getParent()).removeView(rd1Var4.f40059h2);
                    }
                    rd1Var4.f40059h2 = null;
                }
                rd1Var4.f40065j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                rd1 rd1Var5 = this.f41700b;
                if (!rd1Var5.f40076p1.a()) {
                    rd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
