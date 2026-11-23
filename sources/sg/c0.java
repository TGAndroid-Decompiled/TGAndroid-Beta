package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.nd0;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f57298a;
    public final h0 f57299b;

    public c0(h0 h0Var, int i7) {
        this.f57298a = i7;
        this.f57299b = h0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f57298a) {
            case 0:
                final h0 h0Var = this.f57299b;
                h0Var.f57343f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                h0 h0Var2 = h0Var;
                                h0Var2.getClass();
                                h0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var = h0Var2.f57339a;
                                if (nd0Var != null) {
                                    nd0Var.p();
                                    return;
                                }
                                return;
                            default:
                                h0 h0Var3 = h0Var;
                                h0Var3.getClass();
                                h0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var2 = h0Var3.f57339a;
                                if (nd0Var2 != null) {
                                    nd0Var2.p();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final h0 h0Var2 = this.f57299b;
                h0Var2.f57343f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                h0 h0Var22 = h0Var2;
                                h0Var22.getClass();
                                h0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var = h0Var22.f57339a;
                                if (nd0Var != null) {
                                    nd0Var.p();
                                    return;
                                }
                                return;
                            default:
                                h0 h0Var3 = h0Var2;
                                h0Var3.getClass();
                                h0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nd0 nd0Var2 = h0Var3.f57339a;
                                if (nd0Var2 != null) {
                                    nd0Var2.p();
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
