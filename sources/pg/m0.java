package pg;

import android.animation.ValueAnimator;
public final class m0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40863a;
    public final r0 f40864b;

    public m0(r0 r0Var, int i10) {
        this.f40863a = i10;
        this.f40864b = r0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f40863a) {
            case 0:
                final r0 r0Var = this.f40864b;
                r0Var.f40908f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = r0Var;
                                r0Var2.getClass();
                                r0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = r0Var2.f40905a;
                                if (uVar != null) {
                                    uVar.W();
                                    return;
                                }
                                return;
                            default:
                                r0 r0Var3 = r0Var;
                                r0Var3.getClass();
                                r0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = r0Var3.f40905a;
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
                final r0 r0Var2 = this.f40864b;
                r0Var2.f40908f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var22 = r0Var2;
                                r0Var22.getClass();
                                r0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar = r0Var22.f40905a;
                                if (uVar != null) {
                                    uVar.W();
                                    return;
                                }
                                return;
                            default:
                                r0 r0Var3 = r0Var2;
                                r0Var3.getClass();
                                r0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                k2.u uVar2 = r0Var3.f40905a;
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
