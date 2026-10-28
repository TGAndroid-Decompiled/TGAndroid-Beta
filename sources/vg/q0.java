package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final o0 f50282a;
    public final r0 f50283b;

    public q0(r0 r0Var, o0 o0Var) {
        this.f50283b = r0Var;
        this.f50282a = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o0 o0Var = this.f50282a;
        o0Var.setLayerType(0, null);
        this.f50283b.d.removeView(o0Var);
    }
}
