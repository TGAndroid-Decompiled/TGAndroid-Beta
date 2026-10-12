package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rf implements ValueAnimator.AnimatorUpdateListener {
    public final int f39784a;
    public final fo f39785b;
    public final View f39786c;

    public rf(fo foVar, org.telegram.ui.Cells.x0 x0Var, int i10) {
        this.f39784a = i10;
        this.f39785b = foVar;
        this.f39786c = x0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39784a) {
            case 0:
                fo foVar = this.f39785b;
                foVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                foVar.t9();
                this.f39786c.setAlpha(floatValue);
                return;
            default:
                fo foVar2 = this.f39785b;
                foVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                foVar2.t9();
                foVar2.w9();
                this.f39786c.setAlpha(floatValue2);
                return;
        }
    }
}
