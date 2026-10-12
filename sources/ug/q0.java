package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final o0 f46380a;
    public final r0 f46381b;

    public q0(r0 r0Var, o0 o0Var) {
        this.f46381b = r0Var;
        this.f46380a = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o0 o0Var = this.f46380a;
        o0Var.setLayerType(0, null);
        this.f46381b.d.removeView(o0Var);
    }
}
