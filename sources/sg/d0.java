package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.uy;
public final class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f54936a;
    public final j0 f54937b;

    public d0(j0 j0Var, int i7) {
        this.f54936a = i7;
        this.f54937b = j0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f54936a) {
            case 0:
                final j0 j0Var = this.f54937b;
                j0Var.f54997f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                j0 j0Var2 = j0Var;
                                j0Var2.getClass();
                                j0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                uy uyVar = j0Var2.f54993a;
                                if (uyVar != null) {
                                    uyVar.b();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var3 = j0Var;
                                j0Var3.getClass();
                                j0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                uy uyVar2 = j0Var3.f54993a;
                                if (uyVar2 != null) {
                                    uyVar2.b();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final j0 j0Var2 = this.f54937b;
                j0Var2.f54997f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                j0 j0Var22 = j0Var2;
                                j0Var22.getClass();
                                j0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                uy uyVar = j0Var22.f54993a;
                                if (uyVar != null) {
                                    uyVar.b();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var3 = j0Var2;
                                j0Var3.getClass();
                                j0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                uy uyVar2 = j0Var3.f54993a;
                                if (uyVar2 != null) {
                                    uyVar2.b();
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
