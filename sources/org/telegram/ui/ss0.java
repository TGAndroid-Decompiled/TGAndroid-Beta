package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ss0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52117a;
    public final Object f52118b;
    public final View f52119c;
    public final Object d;

    public ss0(Object obj, ViewGroup viewGroup, Object obj2, int i7) {
        this.f52117a = i7;
        this.f52118b = obj;
        this.f52119c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f52117a) {
            case 0:
                vs0 vs0Var = (vs0) this.f52118b;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.f52886n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f52119c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.V.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i7);
                    if (childAt != vs0Var.f52884e) {
                        if (childAt == vs0Var.f52883c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                l51 l51Var = (l51) this.f52118b;
                l51Var.getClass();
                l51Var.f49477a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f52119c).getEditField().setAlpha(l51Var.f49477a);
                ((org.telegram.ui.Components.ti) this.d).invalidate();
                return;
        }
    }
}
