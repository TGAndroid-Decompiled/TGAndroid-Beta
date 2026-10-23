package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ub1 extends AnimatorListenerAdapter {
    public final int f42368a;
    public final qc1 f42369b;

    public ub1(qc1 qc1Var, int i10) {
        this.f42368a = i10;
        this.f42369b = qc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42368a) {
            case 0:
                super.onAnimationEnd(animator);
                qc1 qc1Var = this.f42369b;
                qc1Var.f40779y0.invalidate();
                qc1Var.f40776x0[1].setVisibility(8);
                qc1Var.f40726d2 = null;
                return;
            case 1:
                this.f42369b.C0 = null;
                return;
            case 2:
                qc1 qc1Var2 = this.f42369b;
                if (qc1Var2.E0.getTag() == null) {
                    qc1Var2.E0.setVisibility(4);
                }
                qc1Var2.I0 = null;
                return;
            case 3:
                qc1 qc1Var3 = this.f42369b;
                if (qc1Var3.F0.getTag() == null) {
                    qc1Var3.F0.setVisibility(4);
                }
                qc1Var3.J0 = null;
                return;
            case 4:
                qc1 qc1Var4 = this.f42369b;
                lc lcVar = qc1Var4.f40742i2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) qc1Var4.f40742i2.getParent()).removeView(qc1Var4.f40742i2);
                    }
                    qc1Var4.f40742i2 = null;
                }
                qc1Var4.f40748k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                qc1 qc1Var5 = this.f42369b;
                if (!qc1Var5.f40759q1.a()) {
                    qc1Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
