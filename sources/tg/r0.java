package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final p0 f43210a;
    public final s0 f43211b;

    public r0(s0 s0Var, p0 p0Var) {
        this.f43211b = s0Var;
        this.f43210a = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.f43210a;
        p0Var.setLayerType(0, null);
        this.f43211b.d.removeView(p0Var);
    }
}
