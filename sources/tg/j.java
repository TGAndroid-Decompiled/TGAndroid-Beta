package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47138a;
    public final n f47139b;

    public j(n nVar, int i10) {
        this.f47138a = i10;
        this.f47139b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47138a) {
            case 0:
                n nVar = this.f47139b;
                AnimatorSet animatorSet = nVar.f47153d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47152c0) != null && valueAnimator.isRunning())) {
                    nVar.l(nVar.L);
                    return;
                } else {
                    nVar.p();
                    return;
                }
            default:
                this.f47139b.n();
                return;
        }
    }
}
