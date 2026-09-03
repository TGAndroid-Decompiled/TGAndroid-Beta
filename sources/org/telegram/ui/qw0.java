package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40704a;
    public final Object f40705b;
    public final View f40706c;
    public final Object d;

    public qw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f40704a = i10;
        this.f40705b = obj;
        this.f40706c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f40704a) {
            case 0:
                vw0 vw0Var = (vw0) this.f40705b;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f42226n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f40706c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.R.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i10);
                    if (childAt != vw0Var.f42224e) {
                        if (childAt == vw0Var.f42223c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                xa1 xa1Var = (xa1) this.f40705b;
                xa1Var.getClass();
                xa1Var.f42974a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f40706c).getEditField().setAlpha(xa1Var.f42974a);
                ((org.telegram.ui.Components.li) this.d).invalidate();
                return;
        }
    }
}
