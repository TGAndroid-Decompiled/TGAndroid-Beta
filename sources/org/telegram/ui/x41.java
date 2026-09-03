package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x41 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39842a;
    public final x61 f39843b;

    public x41(x61 x61Var, int i10) {
        this.f39842a = i10;
        this.f39843b = x61Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39842a) {
            case 0:
                x61 x61Var = this.f39843b;
                x61Var.getClass();
                x61Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f39843b.m();
                return;
            case 2:
                x61 x61Var2 = this.f39843b;
                View view = x61Var2.f39886q0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, x61Var2.W0), i0.a.k(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = x61Var2.f39873j0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.gn gnVar = x61Var2.f39875k0;
                if (gnVar != null) {
                    gnVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                x61 x61Var3 = this.f39843b;
                q51 q51Var = x61Var3.U;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x61Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = x61Var3.f39873j0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.gn gnVar2 = x61Var3.f39875k0;
                if (gnVar2 != null) {
                    gnVar2.setAlpha(floatValue * floatValue);
                }
                q51Var.setAlpha(floatValue);
                q51Var.invalidate();
                x61Var3.invalidate();
                return;
        }
    }
}
