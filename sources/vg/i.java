package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57409a;
    public final m f57410b;

    public i(m mVar, int i7) {
        this.f57409a = i7;
        this.f57410b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57409a) {
            case 0:
                m mVar = this.f57410b;
                AnimatorSet animatorSet = mVar.f57424d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57423c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57410b.l();
                return;
        }
    }
}
