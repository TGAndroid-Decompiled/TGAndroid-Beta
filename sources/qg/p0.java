package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.r2;
public final class p0 extends AnimatorListenerAdapter {
    public final int f43247a;
    public final q0 f43248b;

    public p0(q0 q0Var, int i10) {
        this.f43247a = i10;
        this.f43248b = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43247a) {
            case 0:
                q0 q0Var = this.f43248b;
                q0Var.K = null;
                q0Var.f43266f.f(new r2(this, 15));
                return;
            default:
                this.f43248b.f43266f.f(new r2(this, 16));
                return;
        }
    }
}
