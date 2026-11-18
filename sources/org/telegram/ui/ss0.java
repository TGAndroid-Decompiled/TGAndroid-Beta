package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ss0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52069a;
    public final Object f52070b;
    public final View f52071c;
    public final Object d;

    public ss0(Object obj, ViewGroup viewGroup, Object obj2, int i7) {
        this.f52069a = i7;
        this.f52070b = obj;
        this.f52071c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f52069a) {
            case 0:
                vs0 vs0Var = (vs0) this.f52070b;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.f52845n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f52071c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.V.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i7);
                    if (childAt != vs0Var.f52843e) {
                        if (childAt == vs0Var.f52842c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                l51 l51Var = (l51) this.f52070b;
                l51Var.getClass();
                l51Var.f49439a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f52071c).getEditField().setAlpha(l51Var.f49439a);
                ((org.telegram.ui.Components.ri) this.d).invalidate();
                return;
        }
    }
}
