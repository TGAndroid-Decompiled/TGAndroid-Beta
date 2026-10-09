package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f48069a;
    public final n f48070b;

    public k(n nVar, int i10) {
        this.f48069a = i10;
        this.f48070b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48069a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f48070b;
                nVar.f48078b.d = 0.0f;
                nVar.f48077a0 = null;
                nVar.k(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f48070b;
                nVar2.f48078b.d = 0.0f;
                nVar2.f48077a0 = null;
                nVar2.k(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f48070b;
                nVar3.f48078b.d = 0.0f;
                nVar3.f48077a0 = null;
                nVar3.k(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f48070b;
                nVar4.f48078b.d = 0.0f;
                nVar4.f48077a0 = null;
                nVar4.k(nVar4.L);
                return;
        }
    }
}
