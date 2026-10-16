package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rf implements ValueAnimator.AnimatorUpdateListener {
    public final int f39502a;
    public final fo f39503b;
    public final View f39504c;

    public rf(fo foVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.f39502a = i10;
        this.f39503b = foVar;
        this.f39504c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39502a) {
            case 0:
                fo foVar = this.f39503b;
                foVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                foVar.t9();
                this.f39504c.setAlpha(floatValue);
                return;
            default:
                fo foVar2 = this.f39503b;
                foVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                foVar2.t9();
                foVar2.w9();
                this.f39504c.setAlpha(floatValue2);
                return;
        }
    }
}
