package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f47090a;
    public final n f47091b;

    public k(n nVar, int i10) {
        this.f47090a = i10;
        this.f47091b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47090a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f47091b;
                nVar.f47099b.d = 0.0f;
                nVar.f47103d0 = null;
                nVar.j(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f47091b;
                nVar2.f47099b.d = 0.0f;
                nVar2.f47103d0 = null;
                nVar2.j(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f47091b;
                nVar3.f47099b.d = 0.0f;
                nVar3.f47103d0 = null;
                nVar3.j(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f47091b;
                nVar4.f47099b.d = 0.0f;
                nVar4.f47103d0 = null;
                nVar4.j(nVar4.L);
                return;
        }
    }
}
