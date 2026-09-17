package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class tn implements ValueAnimator.AnimatorUpdateListener {
    public final int f40825a;
    public final un f40826b;

    public tn(un unVar, int i10) {
        this.f40825a = i10;
        this.f40826b = unVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40825a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar = this.f40826b;
                unVar.f41218f = floatValue;
                View view = unVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar2 = this.f40826b;
                unVar2.f41218f = floatValue2;
                View view2 = unVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar3 = this.f40826b;
                unVar3.f41218f = floatValue3;
                View view3 = unVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
