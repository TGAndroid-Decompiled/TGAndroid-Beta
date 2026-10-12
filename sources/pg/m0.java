package pg;

import android.animation.ValueAnimator;
public final class m0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45588a;
    public final r0 f45589b;

    public m0(r0 r0Var, int i10) {
        this.f45588a = i10;
        this.f45589b = r0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f45588a) {
            case 0:
                final r0 r0Var = this.f45589b;
                r0Var.f45637f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = r0Var;
                                r0Var2.getClass();
                                r0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.g0 g0Var = r0Var2.f45633a;
                                if (g0Var != null) {
                                    g0Var.e();
                                    return;
                                }
                                return;
                            default:
                                r0 r0Var3 = r0Var;
                                r0Var3.getClass();
                                r0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.g0 g0Var2 = r0Var3.f45633a;
                                if (g0Var2 != null) {
                                    g0Var2.e();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final r0 r0Var2 = this.f45589b;
                r0Var2.f45637f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var22 = r0Var2;
                                r0Var22.getClass();
                                r0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.g0 g0Var = r0Var22.f45633a;
                                if (g0Var != null) {
                                    g0Var.e();
                                    return;
                                }
                                return;
                            default:
                                r0 r0Var3 = r0Var2;
                                r0Var3.getClass();
                                r0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.g0 g0Var2 = r0Var3.f45633a;
                                if (g0Var2 != null) {
                                    g0Var2.e();
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
