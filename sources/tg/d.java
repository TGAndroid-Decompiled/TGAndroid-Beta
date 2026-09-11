package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f46515a;
    public final e f46516b;

    public d(e eVar, int i10) {
        this.f46515a = i10;
        this.f46516b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46515a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.f46516b;
                eVar.f46519b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.f46516b;
                eVar2.f46519b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.f46516b;
                eVar3.f46519b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.f46516b;
                eVar4.f46519b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                return;
        }
    }
}
