package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47535a;
    public final n f47536b;

    public j(n nVar, int i10) {
        this.f47535a = i10;
        this.f47536b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47535a) {
            case 0:
                n nVar = this.f47536b;
                AnimatorSet animatorSet = nVar.f47550d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47549c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47536b.l();
                return;
        }
    }
}
