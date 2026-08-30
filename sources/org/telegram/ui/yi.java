package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class yi implements ValueAnimator.AnimatorUpdateListener {
    public final int f40529a;
    public final org.telegram.ui.ActionBar.p2 f40530b;

    public yi(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f40529a = i10;
        this.f40530b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40529a) {
            case 0:
                xn xnVar = (xn) this.f40530b;
                xnVar.f40057ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.U0.invalidate();
                return;
            case 1:
                oy oyVar = (oy) this.f40530b;
                oyVar.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = oyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((cd1) this.f40530b).f33338u0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
