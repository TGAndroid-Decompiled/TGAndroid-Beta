package sg;

import android.animation.ValueAnimator;
import org.telegram.messenger.ou;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f56601a;
    public final i0 f56602b;

    public c0(i0 i0Var, int i7) {
        this.f56601a = i7;
        this.f56602b = i0Var;
    }

    @Override
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        switch (this.f56601a) {
            case 0:
                final i0 i0Var = this.f56602b;
                i0Var.f56651f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ou ouVar = i0Var2.f56647a;
                                if (ouVar != null) {
                                    ouVar.E0();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ou ouVar2 = i0Var3.f56647a;
                                if (ouVar2 != null) {
                                    ouVar2.E0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final i0 i0Var2 = this.f56602b;
                i0Var2.f56651f.f(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ou ouVar = i0Var22.f56647a;
                                if (ouVar != null) {
                                    ouVar.E0();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var2;
                                i0Var3.getClass();
                                i0Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ou ouVar2 = i0Var3.f56647a;
                                if (ouVar2 != null) {
                                    ouVar2.E0();
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
