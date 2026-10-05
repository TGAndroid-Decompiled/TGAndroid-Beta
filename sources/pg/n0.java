package pg;

import android.animation.ValueAnimator;
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44549a;
    public final s0 f44550b;

    public n0(s0 s0Var, int i10) {
        this.f44549a = i10;
        this.f44550b = s0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f44549a) {
            case 0:
                final s0 s0Var = this.f44550b;
                s0Var.f44601f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = s0Var;
                                s0Var2.getClass();
                                s0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.g gVar = s0Var2.f44597a;
                                if (gVar != null) {
                                    gVar.V();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.g gVar2 = s0Var3.f44597a;
                                if (gVar2 != null) {
                                    gVar2.V();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f44550b;
                s0Var2.f44601f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var22 = s0Var2;
                                s0Var22.getClass();
                                s0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.g gVar = s0Var22.f44597a;
                                if (gVar != null) {
                                    gVar.V();
                                    return;
                                }
                                return;
                            default:
                                s0 s0Var3 = s0Var2;
                                s0Var3.getClass();
                                s0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                l2.g gVar2 = s0Var3.f44597a;
                                if (gVar2 != null) {
                                    gVar2.V();
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
