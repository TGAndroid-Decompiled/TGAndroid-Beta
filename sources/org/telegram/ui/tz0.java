package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class tz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52500a;
    public final q11 f52501b;

    public tz0(q11 q11Var, int i7) {
        this.f52500a = i7;
        this.f52501b = q11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52500a) {
            case 0:
                q11 q11Var = this.f52501b;
                q11Var.getClass();
                q11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f52501b.m();
                return;
            case 2:
                q11 q11Var2 = this.f52501b;
                View view = q11Var2.f51271u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, q11Var2.f51227a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = q11Var2.f51256n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.in inVar = q11Var2.f51257o0;
                if (inVar != null) {
                    inVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                q11 q11Var3 = this.f52501b;
                l01 l01Var = q11Var3.f51230b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = q11Var3.f51256n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.in inVar2 = q11Var3.f51257o0;
                if (inVar2 != null) {
                    inVar2.setAlpha(floatValue * floatValue);
                }
                l01Var.setAlpha(floatValue);
                l01Var.invalidate();
                q11Var3.invalidate();
                return;
        }
    }
}
