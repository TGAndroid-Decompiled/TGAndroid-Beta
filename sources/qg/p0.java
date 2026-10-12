package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.m2;
public final class p0 extends AnimatorListenerAdapter {
    public final int f43505a;
    public final q0 f43506b;

    public p0(q0 q0Var, int i10) {
        this.f43505a = i10;
        this.f43506b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43505a) {
            case 0:
                q0 q0Var = this.f43506b;
                q0Var.K = null;
                q0Var.f43524f.f(new m2(this, 15));
                return;
            default:
                this.f43506b.f43524f.f(new m2(this, 16));
                return;
        }
    }
}
