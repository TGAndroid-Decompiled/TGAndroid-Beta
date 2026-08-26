package org.telegram.ui.web;

import android.animation.ValueAnimator;

public final class WebActionBar$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final WebActionBar f$0;

    public WebActionBar$$ExternalSyntheticLambda2(WebActionBar webActionBar, int i) {
        this.$r8$classId = i;
        this.f$0 = webActionBar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showSearch$9(valueAnimator);
                break;
            default:
                this.f$0.lambda$showAddress$10(valueAnimator);
                break;
        }
    }
}
