package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f48157a;
    public final n f48158b;

    public j(n nVar, int i10) {
        this.f48157a = i10;
        this.f48158b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f48157a) {
            case 0:
                n nVar = this.f48158b;
                AnimatorSet animatorSet = nVar.f48167a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f48158b.l();
                return;
        }
    }
}
