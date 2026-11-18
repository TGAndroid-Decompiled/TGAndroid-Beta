package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.hn;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f57175a;
    public final i0 f57176b;

    public c0(i0 i0Var, int i7) {
        this.f57175a = i7;
        this.f57176b = i0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f57175a) {
            case 0:
                final i0 i0Var = this.f57176b;
                i0Var.f57225f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar = i0Var2.f57221a;
                                if (hnVar != null) {
                                    hnVar.l();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar2 = i0Var3.f57221a;
                                if (hnVar2 != null) {
                                    hnVar2.l();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final i0 i0Var2 = this.f57176b;
                i0Var2.f57225f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar = i0Var22.f57221a;
                                if (hnVar != null) {
                                    hnVar.l();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var2;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                hn hnVar2 = i0Var3.f57221a;
                                if (hnVar2 != null) {
                                    hnVar2.l();
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
