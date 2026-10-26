package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f48995a;
    public final r f48996b;
    public final s f48997c;

    public q(s sVar, r rVar, int i10) {
        this.f48995a = i10;
        this.f48997c = sVar;
        this.f48996b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48995a) {
            case 0:
                this.f48996b.f49020f = null;
                s.a(this.f48997c);
                return;
            default:
                this.f48996b.f49020f = null;
                s.a(this.f48997c);
                return;
        }
    }
}
