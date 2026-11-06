package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57284a;
    public final m f57285b;

    public i(m mVar, int i7) {
        this.f57284a = i7;
        this.f57285b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57284a) {
            case 0:
                m mVar = this.f57285b;
                AnimatorSet animatorSet = mVar.f57299d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57298c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57285b.l();
                return;
        }
    }
}
