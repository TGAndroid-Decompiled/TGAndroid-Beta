package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f42885a;
    public final e f42886b;

    public d(e eVar, int i10) {
        this.f42885a = i10;
        this.f42886b = eVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42885a) {
            case 0:
                super.onAnimationEnd(animator);
                e eVar = this.f42886b;
                eVar.f42889b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 1:
                super.onAnimationEnd(animator);
                e eVar2 = this.f42886b;
                eVar2.f42889b.d = 0.0f;
                eVar2.T = null;
                eVar2.h(eVar2.I);
                return;
            case 2:
                super.onAnimationEnd(animator);
                e eVar3 = this.f42886b;
                eVar3.f42889b.d = 0.0f;
                eVar3.T = null;
                eVar3.h(eVar3.I);
                return;
            default:
                super.onAnimationEnd(animator);
                e eVar4 = this.f42886b;
                eVar4.f42889b.d = 0.0f;
                eVar4.T = null;
                eVar4.h(eVar4.I);
                return;
        }
    }
}
