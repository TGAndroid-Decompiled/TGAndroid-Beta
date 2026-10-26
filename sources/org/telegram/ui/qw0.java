package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42938a;
    public final Object f42939b;
    public final View f42940c;
    public final Object d;

    public qw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f42938a = i10;
        this.f42939b = obj;
        this.f42940c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f42938a) {
            case 0:
                vw0 vw0Var = (vw0) this.f42939b;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f44917n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f42940c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != vw0Var.e) {
                        if (childAt == vw0Var.f44915c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ga1 ga1Var = (ga1) this.f42939b;
                ga1Var.getClass();
                ga1Var.f39581a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f42940c).getEditField().setAlpha(ga1Var.f39581a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
