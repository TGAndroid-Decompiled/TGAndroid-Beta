package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f48193a;
    public final n f48194b;

    public k(n nVar, int i10) {
        this.f48193a = i10;
        this.f48194b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48193a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f48194b;
                nVar.f48202b.d = 0.0f;
                nVar.f48201a0 = null;
                nVar.k(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f48194b;
                nVar2.f48202b.d = 0.0f;
                nVar2.f48201a0 = null;
                nVar2.k(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f48194b;
                nVar3.f48202b.d = 0.0f;
                nVar3.f48201a0 = null;
                nVar3.k(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f48194b;
                nVar4.f48202b.d = 0.0f;
                nVar4.f48201a0 = null;
                nVar4.k(nVar4.L);
                return;
        }
    }
}
