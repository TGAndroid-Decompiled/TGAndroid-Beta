package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f47099a;
    public final n f47100b;

    public k(n nVar, int i10) {
        this.f47099a = i10;
        this.f47100b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47099a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f47100b;
                nVar.f47108b.d = 0.0f;
                nVar.f47112d0 = null;
                nVar.j(nVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f47100b;
                nVar2.f47108b.d = 0.0f;
                nVar2.f47112d0 = null;
                nVar2.j(nVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f47100b;
                nVar3.f47108b.d = 0.0f;
                nVar3.f47112d0 = null;
                nVar3.j(nVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f47100b;
                nVar4.f47108b.d = 0.0f;
                nVar4.f47112d0 = null;
                nVar4.j(nVar4.L);
                return;
        }
    }
}
