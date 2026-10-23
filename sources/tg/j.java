package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47101a;
    public final n f47102b;

    public j(n nVar, int i10) {
        this.f47101a = i10;
        this.f47102b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47101a) {
            case 0:
                n nVar = this.f47102b;
                AnimatorSet animatorSet = nVar.f47116d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47115c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47102b.l();
                return;
        }
    }
}
