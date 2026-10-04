package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46250a;
    public final r f46251b;
    public final s f46252c;

    public q(s sVar, r rVar, int i10) {
        this.f46250a = i10;
        this.f46252c = sVar;
        this.f46251b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46250a) {
            case 0:
                this.f46251b.f46284f = null;
                s.a(this.f46252c);
                return;
            default:
                this.f46251b.f46284f = null;
                s.a(this.f46252c);
                return;
        }
    }
}
