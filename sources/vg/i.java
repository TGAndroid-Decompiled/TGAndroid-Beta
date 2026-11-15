package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f58882a;
    public final m f58883b;

    public i(m mVar, int i7) {
        this.f58882a = i7;
        this.f58883b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f58882a) {
            case 0:
                m mVar = this.f58883b;
                AnimatorSet animatorSet = mVar.f58899e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f58897d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f58883b.l();
                return;
        }
    }
}
