package sg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.jn;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f57185a;
    public final i0 f57186b;

    public c0(i0 i0Var, int i7) {
        this.f57185a = i7;
        this.f57186b = i0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f57185a) {
            case 0:
                final i0 i0Var = this.f57186b;
                i0Var.f57235f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                jn jnVar = i0Var2.f57231a;
                                if (jnVar != null) {
                                    jnVar.l();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                jn jnVar2 = i0Var3.f57231a;
                                if (jnVar2 != null) {
                                    jnVar2.l();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final i0 i0Var2 = this.f57186b;
                i0Var2.f57235f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                jn jnVar = i0Var22.f57231a;
                                if (jnVar != null) {
                                    jnVar.l();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var2;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                jn jnVar2 = i0Var3.f57231a;
                                if (jnVar2 != null) {
                                    jnVar2.l();
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
