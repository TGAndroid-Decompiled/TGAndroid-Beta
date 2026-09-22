package pg;

import android.animation.ValueAnimator;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41226a;
    public final s0 f41227b;

    public n0(s0 s0Var, int i10) {
        this.f41226a = i10;
        this.f41227b = s0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f41226a) {
            case 0:
                final s0 s0Var = this.f41227b;
                s0Var.f41273f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l.d dVar = s0Var2.f41270a;
                                if (dVar != null) {
                                    dVar.V();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l.d dVar2 = s0Var3.f41270a;
                                if (dVar2 != null) {
                                    dVar2.V();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f41227b;
                s0Var2.f41273f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l.d dVar = s0Var22.f41270a;
                                if (dVar != null) {
                                    dVar.V();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l.d dVar2 = s0Var3.f41270a;
                                if (dVar2 != null) {
                                    dVar2.V();
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
