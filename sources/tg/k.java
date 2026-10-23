package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f47103a;
    public final n f47104b;

    public k(n nVar, int i10) {
        this.f47103a = i10;
        this.f47104b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47103a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f47104b;
                nVar.f47112b.d = 0.0f;
                nVar.f47116d0 = null;
                nVar.j(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f47104b;
                nVar2.f47112b.d = 0.0f;
                nVar2.f47116d0 = null;
                nVar2.j(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f47104b;
                nVar3.f47112b.d = 0.0f;
                nVar3.f47116d0 = null;
                nVar3.j(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f47104b;
                nVar4.f47112b.d = 0.0f;
                nVar4.f47116d0 = null;
                nVar4.j(nVar4.L);
                return;
        }
    }
}
