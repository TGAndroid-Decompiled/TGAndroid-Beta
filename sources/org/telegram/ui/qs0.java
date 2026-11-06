package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49291a;
    public final Object f49292b;
    public final View f49293c;
    public final Object d;

    public qs0(int i7, ViewGroup viewGroup, Object obj, Object obj2) {
        this.f49291a = i7;
        this.f49292b = obj;
        this.f49293c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f49291a) {
            case 0:
                ts0 ts0Var = (ts0) this.f49292b;
                PremiumPreviewFragment premiumPreviewFragment = ts0Var.f50109n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f49293c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.U.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i7);
                    if (childAt != ts0Var.f50107e) {
                        if (childAt == ts0Var.f50106c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                l51 l51Var = (l51) this.f49292b;
                l51Var.getClass();
                l51Var.f47397a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f49293c).getEditField().setAlpha(l51Var.f47397a);
                ((org.telegram.ui.Components.ci) this.d).invalidate();
                return;
        }
    }
}
