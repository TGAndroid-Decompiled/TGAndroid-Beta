package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class z61 extends AnimatorListenerAdapter {
    public final int f52493a;
    public final u71 f52494b;

    public z61(u71 u71Var, int i7) {
        this.f52493a = i7;
        this.f52494b = u71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52493a) {
            case 0:
                super.onAnimationEnd(animator);
                u71 u71Var = this.f52494b;
                u71Var.f50331y0.invalidate();
                u71Var.f50328x0[1].setVisibility(8);
                u71Var.d2 = null;
                return;
            case 1:
                this.f52494b.C0 = null;
                return;
            case 2:
                u71 u71Var2 = this.f52494b;
                if (u71Var2.E0.getTag() == null) {
                    u71Var2.E0.setVisibility(4);
                }
                u71Var2.I0 = null;
                return;
            case 3:
                u71 u71Var3 = this.f52494b;
                if (u71Var3.F0.getTag() == null) {
                    u71Var3.F0.setVisibility(4);
                }
                u71Var3.J0 = null;
                return;
            case 4:
                u71 u71Var4 = this.f52494b;
                cc ccVar = u71Var4.f50295i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) u71Var4.f50295i2.getParent()).removeView(u71Var4.f50295i2);
                    }
                    u71Var4.f50295i2 = null;
                }
                u71Var4.f50301k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                u71 u71Var5 = this.f52494b;
                if (!u71Var5.f50311q1.a()) {
                    u71Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
