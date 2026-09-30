package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f42833a;
    public final r f42834b;
    public final s f42835c;

    public q(s sVar, r rVar, int i10) {
        this.f42833a = i10;
        this.f42835c = sVar;
        this.f42834b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42833a) {
            case 0:
                this.f42834b.f42843f = null;
                s.a(this.f42835c);
                return;
            default:
                this.f42834b.f42843f = null;
                s.a(this.f42835c);
                return;
        }
    }
}
