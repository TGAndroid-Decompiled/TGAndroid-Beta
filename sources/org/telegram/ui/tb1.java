package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class tb1 extends AnimatorListenerAdapter {
    public final int f42642a;
    public final qc1 f42643b;

    public tb1(qc1 qc1Var, int i10) {
        this.f42642a = i10;
        this.f42643b = qc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42642a) {
            case 0:
                super.onAnimationEnd(animator);
                qc1 qc1Var = this.f42643b;
                qc1Var.f41672t0.invalidate();
                qc1Var.f41670s0[1].setVisibility(8);
                qc1Var.Y1 = null;
                return;
            case 1:
                this.f42643b.f41682x0 = null;
                return;
            case 2:
                qc1 qc1Var2 = this.f42643b;
                if (qc1Var2.f41687z0.getTag() == null) {
                    qc1Var2.f41687z0.setVisibility(4);
                }
                qc1Var2.D0 = null;
                return;
            case 3:
                qc1 qc1Var3 = this.f42643b;
                if (qc1Var3.A0.getTag() == null) {
                    qc1Var3.A0.setVisibility(4);
                }
                qc1Var3.E0 = null;
                return;
            case 4:
                qc1 qc1Var4 = this.f42643b;
                fc fcVar = qc1Var4.f41636d2;
                if (fcVar != null) {
                    if (fcVar.getParent() != null) {
                        ((ViewGroup) qc1Var4.f41636d2.getParent()).removeView(qc1Var4.f41636d2);
                    }
                    qc1Var4.f41636d2 = null;
                }
                qc1Var4.f41644f2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                qc1 qc1Var5 = this.f42643b;
                if (!qc1Var5.l1.a()) {
                    qc1Var5.N1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
