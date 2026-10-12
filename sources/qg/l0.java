package qg;

import android.animation.ValueAnimator;
import ji.h5;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43481a;
    public final q0 f43482b;

    public l0(q0 q0Var, int i10) {
        this.f43481a = i10;
        this.f43482b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f43481a) {
            case 0:
                final q0 q0Var = this.f43482b;
                q0Var.f43524f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                h5 h5Var = q0Var2.f43521a;
                                if (h5Var != null) {
                                    h5Var.Q0();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                h5 h5Var2 = q0Var3.f43521a;
                                if (h5Var2 != null) {
                                    h5Var2.Q0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final q0 q0Var2 = this.f43482b;
                q0Var2.f43524f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                h5 h5Var = q0Var22.f43521a;
                                if (h5Var != null) {
                                    h5Var.Q0();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                h5 h5Var2 = q0Var3.f43521a;
                                if (h5Var2 != null) {
                                    h5Var2.Q0();
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
