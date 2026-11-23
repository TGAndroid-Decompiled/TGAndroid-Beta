package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class uz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52655a;
    public final r11 f52656b;

    public uz0(r11 r11Var, int i7) {
        this.f52655a = i7;
        this.f52656b = r11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52655a) {
            case 0:
                r11 r11Var = this.f52656b;
                r11Var.getClass();
                r11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52656b.m();
                return;
            case 2:
                r11 r11Var2 = this.f52656b;
                View view = r11Var2.f51446u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, r11Var2.f51402a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = r11Var2.f51431n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.ln lnVar = r11Var2.f51432o0;
                if (lnVar != null) {
                    lnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                r11 r11Var3 = this.f52656b;
                m01 m01Var = r11Var3.f51405b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = r11Var3.f51431n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.ln lnVar2 = r11Var3.f51432o0;
                if (lnVar2 != null) {
                    lnVar2.setAlpha(floatValue * floatValue);
                }
                m01Var.setAlpha(floatValue);
                m01Var.invalidate();
                r11Var3.invalidate();
                return;
        }
    }
}
