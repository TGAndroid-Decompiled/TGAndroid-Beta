package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43344a;
    public final x51 f43345b;

    public y31(x51 x51Var, int i10) {
        this.f43344a = i10;
        this.f43345b = x51Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43344a) {
            case 0:
                x51 x51Var = this.f43345b;
                x51Var.getClass();
                x51Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f43345b.m();
                return;
            case 2:
                x51 x51Var2 = this.f43345b;
                View view = x51Var2.f43086t0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, x51Var2.Z0), i0.a.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = x51Var2.m0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.Components.un unVar = x51Var2.f43072n0;
                if (unVar != null) {
                    unVar.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            default:
                x51 x51Var3 = this.f43345b;
                r41 r41Var = x51Var3.f43044a0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var3.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(8.0f));
                View view3 = x51Var3.m0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                org.telegram.ui.Components.un unVar2 = x51Var3.f43072n0;
                if (unVar2 != null) {
                    unVar2.setAlpha(floatValue * floatValue);
                }
                r41Var.setAlpha(floatValue);
                r41Var.invalidate();
                x51Var3.invalidate();
                return;
        }
    }
}
