package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w3 extends AnimatorListenerAdapter {
    public final int f47642a;
    public final y3 f47643b;

    public w3(y3 y3Var, int i10) {
        this.f47642a = i10;
        this.f47643b = y3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47642a) {
            case 0:
                this.f47643b.f47738g0 = false;
                return;
            case 1:
                this.f47643b.f47738g0 = false;
                return;
            case 2:
                this.f47643b.O.setVisibility(4);
                return;
            case 3:
                y3 y3Var = this.f47643b;
                y3Var.f47755v0 = y3Var.f47754u0;
                y3Var.d(y3Var.f47729a0);
                return;
            default:
                y3 y3Var2 = this.f47643b;
                y3Var2.f47757w0 = 1.0f;
                y3Var2.f47730b.setScaleX(1.0f);
                y3Var2.f47730b.setScaleY(y3Var2.f47757w0);
                y3Var2.invalidate();
                return;
        }
    }
}
