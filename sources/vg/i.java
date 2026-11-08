package vg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57400a;
    public final m f57401b;

    public i(m mVar, int i7) {
        this.f57400a = i7;
        this.f57401b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57400a) {
            case 0:
                m mVar = this.f57401b;
                AnimatorSet animatorSet = mVar.f57415d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57414c0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.L);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57401b.l();
                return;
        }
    }
}
