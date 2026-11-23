package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class z61 extends AnimatorListenerAdapter {
    public final int f54540a;
    public final v71 f54541b;

    public z61(v71 v71Var, int i7) {
        this.f54540a = i7;
        this.f54541b = v71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54540a) {
            case 0:
                super.onAnimationEnd(animator);
                v71 v71Var = this.f54541b;
                v71Var.f52914z0.invalidate();
                v71Var.f52912y0[1].setVisibility(8);
                v71Var.f52862e2 = null;
                return;
            case 1:
                this.f54541b.D0 = null;
                return;
            case 2:
                v71 v71Var2 = this.f54541b;
                if (v71Var2.F0.getTag() == null) {
                    v71Var2.F0.setVisibility(4);
                }
                v71Var2.J0 = null;
                return;
            case 3:
                v71 v71Var3 = this.f54541b;
                if (v71Var3.G0.getTag() == null) {
                    v71Var3.G0.setVisibility(4);
                }
                v71Var3.K0 = null;
                return;
            case 4:
                v71 v71Var4 = this.f54541b;
                bc bcVar = v71Var4.f52878j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) v71Var4.f52878j2.getParent()).removeView(v71Var4.f52878j2);
                    }
                    v71Var4.f52878j2 = null;
                }
                v71Var4.f52883l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                v71 v71Var5 = this.f54541b;
                if (!v71Var5.f52895r1.b()) {
                    v71Var5.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
