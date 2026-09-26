package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class vw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38841a;
    public final Object f38842b;
    public final View f38843c;
    public final Object d;

    public vw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f38841a = i10;
        this.f38842b = obj;
        this.f38843c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f38841a) {
            case 0:
                ax0 ax0Var = (ax0) this.f38842b;
                PremiumPreviewFragment premiumPreviewFragment = ax0Var.f32253n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f38843c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != ax0Var.e) {
                        if (childAt == ax0Var.f32251c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                cb1 cb1Var = (cb1) this.f38842b;
                cb1Var.getClass();
                cb1Var.f32624a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f38843c).getEditField().setAlpha(cb1Var.f32624a);
                ((org.telegram.ui.Components.vi) this.d).invalidate();
                return;
        }
    }
}
