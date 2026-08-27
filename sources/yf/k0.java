package yf;

import android.animation.ValueAnimator;

public final class k0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f49969a;

    public final p0 f49970b;

    public k0(p0 p0Var, int i10) {
        this.f49969a = i10;
        this.f49970b = p0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f49969a) {
            case 0:
                final p0 p0Var = this.f49970b;
                final int i10 = 1;
                p0Var.f50015f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                p0 p0Var2 = p0Var;
                                p0Var2.getClass();
                                p0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar = p0Var2.f50011a;
                                if (dVar != null) {
                                    dVar.C();
                                }
                                break;
                            default:
                                p0 p0Var3 = p0Var;
                                p0Var3.getClass();
                                p0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar2 = p0Var3.f50011a;
                                if (dVar2 != null) {
                                    dVar2.C();
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final p0 p0Var2 = this.f49970b;
                final int i11 = 0;
                p0Var2.f50015f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                p0 p0Var3 = p0Var2;
                                p0Var3.getClass();
                                p0Var3.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar = p0Var3.f50011a;
                                if (dVar != null) {
                                    dVar.C();
                                }
                                break;
                            default:
                                p0 p0Var4 = p0Var2;
                                p0Var4.getClass();
                                p0Var4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                n1.d dVar2 = p0Var4.f50011a;
                                if (dVar2 != null) {
                                    dVar2.C();
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
