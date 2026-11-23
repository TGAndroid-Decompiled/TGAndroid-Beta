package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51878a;
    public final Object f51879b;
    public final View f51880c;
    public final Object d;

    public rs0(Object obj, ViewGroup viewGroup, Object obj2, int i7) {
        this.f51878a = i7;
        this.f51879b = obj;
        this.f51880c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f51878a) {
            case 0:
                us0 us0Var = (us0) this.f51879b;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.f52725n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f51880c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.V.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i7);
                    if (childAt != us0Var.f52723e) {
                        if (childAt == us0Var.f52722c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                k51 k51Var = (k51) this.f51879b;
                k51Var.getClass();
                k51Var.f49324a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f51880c).getEditField().setAlpha(k51Var.f49324a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
