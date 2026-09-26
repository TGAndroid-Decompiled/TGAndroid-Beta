package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final o0 f43475a;
    public final r0 f43476b;

    public q0(r0 r0Var, o0 o0Var) {
        this.f43476b = r0Var;
        this.f43475a = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o0 o0Var = this.f43475a;
        o0Var.setLayerType(0, null);
        this.f43476b.d.removeView(o0Var);
    }
}
