package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class tc1 extends AnimatorListenerAdapter {
    public final int f40849a;
    public final pd1 f40850b;

    public tc1(pd1 pd1Var, int i10) {
        this.f40849a = i10;
        this.f40850b = pd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40849a) {
            case 0:
                super.onAnimationEnd(animator);
                pd1 pd1Var = this.f40850b;
                pd1Var.f39550x0.invalidate();
                pd1Var.f39547w0[1].setVisibility(8);
                pd1Var.f39497c2 = null;
                return;
            case 1:
                this.f40850b.B0 = null;
                return;
            case 2:
                pd1 pd1Var2 = this.f40850b;
                if (pd1Var2.D0.getTag() == null) {
                    pd1Var2.D0.setVisibility(4);
                }
                pd1Var2.H0 = null;
                return;
            case 3:
                pd1 pd1Var3 = this.f40850b;
                if (pd1Var3.E0.getTag() == null) {
                    pd1Var3.E0.setVisibility(4);
                }
                pd1Var3.I0 = null;
                return;
            case 4:
                pd1 pd1Var4 = this.f40850b;
                mc mcVar = pd1Var4.f39514h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) pd1Var4.f39514h2.getParent()).removeView(pd1Var4.f39514h2);
                    }
                    pd1Var4.f39514h2 = null;
                }
                pd1Var4.f39520j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                pd1 pd1Var5 = this.f40850b;
                if (!pd1Var5.f39531p1.a()) {
                    pd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
