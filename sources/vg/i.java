package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57308a;
    public final m f57309b;

    public i(m mVar, int i7) {
        this.f57308a = i7;
        this.f57309b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57308a) {
            case 0:
                m mVar = this.f57309b;
                AnimatorSet animatorSet = mVar.f57323d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57322c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57309b.l();
                return;
        }
    }
}
