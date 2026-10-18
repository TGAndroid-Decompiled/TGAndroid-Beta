package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f47088a;
    public final n f47089b;

    public j(n nVar, int i10) {
        this.f47088a = i10;
        this.f47089b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f47088a) {
            case 0:
                n nVar = this.f47089b;
                AnimatorSet animatorSet = nVar.f47103d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f47102c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f47089b.l();
                return;
        }
    }
}
