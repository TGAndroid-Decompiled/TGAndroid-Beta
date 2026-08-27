package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class ze implements ValueAnimator.AnimatorUpdateListener {

    public final int f45149a;

    public final rn f45150b;

    public final View f45151c;

    public ze(rn rnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f45149a = i10;
        this.f45150b = rnVar;
        this.f45151c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45149a) {
            case 0:
                rn rnVar = this.f45150b;
                rnVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.f42261w9 = AndroidUtilities.dp(30.0f) * fFloatValue;
                rnVar.o9();
                this.f45151c.setAlpha(fFloatValue);
                break;
            default:
                rn rnVar2 = this.f45150b;
                rnVar2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar2.f42261w9 = AndroidUtilities.dp(30.0f) * fFloatValue2;
                rnVar2.o9();
                rnVar2.r9();
                this.f45151c.setAlpha(fFloatValue2);
                break;
        }
    }
}
