package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class r81 extends AnimatorListenerAdapter {
    public final int f41174a;
    public final m91 f41175b;

    public r81(m91 m91Var, int i10) {
        this.f41174a = i10;
        this.f41175b = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41174a) {
            case 0:
                super.onAnimationEnd(animator);
                m91 m91Var = this.f41175b;
                m91Var.f39603y0.invalidate();
                m91Var.f39600x0[1].setVisibility(8);
                m91Var.f39550d2 = null;
                return;
            case 1:
                this.f41175b.C0 = null;
                return;
            case 2:
                m91 m91Var2 = this.f41175b;
                if (m91Var2.E0.getTag() == null) {
                    m91Var2.E0.setVisibility(4);
                }
                m91Var2.I0 = null;
                return;
            case 3:
                m91 m91Var3 = this.f41175b;
                if (m91Var3.F0.getTag() == null) {
                    m91Var3.F0.setVisibility(4);
                }
                m91Var3.J0 = null;
                return;
            case 4:
                m91 m91Var4 = this.f41175b;
                ic icVar = m91Var4.f39566i2;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) m91Var4.f39566i2.getParent()).removeView(m91Var4.f39566i2);
                    }
                    m91Var4.f39566i2 = null;
                }
                m91Var4.f39572k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                m91 m91Var5 = this.f41175b;
                if (!m91Var5.f39583q1.a()) {
                    m91Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
