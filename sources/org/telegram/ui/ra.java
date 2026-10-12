package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ra implements ValueAnimator.AnimatorUpdateListener {
    public final int f39715a;
    public final sa f39716b;

    public ra(sa saVar, int i10) {
        this.f39715a = i10;
        this.f39716b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39715a) {
            case 0:
                sa saVar = this.f39716b;
                saVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.f40016n = floatValue;
                saVar.f40015f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                saVar.d.setAlpha(saVar.f40016n);
                return;
            default:
                sa saVar2 = this.f39716b;
                saVar2.getClass();
                saVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.g6.f20305z6;
                org.telegram.ui.ActionBar.c6 c6Var = saVar2.f40013b;
                int d = i0.a.d(saVar2.E, org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20084n6, c6Var));
                saVar2.e.b(d);
                saVar2.f40015f.setTextColor(d);
                return;
        }
    }
}
