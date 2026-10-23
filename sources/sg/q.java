package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46384a;
    public final r f46385b;
    public final s f46386c;

    public q(s sVar, r rVar, int i10) {
        this.f46384a = i10;
        this.f46386c = sVar;
        this.f46385b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46384a) {
            case 0:
                this.f46385b.f46412f = null;
                s.a(this.f46386c);
                return;
            default:
                this.f46385b.f46412f = null;
                s.a(this.f46386c);
                return;
        }
    }
}
