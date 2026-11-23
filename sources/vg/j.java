package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j extends AnimatorListenerAdapter {
    public final int f59581a;
    public final m f59582b;

    public j(m mVar, int i7) {
        this.f59581a = i7;
        this.f59582b = mVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f59581a) {
            case 0:
                super.onAnimationEnd(animator);
                m mVar = this.f59582b;
                mVar.f59590b.d = 0.0f;
                mVar.f59596e0 = null;
                mVar.j(mVar.M);
                return;
            case 1:
                super.onAnimationEnd(animator);
                m mVar2 = this.f59582b;
                mVar2.f59590b.d = 0.0f;
                mVar2.f59596e0 = null;
                mVar2.j(mVar2.M);
                return;
            case 2:
                super.onAnimationEnd(animator);
                m mVar3 = this.f59582b;
                mVar3.f59590b.d = 0.0f;
                mVar3.f59596e0 = null;
                mVar3.j(mVar3.M);
                return;
            default:
                super.onAnimationEnd(animator);
                m mVar4 = this.f59582b;
                mVar4.f59590b.d = 0.0f;
                mVar4.f59596e0 = null;
                mVar4.j(mVar4.M);
                return;
        }
    }
}
