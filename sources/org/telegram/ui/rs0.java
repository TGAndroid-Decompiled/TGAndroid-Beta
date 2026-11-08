package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49543a;
    public final Object f49544b;
    public final View f49545c;
    public final Object d;

    public rs0(int i7, ViewGroup viewGroup, Object obj, Object obj2) {
        this.f49543a = i7;
        this.f49544b = obj;
        this.f49545c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f49543a) {
            case 0:
                us0 us0Var = (us0) this.f49544b;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.f50415n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f49545c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.U.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i7);
                    if (childAt != us0Var.f50413e) {
                        if (childAt == us0Var.f50412c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                l51 l51Var = (l51) this.f49544b;
                l51Var.getClass();
                l51Var.f47428a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f49545c).getEditField().setAlpha(l51Var.f47428a);
                ((org.telegram.ui.Components.ci) this.d).invalidate();
                return;
        }
    }
}
