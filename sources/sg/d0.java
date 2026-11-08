package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.vy;
public final class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f55028a;
    public final j0 f55029b;

    public d0(j0 j0Var, int i7) {
        this.f55028a = i7;
        this.f55029b = j0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f55028a) {
            case 0:
                final j0 j0Var = this.f55029b;
                j0Var.f55089f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                j0 j0Var2 = j0Var;
                                j0Var2.getClass();
                                j0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar = j0Var2.f55085a;
                                if (vyVar != null) {
                                    vyVar.b();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var3 = j0Var;
                                j0Var3.getClass();
                                j0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar2 = j0Var3.f55085a;
                                if (vyVar2 != null) {
                                    vyVar2.b();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final j0 j0Var2 = this.f55029b;
                j0Var2.f55089f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                j0 j0Var22 = j0Var2;
                                j0Var22.getClass();
                                j0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar = j0Var22.f55085a;
                                if (vyVar != null) {
                                    vyVar.b();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var3 = j0Var2;
                                j0Var3.getClass();
                                j0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vy vyVar2 = j0Var3.f55085a;
                                if (vyVar2 != null) {
                                    vyVar2.b();
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
