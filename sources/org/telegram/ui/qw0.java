package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42935a;
    public final Object f42936b;
    public final View f42937c;
    public final Object d;

    public qw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f42935a = i10;
        this.f42936b = obj;
        this.f42937c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f42935a) {
            case 0:
                vw0 vw0Var = (vw0) this.f42936b;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f44914n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f42937c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != vw0Var.e) {
                        if (childAt == vw0Var.f44912c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ga1 ga1Var = (ga1) this.f42936b;
                ga1Var.getClass();
                ga1Var.f39578a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f42937c).getEditField().setAlpha(ga1Var.f39578a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
