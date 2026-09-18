package pg;

import android.animation.ValueAnimator;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40935a;
    public final q0 f40936b;

    public l0(q0 q0Var, int i10) {
        this.f40935a = i10;
        this.f40936b = q0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f40935a) {
            case 0:
                final q0 q0Var = this.f40936b;
                q0Var.f40978f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                q0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = q0Var2.f40975a;
                                if (uVar != null) {
                                    uVar.W();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = q0Var3.f40975a;
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
                final q0 q0Var2 = this.f40936b;
                q0Var2.f40978f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var22 = q0Var2;
                                q0Var22.getClass();
                                q0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = q0Var22.f40975a;
                                if (uVar != null) {
                                    uVar.W();
                                    return;
                                }
                                return;
                            default:
                                q0 q0Var3 = q0Var2;
                                q0Var3.getClass();
                                q0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = q0Var3.f40975a;
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
