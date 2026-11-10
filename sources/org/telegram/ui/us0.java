package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class us0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50560a;
    public final Object f50561b;
    public final View f50562c;
    public final Object d;

    public us0(int i7, ViewGroup viewGroup, Object obj, Object obj2) {
        this.f50560a = i7;
        this.f50561b = obj;
        this.f50562c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f50560a) {
            case 0:
                xs0 xs0Var = (xs0) this.f50561b;
                PremiumPreviewFragment premiumPreviewFragment = xs0Var.f51812n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f50562c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.U.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i7);
                    if (childAt != xs0Var.f51810e) {
                        if (childAt == xs0Var.f51809c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                n51 n51Var = (n51) this.f50561b;
                n51Var.getClass();
                n51Var.f48122a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f50562c).getEditField().setAlpha(n51Var.f48122a);
                ((org.telegram.ui.Components.bi) this.d).invalidate();
                return;
        }
    }
}
