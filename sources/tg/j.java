package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47536a;
    public final n f47537b;

    public j(n nVar, int i10) {
        this.f47536a = i10;
        this.f47537b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47536a) {
            case 0:
                n nVar = this.f47537b;
                AnimatorSet animatorSet = nVar.f47551d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47550c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47537b.l();
                return;
        }
    }
}
