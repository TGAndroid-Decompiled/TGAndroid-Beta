package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f48191a;
    public final n f48192b;

    public j(n nVar, int i10) {
        this.f48191a = i10;
        this.f48192b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f48191a) {
            case 0:
                n nVar = this.f48192b;
                AnimatorSet animatorSet = nVar.f48201a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f48192b.l();
                return;
        }
    }
}
