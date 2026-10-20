package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47097a;
    public final n f47098b;

    public j(n nVar, int i10) {
        this.f47097a = i10;
        this.f47098b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47097a) {
            case 0:
                n nVar = this.f47098b;
                AnimatorSet animatorSet = nVar.f47112d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47111c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47098b.l();
                return;
        }
    }
}
