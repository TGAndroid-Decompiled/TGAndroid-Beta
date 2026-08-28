package xf;

import android.animation.ValueAnimator;
public final class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49252a;
    public final q0 f49253b;

    public k0(q0 q0Var, int i9) {
        this.f49252a = i9;
        this.f49253b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f49252a) {
            case 0:
                final q0 q0Var = this.f49253b;
                q0Var.f49314f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var = q0Var2.f49310a;
                                if (c0Var != null) {
                                    c0Var.i();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var2 = q0Var3.f49310a;
                                if (c0Var2 != null) {
                                    c0Var2.i();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final q0 q0Var2 = this.f49253b;
                q0Var2.f49314f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var = q0Var22.f49310a;
                                if (c0Var != null) {
                                    c0Var.i();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m5.c0 c0Var2 = q0Var3.f49310a;
                                if (c0Var2 != null) {
                                    c0Var2.i();
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
