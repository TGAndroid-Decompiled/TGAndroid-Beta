package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class zc1 extends AnimatorListenerAdapter {
    public final int f40084a;
    public final vd1 f40085b;

    public zc1(vd1 vd1Var, int i10) {
        this.f40084a = i10;
        this.f40085b = vd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40084a) {
            case 0:
                super.onAnimationEnd(animator);
                vd1 vd1Var = this.f40085b;
                vd1Var.f38529x0.invalidate();
                vd1Var.f38526w0[1].setVisibility(8);
                vd1Var.f38477c2 = null;
                return;
            case 1:
                this.f40085b.B0 = null;
                return;
            case 2:
                vd1 vd1Var2 = this.f40085b;
                if (vd1Var2.D0.getTag() == null) {
                    vd1Var2.D0.setVisibility(4);
                }
                vd1Var2.H0 = null;
                return;
            case 3:
                vd1 vd1Var3 = this.f40085b;
                if (vd1Var3.E0.getTag() == null) {
                    vd1Var3.E0.setVisibility(4);
                }
                vd1Var3.I0 = null;
                return;
            case 4:
                vd1 vd1Var4 = this.f40085b;
                mc mcVar = vd1Var4.f38493h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) vd1Var4.f38493h2.getParent()).removeView(vd1Var4.f38493h2);
                    }
                    vd1Var4.f38493h2 = null;
                }
                vd1Var4.f38499j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                vd1 vd1Var5 = this.f40085b;
                if (!vd1Var5.f38510p1.a()) {
                    vd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
