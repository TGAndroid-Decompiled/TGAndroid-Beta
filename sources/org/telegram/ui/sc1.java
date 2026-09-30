package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class sc1 extends AnimatorListenerAdapter {
    public final int f37804a;
    public final od1 f37805b;

    public sc1(od1 od1Var, int i10) {
        this.f37804a = i10;
        this.f37805b = od1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37804a) {
            case 0:
                super.onAnimationEnd(animator);
                od1 od1Var = this.f37805b;
                od1Var.f36351x0.invalidate();
                od1Var.f36348w0[1].setVisibility(8);
                od1Var.f36299c2 = null;
                return;
            case 1:
                this.f37805b.B0 = null;
                return;
            case 2:
                od1 od1Var2 = this.f37805b;
                if (od1Var2.D0.getTag() == null) {
                    od1Var2.D0.setVisibility(4);
                }
                od1Var2.H0 = null;
                return;
            case 3:
                od1 od1Var3 = this.f37805b;
                if (od1Var3.E0.getTag() == null) {
                    od1Var3.E0.setVisibility(4);
                }
                od1Var3.I0 = null;
                return;
            case 4:
                od1 od1Var4 = this.f37805b;
                kc kcVar = od1Var4.f36315h2;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) od1Var4.f36315h2.getParent()).removeView(od1Var4.f36315h2);
                    }
                    od1Var4.f36315h2 = null;
                }
                od1Var4.f36321j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                od1 od1Var5 = this.f37805b;
                if (!od1Var5.f36332p1.a()) {
                    od1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
