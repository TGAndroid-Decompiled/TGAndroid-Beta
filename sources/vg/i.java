package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f59451a;
    public final m f59452b;

    public i(m mVar, int i7) {
        this.f59451a = i7;
        this.f59452b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f59451a) {
            case 0:
                m mVar = this.f59452b;
                AnimatorSet animatorSet = mVar.f59468e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f59466d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f59452b.l();
                return;
        }
    }
}
