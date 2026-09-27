package pg;

import android.animation.ValueAnimator;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41175a;
    public final s0 f41176b;

    public n0(s0 s0Var, int i10) {
        this.f41175a = i10;
        this.f41176b = s0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f41175a) {
            case 0:
                final s0 s0Var = this.f41176b;
                s0Var.f41222f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o0.c cVar = s0Var2.f41219a;
                                if (cVar != null) {
                                    cVar.v();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o0.c cVar2 = s0Var3.f41219a;
                                if (cVar2 != null) {
                                    cVar2.v();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f41176b;
                s0Var2.f41222f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o0.c cVar = s0Var22.f41219a;
                                if (cVar != null) {
                                    cVar.v();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                o0.c cVar2 = s0Var3.f41219a;
                                if (cVar2 != null) {
                                    cVar2.v();
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
