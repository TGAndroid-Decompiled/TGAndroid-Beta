package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class tb1 extends AnimatorListenerAdapter {
    public final int f41987a;
    public final pc1 f41988b;

    public tb1(pc1 pc1Var, int i10) {
        this.f41987a = i10;
        this.f41988b = pc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41987a) {
            case 0:
                super.onAnimationEnd(animator);
                pc1 pc1Var = this.f41988b;
                pc1Var.f40508y0.invalidate();
                pc1Var.f40505x0[1].setVisibility(8);
                pc1Var.f40455d2 = null;
                return;
            case 1:
                this.f41988b.C0 = null;
                return;
            case 2:
                pc1 pc1Var2 = this.f41988b;
                if (pc1Var2.E0.getTag() == null) {
                    pc1Var2.E0.setVisibility(4);
                }
                pc1Var2.I0 = null;
                return;
            case 3:
                pc1 pc1Var3 = this.f41988b;
                if (pc1Var3.F0.getTag() == null) {
                    pc1Var3.F0.setVisibility(4);
                }
                pc1Var3.J0 = null;
                return;
            case 4:
                pc1 pc1Var4 = this.f41988b;
                lc lcVar = pc1Var4.f40471i2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) pc1Var4.f40471i2.getParent()).removeView(pc1Var4.f40471i2);
                    }
                    pc1Var4.f40471i2 = null;
                }
                pc1Var4.f40477k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                pc1 pc1Var5 = this.f41988b;
                if (!pc1Var5.f40488q1.a()) {
                    pc1Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
