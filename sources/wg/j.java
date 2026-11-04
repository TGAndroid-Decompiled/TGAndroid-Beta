package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j extends AnimatorListenerAdapter {
    public final int f57657a;
    public final m f57658b;

    public j(m mVar, int i3) {
        this.f57657a = i3;
        this.f57658b = mVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f57657a) {
            case 0:
                super.onAnimationEnd(animator);
                m mVar = this.f57658b;
                mVar.f57666b.d = 0.0f;
                mVar.f57672e0 = null;
                mVar.j(mVar.M);
                return;
            case 1:
                super.onAnimationEnd(animator);
                m mVar2 = this.f57658b;
                mVar2.f57666b.d = 0.0f;
                mVar2.f57672e0 = null;
                mVar2.j(mVar2.M);
                return;
            case 2:
                super.onAnimationEnd(animator);
                m mVar3 = this.f57658b;
                mVar3.f57666b.d = 0.0f;
                mVar3.f57672e0 = null;
                mVar3.j(mVar3.M);
                return;
            default:
                super.onAnimationEnd(animator);
                m mVar4 = this.f57658b;
                mVar4.f57666b.d = 0.0f;
                mVar4.f57672e0 = null;
                mVar4.j(mVar4.M);
                return;
        }
    }
}
