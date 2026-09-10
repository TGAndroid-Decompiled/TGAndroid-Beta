package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r extends AnimatorListenerAdapter {
    public final int f40881a;
    public final s f40882b;
    public final t f40883c;

    public r(t tVar, s sVar, int i10) {
        this.f40881a = i10;
        this.f40883c = tVar;
        this.f40882b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40881a) {
            case 0:
                this.f40882b.f40898f = null;
                t.a(this.f40883c);
                return;
            default:
                this.f40882b.f40898f = null;
                t.a(this.f40883c);
                return;
        }
    }
}
