package qg;

import android.animation.ValueAnimator;
import ji.w4;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43223a;
    public final q0 f43224b;

    public l0(q0 q0Var, int i10) {
        this.f43223a = i10;
        this.f43224b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f43223a) {
            case 0:
                final q0 q0Var = this.f43224b;
                q0Var.f43266f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var = q0Var2.f43263a;
                                if (w4Var != null) {
                                    w4Var.Y0();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var2 = q0Var3.f43263a;
                                if (w4Var2 != null) {
                                    w4Var2.Y0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final q0 q0Var2 = this.f43224b;
                q0Var2.f43266f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var = q0Var22.f43263a;
                                if (w4Var != null) {
                                    w4Var.Y0();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                w4 w4Var2 = q0Var3.f43263a;
                                if (w4Var2 != null) {
                                    w4Var2.Y0();
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
