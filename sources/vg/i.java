package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57309a;
    public final m f57310b;

    public i(m mVar, int i7) {
        this.f57309a = i7;
        this.f57310b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57309a) {
            case 0:
                m mVar = this.f57310b;
                AnimatorSet animatorSet = mVar.f57324d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57323c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57310b.l();
                return;
        }
    }
}
