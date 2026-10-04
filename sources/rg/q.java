package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46242a;
    public final r f46243b;
    public final s f46244c;

    public q(s sVar, r rVar, int i10) {
        this.f46242a = i10;
        this.f46244c = sVar;
        this.f46243b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46242a) {
            case 0:
                this.f46243b.f46276f = null;
                s.a(this.f46244c);
                return;
            default:
                this.f46243b.f46276f = null;
                s.a(this.f46244c);
                return;
        }
    }
}
