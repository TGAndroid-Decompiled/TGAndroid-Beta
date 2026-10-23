package qg;

import android.animation.ValueAnimator;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45000a;
    public final s0 f45001b;

    public n0(s0 s0Var, int i10) {
        this.f45000a = i10;
        this.f45001b = s0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f45000a) {
            case 0:
                final s0 s0Var = this.f45001b;
                s0Var.f45047f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var = s0Var2.f45044a;
                                if (t1Var != null) {
                                    t1Var.J();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var2 = s0Var3.f45044a;
                                if (t1Var2 != null) {
                                    t1Var2.J();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f45001b;
                s0Var2.f45047f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var = s0Var22.f45044a;
                                if (t1Var != null) {
                                    t1Var.J();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var2 = s0Var3.f45044a;
                                if (t1Var2 != null) {
                                    t1Var2.J();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
