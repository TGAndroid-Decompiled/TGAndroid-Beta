package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37511a;
    public final Object f37512b;
    public final View f37513c;
    public final Object d;

    public qw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f37511a = i10;
        this.f37512b = obj;
        this.f37513c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f37511a) {
            case 0:
                vw0 vw0Var = (vw0) this.f37512b;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f39214n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f37513c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.R.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i10);
                    if (childAt != vw0Var.e) {
                        if (childAt == vw0Var.f39212c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ya1 ya1Var = (ya1) this.f37512b;
                ya1Var.getClass();
                ya1Var.f40197a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f37513c).getEditField().setAlpha(ya1Var.f40197a);
                ((org.telegram.ui.Components.ki) this.d).invalidate();
                return;
        }
    }
}
