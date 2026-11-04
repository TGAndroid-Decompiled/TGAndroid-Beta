package tg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.nh;
public final class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f55148a;
    public final i0 f55149b;

    public d0(i0 i0Var, int i3) {
        this.f55148a = i3;
        this.f55149b = i0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f55148a) {
            case 0:
                final i0 i0Var = this.f55149b;
                i0Var.f55193f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar = i0Var2.f55189a;
                                if (nhVar != null) {
                                    nhVar.x();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar2 = i0Var3.f55189a;
                                if (nhVar2 != null) {
                                    nhVar2.x();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final i0 i0Var2 = this.f55149b;
                i0Var2.f55193f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar = i0Var22.f55189a;
                                if (nhVar != null) {
                                    nhVar.x();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var2;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                nh nhVar2 = i0Var3.f55189a;
                                if (nhVar2 != null) {
                                    nhVar2.x();
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
