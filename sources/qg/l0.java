package qg;

import android.animation.ValueAnimator;
import ji.u4;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44476a;
    public final q0 f44477b;

    public l0(q0 q0Var, int i10) {
        this.f44476a = i10;
        this.f44477b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f44476a) {
            case 0:
                final q0 q0Var = this.f44477b;
                q0Var.f44522f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                u4 u4Var = q0Var2.f44518a;
                                if (u4Var != null) {
                                    u4Var.n();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                u4 u4Var2 = q0Var3.f44518a;
                                if (u4Var2 != null) {
                                    u4Var2.n();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final q0 q0Var2 = this.f44477b;
                q0Var2.f44522f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                u4 u4Var = q0Var22.f44518a;
                                if (u4Var != null) {
                                    u4Var.n();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                u4 u4Var2 = q0Var3.f44518a;
                                if (u4Var2 != null) {
                                    u4Var2.n();
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
