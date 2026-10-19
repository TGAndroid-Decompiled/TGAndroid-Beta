package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47090a;
    public final n f47091b;

    public j(n nVar, int i10) {
        this.f47090a = i10;
        this.f47091b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47090a) {
            case 0:
                n nVar = this.f47091b;
                AnimatorSet animatorSet = nVar.f47105d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47104c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47091b.l();
                return;
        }
    }
}
