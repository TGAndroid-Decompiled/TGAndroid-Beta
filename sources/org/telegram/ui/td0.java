package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class td0 extends AnimatorListenerAdapter {
    public final int f42193a;
    public final vg0 f42194b;

    public td0(vg0 vg0Var, int i10) {
        this.f42193a = i10;
        this.f42194b = vg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42193a) {
            case 0:
                vg0 vg0Var = this.f42194b;
                if (vg0Var.d == animator) {
                    vg0Var.d = null;
                    return;
                }
                return;
            default:
                vg0 vg0Var2 = this.f42194b;
                vg0Var2.f43049c.setVisibility(8);
                if (vg0Var2.d == animator) {
                    vg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42193a) {
            case 0:
                this.f42194b.f43049c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
