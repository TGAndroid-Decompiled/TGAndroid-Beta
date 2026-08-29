package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xe implements ValueAnimator.AnimatorUpdateListener {
    public final int f44572a;
    public final tn f44573b;
    public final View f44574c;

    public xe(tn tnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.f44572a = i10;
        this.f44573b = tnVar;
        this.f44574c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44572a) {
            case 0:
                tn tnVar = this.f44573b;
                tnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar.f43022w9 = AndroidUtilities.dp(30.0f) * floatValue;
                tnVar.o9();
                this.f44574c.setAlpha(floatValue);
                return;
            default:
                tn tnVar2 = this.f44573b;
                tnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar2.f43022w9 = AndroidUtilities.dp(30.0f) * floatValue2;
                tnVar2.o9();
                tnVar2.r9();
                this.f44574c.setAlpha(floatValue2);
                return;
        }
    }
}
