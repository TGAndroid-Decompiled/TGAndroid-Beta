package ug;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class j implements Runnable {
    public final int f49802a;
    public final n f49803b;

    public j(n nVar, int i10) {
        this.f49802a = i10;
        this.f49803b = nVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f49802a) {
            case 0:
                n nVar = this.f49803b;
                AnimatorSet animatorSet = nVar.f49817d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = nVar.f49816c0) != null && valueAnimator.isRunning())) {
                    nVar.j(nVar.L);
                    return;
                } else {
                    nVar.n();
                    return;
                }
            default:
                this.f49803b.l();
                return;
        }
    }
}
