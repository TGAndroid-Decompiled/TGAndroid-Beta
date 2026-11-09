package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57413a;
    public final m f57414b;

    public i(m mVar, int i7) {
        this.f57413a = i7;
        this.f57414b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57413a) {
            case 0:
                m mVar = this.f57414b;
                AnimatorSet animatorSet = mVar.f57428d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57427c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57414b.l();
                return;
        }
    }
}
