package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f59490a;
    public final m f59491b;

    public i(m mVar, int i7) {
        this.f59490a = i7;
        this.f59491b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f59490a) {
            case 0:
                m mVar = this.f59491b;
                AnimatorSet animatorSet = mVar.f59507e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f59505d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f59491b.l();
                return;
        }
    }
}
