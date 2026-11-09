package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ts0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50233a;
    public final Object f50234b;
    public final View f50235c;
    public final Object d;

    public ts0(int i7, ViewGroup viewGroup, Object obj, Object obj2) {
        this.f50233a = i7;
        this.f50234b = obj;
        this.f50235c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f50233a) {
            case 0:
                ws0 ws0Var = (ws0) this.f50234b;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.f51471n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f50235c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.U.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i7);
                    if (childAt != ws0Var.f51469e) {
                        if (childAt == ws0Var.f51468c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                m51 m51Var = (m51) this.f50234b;
                m51Var.getClass();
                m51Var.f47752a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f50235c).getEditField().setAlpha(m51Var.f47752a);
                ((org.telegram.ui.Components.ci) this.d).invalidate();
                return;
        }
    }
}
