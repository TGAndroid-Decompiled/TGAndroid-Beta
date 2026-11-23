package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f59579a;
    public final m f59580b;

    public i(m mVar, int i7) {
        this.f59579a = i7;
        this.f59580b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f59579a) {
            case 0:
                m mVar = this.f59580b;
                AnimatorSet animatorSet = mVar.f59596e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f59594d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f59580b.l();
                return;
        }
    }
}
