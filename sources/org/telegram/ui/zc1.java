package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class zc1 extends AnimatorListenerAdapter {
    public final int f40137a;
    public final vd1 f40138b;

    public zc1(vd1 vd1Var, int i10) {
        this.f40137a = i10;
        this.f40138b = vd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40137a) {
            case 0:
                super.onAnimationEnd(animator);
                vd1 vd1Var = this.f40138b;
                vd1Var.f38575x0.invalidate();
                vd1Var.f38572w0[1].setVisibility(8);
                vd1Var.f38523c2 = null;
                return;
            case 1:
                this.f40138b.B0 = null;
                return;
            case 2:
                vd1 vd1Var2 = this.f40138b;
                if (vd1Var2.D0.getTag() == null) {
                    vd1Var2.D0.setVisibility(4);
                }
                vd1Var2.H0 = null;
                return;
            case 3:
                vd1 vd1Var3 = this.f40138b;
                if (vd1Var3.E0.getTag() == null) {
                    vd1Var3.E0.setVisibility(4);
                }
                vd1Var3.I0 = null;
                return;
            case 4:
                vd1 vd1Var4 = this.f40138b;
                lc lcVar = vd1Var4.f38539h2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) vd1Var4.f38539h2.getParent()).removeView(vd1Var4.f38539h2);
                    }
                    vd1Var4.f38539h2 = null;
                }
                vd1Var4.f38545j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                vd1 vd1Var5 = this.f40138b;
                if (!vd1Var5.f38556p1.a()) {
                    vd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
