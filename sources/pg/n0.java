package pg;

import android.animation.ValueAnimator;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41176a;
    public final s0 f41177b;

    public n0(s0 s0Var, int i10) {
        this.f41176a = i10;
        this.f41177b = s0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f41176a) {
            case 0:
                final s0 s0Var = this.f41177b;
                s0Var.f41223f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n2.e eVar = s0Var2.f41220a;
                                if (eVar != null) {
                                    eVar.t();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n2.e eVar2 = s0Var3.f41220a;
                                if (eVar2 != null) {
                                    eVar2.t();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f41177b;
                s0Var2.f41223f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n2.e eVar = s0Var22.f41220a;
                                if (eVar != null) {
                                    eVar.t();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n2.e eVar2 = s0Var3.f41220a;
                                if (eVar2 != null) {
                                    eVar2.t();
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
