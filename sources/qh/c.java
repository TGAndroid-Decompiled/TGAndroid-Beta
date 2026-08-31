package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f45031a;
    public final d f45032b;

    public c(d dVar, int i10) {
        this.f45031a = i10;
        this.f45032b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45031a) {
            case 0:
                d dVar = this.f45032b;
                dVar.G = false;
                dVar.f45167e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f45032b;
                dVar2.M = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
