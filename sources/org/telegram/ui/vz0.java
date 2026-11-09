package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class vz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50802a;
    public final s11 f50803b;

    public vz0(s11 s11Var, int i7) {
        this.f50802a = i7;
        this.f50803b = s11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50802a) {
            case 0:
                s11 s11Var = this.f50803b;
                s11Var.getClass();
                s11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f50803b.m();
                return;
            case 2:
                s11 s11Var2 = this.f50803b;
                View view = s11Var2.f49704t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, s11Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = s11Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.tm tmVar = s11Var2.f49691n0;
                if (tmVar != null) {
                    tmVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                s11 s11Var3 = this.f50803b;
                n01 n01Var = s11Var3.f49662a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = s11Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.tm tmVar2 = s11Var3.f49691n0;
                if (tmVar2 != null) {
                    tmVar2.setAlpha(floatValue * floatValue);
                }
                n01Var.setAlpha(floatValue);
                n01Var.invalidate();
                s11Var3.invalidate();
                return;
        }
    }
}
