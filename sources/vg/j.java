package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j extends AnimatorListenerAdapter {
    public final int f58884a;
    public final m f58885b;

    public j(m mVar, int i7) {
        this.f58884a = i7;
        this.f58885b = mVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58884a) {
            case 0:
                super.onAnimationEnd(animator);
                m mVar = this.f58885b;
                mVar.f58893b.d = 0.0f;
                mVar.f58899e0 = null;
                mVar.j(mVar.M);
                return;
            case 1:
                super.onAnimationEnd(animator);
                m mVar2 = this.f58885b;
                mVar2.f58893b.d = 0.0f;
                mVar2.f58899e0 = null;
                mVar2.j(mVar2.M);
                return;
            case 2:
                super.onAnimationEnd(animator);
                m mVar3 = this.f58885b;
                mVar3.f58893b.d = 0.0f;
                mVar3.f58899e0 = null;
                mVar3.j(mVar3.M);
                return;
            default:
                super.onAnimationEnd(animator);
                m mVar4 = this.f58885b;
                mVar4.f58893b.d = 0.0f;
                mVar4.f58899e0 = null;
                mVar4.j(mVar4.M);
                return;
        }
    }
}
