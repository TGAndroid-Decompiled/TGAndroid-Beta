package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class wb1 extends AnimatorListenerAdapter {
    public final int f45095a;
    public final tc1 f45096b;

    public wb1(tc1 tc1Var, int i10) {
        this.f45095a = i10;
        this.f45096b = tc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45095a) {
            case 0:
                super.onAnimationEnd(animator);
                tc1 tc1Var = this.f45096b;
                tc1Var.f43799y0.invalidate();
                tc1Var.f43796x0[1].setVisibility(8);
                tc1Var.f43746d2 = null;
                return;
            case 1:
                this.f45096b.C0 = null;
                return;
            case 2:
                tc1 tc1Var2 = this.f45096b;
                if (tc1Var2.E0.getTag() == null) {
                    tc1Var2.E0.setVisibility(4);
                }
                tc1Var2.I0 = null;
                return;
            case 3:
                tc1 tc1Var3 = this.f45096b;
                if (tc1Var3.F0.getTag() == null) {
                    tc1Var3.F0.setVisibility(4);
                }
                tc1Var3.J0 = null;
                return;
            case 4:
                tc1 tc1Var4 = this.f45096b;
                mc mcVar = tc1Var4.f43762i2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) tc1Var4.f43762i2.getParent()).removeView(tc1Var4.f43762i2);
                    }
                    tc1Var4.f43762i2 = null;
                }
                tc1Var4.f43768k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                tc1 tc1Var5 = this.f45096b;
                if (!tc1Var5.f43779q1.a()) {
                    tc1Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
