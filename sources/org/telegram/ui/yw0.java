package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43650a;
    public final Object f43651b;
    public final View f43652c;
    public final Object d;

    public yw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f43650a = i10;
        this.f43651b = obj;
        this.f43652c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f43650a) {
            case 0:
                dx0 dx0Var = (dx0) this.f43651b;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.f35861n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f43652c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != dx0Var.f35859e) {
                        if (childAt == dx0Var.f35858c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                fb1 fb1Var = (fb1) this.f43651b;
                fb1Var.getClass();
                fb1Var.f36245a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f43652c).getEditField().setAlpha(fb1Var.f36245a);
                ((org.telegram.ui.Components.wi) this.d).invalidate();
                return;
        }
    }
}
