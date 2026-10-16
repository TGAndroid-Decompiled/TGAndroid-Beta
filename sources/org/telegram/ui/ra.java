package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class ra implements ValueAnimator.AnimatorUpdateListener {
    public final int f39408a;
    public final sa f39409b;

    public ra(sa saVar, int i10) {
        this.f39408a = i10;
        this.f39409b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39408a) {
            case 0:
                sa saVar = this.f39409b;
                saVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.f39740n = floatValue;
                saVar.f39739f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                saVar.d.setAlpha(saVar.f39740n);
                return;
            default:
                sa saVar2 = this.f39409b;
                saVar2.getClass();
                saVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.g6.f20005z6;
                org.telegram.ui.ActionBar.c6 c6Var = saVar2.f39737b;
                int d = i0.a.d(saVar2.E, org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19784n6, c6Var));
                saVar2.e.b(d);
                saVar2.f39739f.setTextColor(d);
                return;
        }
    }
}
