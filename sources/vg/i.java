package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f59452a;
    public final m f59453b;

    public i(m mVar, int i7) {
        this.f59452a = i7;
        this.f59453b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f59452a) {
            case 0:
                m mVar = this.f59453b;
                AnimatorSet animatorSet = mVar.f59469e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f59467d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f59453b.l();
                return;
        }
    }
}
