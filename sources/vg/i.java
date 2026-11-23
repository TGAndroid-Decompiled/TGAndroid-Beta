package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f59494a;
    public final m f59495b;

    public i(m mVar, int i7) {
        this.f59494a = i7;
        this.f59495b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f59494a) {
            case 0:
                m mVar = this.f59495b;
                AnimatorSet animatorSet = mVar.f59511e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f59509d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f59495b.l();
                return;
        }
    }
}
