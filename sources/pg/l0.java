package pg;

import android.animation.ValueAnimator;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40930a;
    public final q0 f40931b;

    public l0(q0 q0Var, int i10) {
        this.f40930a = i10;
        this.f40931b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f40930a) {
            case 0:
                final q0 q0Var = this.f40931b;
                q0Var.f40973f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = q0Var2.f40970a;
                                if (uVar != null) {
                                    uVar.W();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = q0Var3.f40970a;
                                if (uVar2 != null) {
                                    uVar2.W();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final q0 q0Var2 = this.f40931b;
                q0Var2.f40973f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = q0Var22.f40970a;
                                if (uVar != null) {
                                    uVar.W();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = q0Var3.f40970a;
                                if (uVar2 != null) {
                                    uVar2.W();
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
