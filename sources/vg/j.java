package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j extends AnimatorListenerAdapter {
    public final int f57402a;
    public final m f57403b;

    public j(m mVar, int i7) {
        this.f57402a = i7;
        this.f57403b = mVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57402a) {
            case 0:
                super.onAnimationEnd(animator);
                m mVar = this.f57403b;
                mVar.f57411b.d = 0.0f;
                mVar.f57415d0 = null;
                mVar.j(mVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                m mVar2 = this.f57403b;
                mVar2.f57411b.d = 0.0f;
                mVar2.f57415d0 = null;
                mVar2.j(mVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                m mVar3 = this.f57403b;
                mVar3.f57411b.d = 0.0f;
                mVar3.f57415d0 = null;
                mVar3.j(mVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                m mVar4 = this.f57403b;
                mVar4.f57411b.d = 0.0f;
                mVar4.f57415d0 = null;
                mVar4.j(mVar4.L);
                return;
        }
    }
}
