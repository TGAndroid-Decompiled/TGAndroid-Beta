package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46817a;
    public final r f46818b;
    public final s f46819c;

    public q(s sVar, r rVar, int i10) {
        this.f46817a = i10;
        this.f46819c = sVar;
        this.f46818b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46817a) {
            case 0:
                this.f46818b.f46840f = null;
                s.a(this.f46819c);
                return;
            default:
                this.f46818b.f46840f = null;
                s.a(this.f46819c);
                return;
        }
    }
}
