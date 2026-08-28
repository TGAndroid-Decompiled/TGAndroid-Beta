package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class sb1 extends AnimatorListenerAdapter {
    public final int f42657a;
    public final oc1 f42658b;

    public sb1(oc1 oc1Var, int i9) {
        this.f42657a = i9;
        this.f42658b = oc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42657a) {
            case 0:
                super.onAnimationEnd(animator);
                oc1 oc1Var = this.f42658b;
                oc1Var.f41105t0.invalidate();
                oc1Var.f41103s0[1].setVisibility(8);
                oc1Var.Y1 = null;
                return;
            case 1:
                this.f42658b.f41115x0 = null;
                return;
            case 2:
                oc1 oc1Var2 = this.f42658b;
                if (oc1Var2.f41120z0.getTag() == null) {
                    oc1Var2.f41120z0.setVisibility(4);
                }
                oc1Var2.D0 = null;
                return;
            case 3:
                oc1 oc1Var3 = this.f42658b;
                if (oc1Var3.A0.getTag() == null) {
                    oc1Var3.A0.setVisibility(4);
                }
                oc1Var3.E0 = null;
                return;
            case 4:
                oc1 oc1Var4 = this.f42658b;
                gc gcVar = oc1Var4.f41069d2;
                if (gcVar != null) {
                    if (gcVar.getParent() != null) {
                        ((ViewGroup) oc1Var4.f41069d2.getParent()).removeView(oc1Var4.f41069d2);
                    }
                    oc1Var4.f41069d2 = null;
                }
                oc1Var4.f41077f2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                oc1 oc1Var5 = this.f42658b;
                if (!oc1Var5.l1.a()) {
                    oc1Var5.N1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
