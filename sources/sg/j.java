package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f48306a;
    public final n f48307b;

    public j(n nVar, int i10) {
        this.f48306a = i10;
        this.f48307b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f48306a) {
            case 0:
                n nVar = this.f48307b;
                AnimatorSet animatorSet = nVar.f48316a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f48307b.l();
                return;
        }
    }
}
