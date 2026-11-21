package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class vz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52919a;
    public final s11 f52920b;

    public vz0(s11 s11Var, int i7) {
        this.f52919a = i7;
        this.f52920b = s11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52919a) {
            case 0:
                s11 s11Var = this.f52920b;
                s11Var.getClass();
                s11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52920b.m();
                return;
            case 2:
                s11 s11Var2 = this.f52920b;
                View view = s11Var2.f51864u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, s11Var2.f51820a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = s11Var2.f51849n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.ln lnVar = s11Var2.f51850o0;
                if (lnVar != null) {
                    lnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                s11 s11Var3 = this.f52920b;
                n01 n01Var = s11Var3.f51823b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = s11Var3.f51849n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.ln lnVar2 = s11Var3.f51850o0;
                if (lnVar2 != null) {
                    lnVar2.setAlpha(floatValue * floatValue);
                }
                n01Var.setAlpha(floatValue);
                n01Var.invalidate();
                s11Var3.invalidate();
                return;
        }
    }
}
