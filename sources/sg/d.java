package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f46808a;
    public final e f46809b;

    public d(e eVar, int i10) {
        this.f46808a = i10;
        this.f46809b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46808a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.f46809b;
                eVar.f46812b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.f46809b;
                eVar2.f46812b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.f46809b;
                eVar3.f46812b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.f46809b;
                eVar4.f46812b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                return;
        }
    }
}
