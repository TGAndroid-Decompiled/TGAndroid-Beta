package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class uz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52630a;
    public final r11 f52631b;

    public uz0(r11 r11Var, int i7) {
        this.f52630a = i7;
        this.f52631b = r11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52630a) {
            case 0:
                r11 r11Var = this.f52631b;
                r11Var.getClass();
                r11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52631b.m();
                return;
            case 2:
                r11 r11Var2 = this.f52631b;
                View view = r11Var2.f51422u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, r11Var2.f51378a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = r11Var2.f51407n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.jn jnVar = r11Var2.f51408o0;
                if (jnVar != null) {
                    jnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                r11 r11Var3 = this.f52631b;
                m01 m01Var = r11Var3.f51381b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = r11Var3.f51407n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.jn jnVar2 = r11Var3.f51408o0;
                if (jnVar2 != null) {
                    jnVar2.setAlpha(floatValue * floatValue);
                }
                m01Var.setAlpha(floatValue);
                m01Var.invalidate();
                r11Var3.invalidate();
                return;
        }
    }
}
