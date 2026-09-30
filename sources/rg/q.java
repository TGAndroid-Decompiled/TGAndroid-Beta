package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42727a;
    public final r f42728b;
    public final s f42729c;

    public q(s sVar, r rVar, int i10) {
        this.f42727a = i10;
        this.f42729c = sVar;
        this.f42728b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42727a) {
            case 0:
                this.f42728b.f42737f = null;
                s.a(this.f42729c);
                return;
            default:
                this.f42728b.f42737f = null;
                s.a(this.f42729c);
                return;
        }
    }
}
