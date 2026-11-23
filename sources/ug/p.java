package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f58860a;
    public final q f58861b;
    public final r f58862c;

    public p(r rVar, q qVar, int i7) {
        this.f58860a = i7;
        this.f58862c = rVar;
        this.f58861b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58860a) {
            case 0:
                this.f58861b.f58878f = null;
                r.a(this.f58862c);
                return;
            default:
                this.f58861b.f58878f = null;
                r.a(this.f58862c);
                return;
        }
    }
}
