package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57401a;
    public final m f57402b;

    public i(m mVar, int i7) {
        this.f57401a = i7;
        this.f57402b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57401a) {
            case 0:
                m mVar = this.f57402b;
                AnimatorSet animatorSet = mVar.f57416d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57415c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57402b.l();
                return;
        }
    }
}
