package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41135a;
    public final r61 f41136b;

    public s41(r61 r61Var, int i10) {
        this.f41135a = i10;
        this.f41136b = r61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41135a) {
            case 0:
                r61 r61Var = this.f41136b;
                r61Var.getClass();
                r61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f41136b.m();
                return;
            case 2:
                r61 r61Var2 = this.f41136b;
                View view = r61Var2.f40815q0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, r61Var2.W0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = r61Var2.f40802j0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.jn jnVar = r61Var2.f40804k0;
                if (jnVar != null) {
                    jnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                r61 r61Var3 = this.f41136b;
                l51 l51Var = r61Var3.U;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = r61Var3.f40802j0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.jn jnVar2 = r61Var3.f40804k0;
                if (jnVar2 != null) {
                    jnVar2.setAlpha(floatValue * floatValue);
                }
                l51Var.setAlpha(floatValue);
                l51Var.invalidate();
                r61Var3.invalidate();
                return;
        }
    }
}
