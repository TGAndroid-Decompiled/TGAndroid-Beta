package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s51 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39696a;
    public final r71 f39697b;

    public s51(r71 r71Var, int i10) {
        this.f39696a = i10;
        this.f39697b = r71Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39696a) {
            case 0:
                r71 r71Var = this.f39697b;
                r71Var.getClass();
                r71Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39697b.m();
                return;
            case 2:
                r71 r71Var2 = this.f39697b;
                View view = r71Var2.f39355t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, r71Var2.Z0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = r71Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.xn xnVar = r71Var2.f39341n0;
                if (xnVar != null) {
                    xnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                r71 r71Var3 = this.f39697b;
                l61 l61Var = r71Var3.f39313a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r71Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = r71Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.xn xnVar2 = r71Var3.f39341n0;
                if (xnVar2 != null) {
                    xnVar2.setAlpha(floatValue * floatValue);
                }
                l61Var.setAlpha(floatValue);
                l61Var.invalidate();
                r71Var3.invalidate();
                return;
        }
    }
}
