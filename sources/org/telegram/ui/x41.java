package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42921a;
    public final w61 f42922b;

    public x41(w61 w61Var, int i10) {
        this.f42921a = i10;
        this.f42922b = w61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42921a) {
            case 0:
                w61 w61Var = this.f42922b;
                w61Var.getClass();
                w61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42922b.m();
                return;
            case 2:
                w61 w61Var2 = this.f42922b;
                View view = w61Var2.f42338q0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, w61Var2.W0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = w61Var2.f42325j0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.in inVar = w61Var2.f42327k0;
                if (inVar != null) {
                    inVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                w61 w61Var3 = this.f42922b;
                q51 q51Var = w61Var3.U;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = w61Var3.f42325j0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.in inVar2 = w61Var3.f42327k0;
                if (inVar2 != null) {
                    inVar2.setAlpha(floatValue * floatValue);
                }
                q51Var.setAlpha(floatValue);
                q51Var.invalidate();
                w61Var3.invalidate();
                return;
        }
    }
}
