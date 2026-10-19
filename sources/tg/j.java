package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47092a;
    public final n f47093b;

    public j(n nVar, int i10) {
        this.f47092a = i10;
        this.f47093b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47092a) {
            case 0:
                n nVar = this.f47093b;
                AnimatorSet animatorSet = nVar.f47107d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47106c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47093b.l();
                return;
        }
    }
}
