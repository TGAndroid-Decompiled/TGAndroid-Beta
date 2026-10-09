package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f48067a;
    public final n f48068b;

    public j(n nVar, int i10) {
        this.f48067a = i10;
        this.f48068b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f48067a) {
            case 0:
                n nVar = this.f48068b;
                AnimatorSet animatorSet = nVar.f48077a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f48068b.l();
                return;
        }
    }
}
