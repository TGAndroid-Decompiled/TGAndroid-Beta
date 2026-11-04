package wg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class i implements Runnable {
    public final int f57655a;
    public final m f57656b;

    public i(m mVar, int i3) {
        this.f57655a = i3;
        this.f57656b = mVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f57655a) {
            case 0:
                m mVar = this.f57656b;
                AnimatorSet animatorSet = mVar.f57672e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = mVar.f57670d0) != null && valueAnimator.isRunning())) {
                    mVar.j(mVar.M);
                    return;
                } else {
                    mVar.n();
                    return;
                }
            default:
                this.f57656b.l();
                return;
        }
    }
}
