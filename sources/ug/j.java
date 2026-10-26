package ug;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f49805a;
    public final n f49806b;

    public j(n nVar, int i10) {
        this.f49805a = i10;
        this.f49806b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f49805a) {
            case 0:
                n nVar = this.f49806b;
                AnimatorSet animatorSet = nVar.f49820d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f49819c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f49806b.l();
                return;
        }
    }
}
