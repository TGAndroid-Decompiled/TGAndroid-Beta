package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ze implements ValueAnimator.AnimatorUpdateListener {
    public final int f45120a;
    public final qn f45121b;
    public final View f45122c;

    public ze(qn qnVar, org.telegram.ui.Cells.w0 w0Var, int i9) {
        this.f45120a = i9;
        this.f45121b = qnVar;
        this.f45122c = w0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45120a) {
            case 0:
                qn qnVar = this.f45121b;
                qnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.f42122w9 = AndroidUtilities.dp(30.0f) * floatValue;
                qnVar.o9();
                this.f45122c.setAlpha(floatValue);
                return;
            default:
                qn qnVar2 = this.f45121b;
                qnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.f42122w9 = AndroidUtilities.dp(30.0f) * floatValue2;
                qnVar2.o9();
                qnVar2.r9();
                this.f45122c.setAlpha(floatValue2);
                return;
        }
    }
}
