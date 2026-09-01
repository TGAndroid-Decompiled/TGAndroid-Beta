package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k extends AnimatorListenerAdapter {
    public final boolean f51152a;
    public final boolean f51153b;
    public final boolean f51154c;
    public final boolean d;
    public final n f51155e;

    public k(n nVar, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f51155e = nVar;
        this.f51152a = z4;
        this.f51153b = z10;
        this.f51154c = z11;
        this.d = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f51155e;
        nVar.C = false;
        if (!this.f51152a) {
            nVar.e(this.f51153b, this.f51154c, this.d, true);
        }
    }
}
