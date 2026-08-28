package tf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final boolean f47890a;
    public final boolean f47891b;
    public final boolean f47892c;
    public final boolean d;
    public final n f47893e;

    public k(n nVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f47893e = nVar;
        this.f47890a = z10;
        this.f47891b = z11;
        this.f47892c = z12;
        this.d = z13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f47893e;
        nVar.B = false;
        if (!this.f47890a) {
            nVar.e(this.f47891b, this.f47892c, this.d, true);
        }
    }
}
