package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class sc1 extends AnimatorListenerAdapter {
    public final int f37240a;
    public final od1 f37241b;

    public sc1(od1 od1Var, int i10) {
        this.f37240a = i10;
        this.f37241b = od1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37240a) {
            case 0:
                super.onAnimationEnd(animator);
                od1 od1Var = this.f37241b;
                od1Var.f35842x0.invalidate();
                od1Var.f35839w0[1].setVisibility(8);
                od1Var.f35790c2 = null;
                return;
            case 1:
                this.f37241b.B0 = null;
                return;
            case 2:
                od1 od1Var2 = this.f37241b;
                if (od1Var2.D0.getTag() == null) {
                    od1Var2.D0.setVisibility(4);
                }
                od1Var2.H0 = null;
                return;
            case 3:
                od1 od1Var3 = this.f37241b;
                if (od1Var3.E0.getTag() == null) {
                    od1Var3.E0.setVisibility(4);
                }
                od1Var3.I0 = null;
                return;
            case 4:
                od1 od1Var4 = this.f37241b;
                kc kcVar = od1Var4.f35806h2;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) od1Var4.f35806h2.getParent()).removeView(od1Var4.f35806h2);
                    }
                    od1Var4.f35806h2 = null;
                }
                od1Var4.f35812j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                od1 od1Var5 = this.f37241b;
                if (!od1Var5.f35823p1.a()) {
                    od1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
