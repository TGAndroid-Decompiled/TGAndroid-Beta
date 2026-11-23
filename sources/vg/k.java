package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final int f59461a;
    public final n f59462b;

    public k(n nVar, int i7) {
        this.f59461a = i7;
        this.f59462b = nVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f59461a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.f59462b;
                nVar.f59470b.d = 0.0f;
                nVar.f59476e0 = null;
                nVar.j(nVar.M);
                return;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.f59462b;
                nVar2.f59470b.d = 0.0f;
                nVar2.f59476e0 = null;
                nVar2.j(nVar2.M);
                return;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.f59462b;
                nVar3.f59470b.d = 0.0f;
                nVar3.f59476e0 = null;
                nVar3.j(nVar3.M);
                return;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.f59462b;
                nVar4.f59470b.d = 0.0f;
                nVar4.f59476e0 = null;
                nVar4.j(nVar4.M);
                return;
        }
    }
}
