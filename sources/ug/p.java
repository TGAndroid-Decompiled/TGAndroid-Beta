package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p extends AnimatorListenerAdapter {
    public final int f58856a;
    public final q f58857b;
    public final r f58858c;

    public p(r rVar, q qVar, int i7) {
        this.f58856a = i7;
        this.f58858c = rVar;
        this.f58857b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f58856a) {
            case 0:
                this.f58857b.f58874f = null;
                r.a(this.f58858c);
                return;
            default:
                this.f58857b.f58874f = null;
                r.a(this.f58858c);
                return;
        }
    }
}
