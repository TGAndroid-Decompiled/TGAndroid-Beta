package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final p0 f43242a;
    public final s0 f43243b;

    public r0(s0 s0Var, p0 p0Var) {
        this.f43243b = s0Var;
        this.f43242a = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.f43242a;
        p0Var.setLayerType(0, null);
        this.f43243b.d.removeView(p0Var);
    }
}
