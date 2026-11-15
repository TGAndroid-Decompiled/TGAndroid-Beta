package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class qz0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50807a;
    public final n11 f50808b;

    public qz0(n11 n11Var, int i7) {
        this.f50807a = i7;
        this.f50808b = n11Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50807a) {
            case 0:
                n11 n11Var = this.f50808b;
                n11Var.getClass();
                n11Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f50808b.m();
                return;
            case 2:
                n11 n11Var2 = this.f50808b;
                View view = n11Var2.f49409u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int w10 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, n11Var2.f49365a1), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = n11Var2.f49394n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.bn bnVar = n11Var2.f49395o0;
                if (bnVar != null) {
                    bnVar.getBackground().setColorFilter(new PorterDuffColorFilter(w10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                n11 n11Var3 = this.f50808b;
                i01 i01Var = n11Var3.f49368b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n11Var3.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(8.0f));
                View view3 = n11Var3.f49394n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.bn bnVar2 = n11Var3.f49395o0;
                if (bnVar2 != null) {
                    bnVar2.setAlpha(floatValue * floatValue);
                }
                i01Var.setAlpha(floatValue);
                i01Var.invalidate();
                n11Var3.invalidate();
                return;
        }
    }
}
