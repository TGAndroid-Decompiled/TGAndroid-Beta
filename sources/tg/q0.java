package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final o0 f43584a;
    public final r0 f43585b;

    public q0(r0 r0Var, o0 o0Var) {
        this.f43585b = r0Var;
        this.f43584a = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o0 o0Var = this.f43584a;
        o0Var.setLayerType(0, null);
        this.f43585b.d.removeView(o0Var);
    }
}
