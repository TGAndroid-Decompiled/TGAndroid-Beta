package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final boolean f47234a;
    public final boolean f47235b;
    public final boolean f47236c;
    public final boolean d;
    public final n e;

    public k(n nVar, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.e = nVar;
        this.f47234a = z4;
        this.f47235b = z10;
        this.f47236c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.e;
        nVar.C = false;
        if (!this.f47234a) {
            nVar.e(this.f47235b, this.f47236c, this.d, true);
        }
    }
}
