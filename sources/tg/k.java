package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f47140a;
    public final n f47141b;

    public k(n nVar, int i10) {
        this.f47140a = i10;
        this.f47141b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47140a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f47141b;
                nVar.f47149b.d = 0.0f;
                nVar.f47153d0 = null;
                nVar.l(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f47141b;
                nVar2.f47149b.d = 0.0f;
                nVar2.f47153d0 = null;
                nVar2.l(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f47141b;
                nVar3.f47149b.d = 0.0f;
                nVar3.f47153d0 = null;
                nVar3.l(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f47141b;
                nVar4.f47149b.d = 0.0f;
                nVar4.f47153d0 = null;
                nVar4.l(nVar4.L);
                return;
        }
    }
}
