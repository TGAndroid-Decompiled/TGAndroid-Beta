package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final boolean f47298a;
    public final boolean f47299b;
    public final boolean f47300c;
    public final boolean d;
    public final n e;

    public k(n nVar, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.e = nVar;
        this.f47298a = z4;
        this.f47299b = z10;
        this.f47300c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.e;
        nVar.C = false;
        if (!this.f47298a) {
            nVar.e(this.f47299b, this.f47300c, this.d, true);
        }
    }
}
