package sg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f48065a;
    public final n f48066b;

    public j(n nVar, int i10) {
        this.f48065a = i10;
        this.f48066b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f48065a) {
            case 0:
                n nVar = this.f48066b;
                AnimatorSet animatorSet = nVar.f48075a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f48066b.l();
                return;
        }
    }
}
