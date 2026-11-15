package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class x61 extends AnimatorListenerAdapter {
    public final int f53114a;
    public final t71 f53115b;

    public x61(t71 t71Var, int i7) {
        this.f53114a = i7;
        this.f53115b = t71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53114a) {
            case 0:
                super.onAnimationEnd(animator);
                t71 t71Var = this.f53115b;
                t71Var.f51477z0.invalidate();
                t71Var.f51475y0[1].setVisibility(8);
                t71Var.f51425e2 = null;
                return;
            case 1:
                this.f53115b.D0 = null;
                return;
            case 2:
                t71 t71Var2 = this.f53115b;
                if (t71Var2.F0.getTag() == null) {
                    t71Var2.F0.setVisibility(4);
                }
                t71Var2.J0 = null;
                return;
            case 3:
                t71 t71Var3 = this.f53115b;
                if (t71Var3.G0.getTag() == null) {
                    t71Var3.G0.setVisibility(4);
                }
                t71Var3.K0 = null;
                return;
            case 4:
                t71 t71Var4 = this.f53115b;
                bc bcVar = t71Var4.f51441j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) t71Var4.f51441j2.getParent()).removeView(t71Var4.f51441j2);
                    }
                    t71Var4.f51441j2 = null;
                }
                t71Var4.f51446l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                t71 t71Var5 = this.f53115b;
                if (!t71Var5.f51458r1.a()) {
                    t71Var5.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
