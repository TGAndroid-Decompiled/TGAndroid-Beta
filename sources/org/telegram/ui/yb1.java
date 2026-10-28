package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class yb1 extends AnimatorListenerAdapter {
    public final int f45953a;
    public final vc1 f45954b;

    public yb1(vc1 vc1Var, int i10) {
        this.f45953a = i10;
        this.f45954b = vc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45953a) {
            case 0:
                super.onAnimationEnd(animator);
                vc1 vc1Var = this.f45954b;
                vc1Var.f44312y0.invalidate();
                vc1Var.f44309x0[1].setVisibility(8);
                vc1Var.f44259d2 = null;
                return;
            case 1:
                this.f45954b.C0 = null;
                return;
            case 2:
                vc1 vc1Var2 = this.f45954b;
                if (vc1Var2.E0.getTag() == null) {
                    vc1Var2.E0.setVisibility(4);
                }
                vc1Var2.I0 = null;
                return;
            case 3:
                vc1 vc1Var3 = this.f45954b;
                if (vc1Var3.F0.getTag() == null) {
                    vc1Var3.F0.setVisibility(4);
                }
                vc1Var3.J0 = null;
                return;
            case 4:
                vc1 vc1Var4 = this.f45954b;
                mc mcVar = vc1Var4.f44275i2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) vc1Var4.f44275i2.getParent()).removeView(vc1Var4.f44275i2);
                    }
                    vc1Var4.f44275i2 = null;
                }
                vc1Var4.f44281k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                vc1 vc1Var5 = this.f45954b;
                if (!vc1Var5.f44292q1.a()) {
                    vc1Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
