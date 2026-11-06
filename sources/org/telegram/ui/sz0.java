package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class sz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49870a;
    public final q11 f49871b;

    public sz0(q11 q11Var, int i7) {
        this.f49870a = i7;
        this.f49871b = q11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49870a) {
            case 0:
                q11 q11Var = this.f49871b;
                q11Var.getClass();
                q11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f49871b.m();
                return;
            case 2:
                q11 q11Var2 = this.f49871b;
                View view = q11Var2.f49059t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, q11Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = q11Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.tm tmVar = q11Var2.f49046n0;
                if (tmVar != null) {
                    tmVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                q11 q11Var3 = this.f49871b;
                l01 l01Var = q11Var3.f49017a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = q11Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.tm tmVar2 = q11Var3.f49046n0;
                if (tmVar2 != null) {
                    tmVar2.setAlpha(floatValue * floatValue);
                }
                l01Var.setAlpha(floatValue);
                l01Var.invalidate();
                q11Var3.invalidate();
                return;
        }
    }
}
