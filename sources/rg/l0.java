package rg;

import android.animation.ValueAnimator;
import li.e3;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47461a;
    public final q0 f47462b;

    public l0(q0 q0Var, int i10) {
        this.f47461a = i10;
        this.f47462b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f47461a) {
            case 0:
                final q0 q0Var = this.f47462b;
                q0Var.f47506f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                e3 e3Var = q0Var2.f47503a;
                                if (e3Var != null) {
                                    e3Var.v0();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                e3 e3Var2 = q0Var3.f47503a;
                                if (e3Var2 != null) {
                                    e3Var2.v0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final q0 q0Var2 = this.f47462b;
                q0Var2.f47506f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                e3 e3Var = q0Var22.f47503a;
                                if (e3Var != null) {
                                    e3Var.v0();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                e3 e3Var2 = q0Var3.f47503a;
                                if (e3Var2 != null) {
                                    e3Var2.v0();
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
