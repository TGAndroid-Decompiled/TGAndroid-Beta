package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f46257a;
    public final r f46258b;
    public final s f46259c;

    public q(s sVar, r rVar, int i10) {
        this.f46257a = i10;
        this.f46259c = sVar;
        this.f46258b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46257a) {
            case 0:
                this.f46258b.f46291f = null;
                s.a(this.f46259c);
                return;
            default:
                this.f46258b.f46291f = null;
                s.a(this.f46259c);
                return;
        }
    }
}
