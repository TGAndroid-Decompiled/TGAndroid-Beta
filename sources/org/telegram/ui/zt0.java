package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zt0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44090a;
    public final Object f44091b;
    public final View f44092c;
    public final Object d;

    public zt0(int i10, ViewGroup viewGroup, Object obj, Object obj2) {
        this.f44090a = i10;
        this.f44091b = obj;
        this.f44092c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f44090a) {
            case 0:
                cu0 cu0Var = (cu0) this.f44091b;
                PremiumPreviewFragment premiumPreviewFragment = cu0Var.f36413n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f44092c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != cu0Var.e) {
                        if (childAt == cu0Var.f36411c) {
                            L = 0.0f - (org.telegram.messenger.i0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.i0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                b71 b71Var = (b71) this.f44091b;
                b71Var.getClass();
                b71Var.f35971a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f44092c).getEditField().setAlpha(b71Var.f35971a);
                ((ih.e) this.d).invalidate();
                return;
        }
    }
}
