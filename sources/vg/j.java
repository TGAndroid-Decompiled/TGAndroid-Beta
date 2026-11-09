package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j extends AnimatorListenerAdapter {
    public final int f57415a;
    public final m f57416b;

    public j(m mVar, int i7) {
        this.f57415a = i7;
        this.f57416b = mVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57415a) {
            case 0:
                super.onAnimationEnd(animator);
                m mVar = this.f57416b;
                mVar.f57424b.d = 0.0f;
                mVar.f57428d0 = null;
                mVar.j(mVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                m mVar2 = this.f57416b;
                mVar2.f57424b.d = 0.0f;
                mVar2.f57428d0 = null;
                mVar2.j(mVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                m mVar3 = this.f57416b;
                mVar3.f57424b.d = 0.0f;
                mVar3.f57428d0 = null;
                mVar3.j(mVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                m mVar4 = this.f57416b;
                mVar4.f57424b.d = 0.0f;
                mVar4.f57428d0 = null;
                mVar4.j(mVar4.L);
                return;
        }
    }
}
