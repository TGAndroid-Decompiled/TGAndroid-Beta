package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class tc1 extends AnimatorListenerAdapter {
    public final int f37755a;
    public final pd1 f37756b;

    public tc1(pd1 pd1Var, int i10) {
        this.f37755a = i10;
        this.f37756b = pd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37755a) {
            case 0:
                super.onAnimationEnd(animator);
                pd1 pd1Var = this.f37756b;
                pd1Var.f36452x0.invalidate();
                pd1Var.f36449w0[1].setVisibility(8);
                pd1Var.f36400c2 = null;
                return;
            case 1:
                this.f37756b.B0 = null;
                return;
            case 2:
                pd1 pd1Var2 = this.f37756b;
                if (pd1Var2.D0.getTag() == null) {
                    pd1Var2.D0.setVisibility(4);
                }
                pd1Var2.H0 = null;
                return;
            case 3:
                pd1 pd1Var3 = this.f37756b;
                if (pd1Var3.E0.getTag() == null) {
                    pd1Var3.E0.setVisibility(4);
                }
                pd1Var3.I0 = null;
                return;
            case 4:
                pd1 pd1Var4 = this.f37756b;
                mc mcVar = pd1Var4.f36416h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) pd1Var4.f36416h2.getParent()).removeView(pd1Var4.f36416h2);
                    }
                    pd1Var4.f36416h2 = null;
                }
                pd1Var4.f36422j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                pd1 pd1Var5 = this.f37756b;
                if (!pd1Var5.f36433p1.a()) {
                    pd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
