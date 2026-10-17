package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47116a;
    public final n f47117b;

    public j(n nVar, int i10) {
        this.f47116a = i10;
        this.f47117b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47116a) {
            case 0:
                n nVar = this.f47117b;
                AnimatorSet animatorSet = nVar.f47126a0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.W) != null && valueAnimator.isRunning())) {
                    nVar.k(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47117b.l();
                return;
        }
    }
}
