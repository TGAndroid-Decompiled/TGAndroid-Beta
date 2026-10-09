package pg;

import android.animation.ValueAnimator;
import m.f3;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45703a;
    public final s0 f45704b;

    public n0(s0 s0Var, int i10) {
        this.f45703a = i10;
        this.f45704b = s0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f45703a) {
            case 0:
                final s0 s0Var = this.f45704b;
                s0Var.f45757f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var = s0Var2.f45753a;
                                if (f3Var != null) {
                                    f3Var.g();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var2 = s0Var3.f45753a;
                                if (f3Var2 != null) {
                                    f3Var2.g();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f45704b;
                s0Var2.f45757f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var = s0Var22.f45753a;
                                if (f3Var != null) {
                                    f3Var.g();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                f3 f3Var2 = s0Var3.f45753a;
                                if (f3Var2 != null) {
                                    f3Var2.g();
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
