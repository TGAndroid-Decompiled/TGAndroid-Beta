package qg;

import android.animation.ValueAnimator;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44623a;
    public final s0 f44624b;

    public n0(s0 s0Var, int i10) {
        this.f44623a = i10;
        this.f44624b = s0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f44623a) {
            case 0:
                final s0 s0Var = this.f44624b;
                s0Var.f44668f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                le.b bVar = s0Var2.f44665a;
                                if (bVar != null) {
                                    bVar.a0();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                le.b bVar2 = s0Var3.f44665a;
                                if (bVar2 != null) {
                                    bVar2.a0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f44624b;
                s0Var2.f44668f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                le.b bVar = s0Var22.f44665a;
                                if (bVar != null) {
                                    bVar.a0();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                le.b bVar2 = s0Var3.f44665a;
                                if (bVar2 != null) {
                                    bVar2.a0();
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
