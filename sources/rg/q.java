package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42441a;
    public final r f42442b;
    public final s f42443c;

    public q(s sVar, r rVar, int i10) {
        this.f42441a = i10;
        this.f42443c = sVar;
        this.f42442b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42441a) {
            case 0:
                this.f42442b.f42449f = null;
                s.a(this.f42443c);
                return;
            default:
                this.f42442b.f42449f = null;
                s.a(this.f42443c);
                return;
        }
    }
}
