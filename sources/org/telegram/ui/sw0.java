package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43425a;
    public final Object f43426b;
    public final View f43427c;
    public final Object d;

    public sw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f43425a = i10;
        this.f43426b = obj;
        this.f43427c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f43425a) {
            case 0:
                xw0 xw0Var = (xw0) this.f43426b;
                PremiumPreviewFragment premiumPreviewFragment = xw0Var.f45792n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f43427c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != xw0Var.e) {
                        if (childAt == xw0Var.f45790c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ia1 ia1Var = (ia1) this.f43426b;
                ia1Var.getClass();
                ia1Var.f40080a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f43427c).getEditField().setAlpha(ia1Var.f40080a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
