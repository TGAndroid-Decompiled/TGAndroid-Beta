package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f49030a;
    public final r f49031b;
    public final s f49032c;

    public q(s sVar, r rVar, int i10) {
        this.f49030a = i10;
        this.f49032c = sVar;
        this.f49031b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49030a) {
            case 0:
                this.f49031b.f49055f = null;
                s.a(this.f49032c);
                return;
            default:
                this.f49031b.f49055f = null;
                s.a(this.f49032c);
                return;
        }
    }
}
