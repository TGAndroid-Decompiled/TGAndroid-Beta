package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51468a;
    public final t11 f51469b;

    public wz0(t11 t11Var, int i7) {
        this.f51468a = i7;
        this.f51469b = t11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51468a) {
            case 0:
                t11 t11Var = this.f51469b;
                t11Var.getClass();
                t11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f51469b.m();
                return;
            case 2:
                t11 t11Var2 = this.f51469b;
                View view = t11Var2.f50060t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, t11Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = t11Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.sm smVar = t11Var2.f50047n0;
                if (smVar != null) {
                    smVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                t11 t11Var3 = this.f51469b;
                o01 o01Var = t11Var3.f50018a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = t11Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.sm smVar2 = t11Var3.f50047n0;
                if (smVar2 != null) {
                    smVar2.setAlpha(floatValue * floatValue);
                }
                o01Var.setAlpha(floatValue);
                o01Var.invalidate();
                t11Var3.invalidate();
                return;
        }
    }
}
