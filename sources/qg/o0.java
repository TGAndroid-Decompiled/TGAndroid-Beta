package qg;

import android.animation.ValueAnimator;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44592a;
    public final t0 f44593b;

    public o0(t0 t0Var, int i10) {
        this.f44592a = i10;
        this.f44593b = t0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f44592a) {
            case 0:
                final t0 t0Var = this.f44593b;
                t0Var.f44641f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = t0Var;
                                t0Var2.getClass();
                                t0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var = t0Var2.f44638a;
                                if (t1Var != null) {
                                    t1Var.s();
                                    return;
                                }
                                return;
                            default:
                                t0 t0Var3 = t0Var;
                                t0Var3.getClass();
                                t0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var2 = t0Var3.f44638a;
                                if (t1Var2 != null) {
                                    t1Var2.s();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final t0 t0Var2 = this.f44593b;
                t0Var2.f44641f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var22 = t0Var2;
                                t0Var22.getClass();
                                t0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var = t0Var22.f44638a;
                                if (t1Var != null) {
                                    t1Var.s();
                                    return;
                                }
                                return;
                            default:
                                t0 t0Var3 = t0Var2;
                                t0Var3.getClass();
                                t0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ki.t1 t1Var2 = t0Var3.f44638a;
                                if (t1Var2 != null) {
                                    t1Var2.s();
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
