package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ts0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52347a;
    public final Object f52348b;
    public final View f52349c;
    public final Object d;

    public ts0(Object obj, ViewGroup viewGroup, Object obj2, int i7) {
        this.f52347a = i7;
        this.f52348b = obj;
        this.f52349c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f52347a) {
            case 0:
                ws0 ws0Var = (ws0) this.f52348b;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.f53450n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f52349c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.V.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i7);
                    if (childAt != ws0Var.f53448e) {
                        if (childAt == ws0Var.f53447c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                l51 l51Var = (l51) this.f52348b;
                l51Var.getClass();
                l51Var.f49459a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f52349c).getEditField().setAlpha(l51Var.f49459a);
                ((org.telegram.ui.Components.ti) this.d).invalidate();
                return;
        }
    }
}
