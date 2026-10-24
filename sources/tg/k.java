package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f47537a;
    public final n f47538b;

    public k(n nVar, int i10) {
        this.f47537a = i10;
        this.f47538b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47537a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f47538b;
                nVar.f47546b.d = 0.0f;
                nVar.f47550d0 = null;
                nVar.j(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f47538b;
                nVar2.f47546b.d = 0.0f;
                nVar2.f47550d0 = null;
                nVar2.j(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f47538b;
                nVar3.f47546b.d = 0.0f;
                nVar3.f47550d0 = null;
                nVar3.j(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f47538b;
                nVar4.f47546b.d = 0.0f;
                nVar4.f47550d0 = null;
                nVar4.j(nVar4.L);
                return;
        }
    }
}
