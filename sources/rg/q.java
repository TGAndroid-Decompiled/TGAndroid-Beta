package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42726a;
    public final r f42727b;
    public final s f42728c;

    public q(s sVar, r rVar, int i10) {
        this.f42726a = i10;
        this.f42728c = sVar;
        this.f42727b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42726a) {
            case 0:
                this.f42727b.f42736f = null;
                s.a(this.f42728c);
                return;
            default:
                this.f42727b.f42736f = null;
                s.a(this.f42728c);
                return;
        }
    }
}
