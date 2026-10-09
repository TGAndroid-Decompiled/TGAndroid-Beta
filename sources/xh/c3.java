package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f51196a;
    public final boolean f51197b;
    public final i4 f51198c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f51196a = i10;
        this.f51198c = i4Var;
        this.f51197b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51196a) {
            case 0:
                if (!this.f51197b) {
                    this.f51198c.f51292y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f51197b) {
                    this.f51198c.f51290w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
