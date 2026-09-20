package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f46123a;
    public final boolean f46124b;
    public final i4 f46125c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f46123a = i10;
        this.f46125c = i4Var;
        this.f46124b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46123a) {
            case 0:
                if (!this.f46124b) {
                    this.f46125c.f46210y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f46124b) {
                    this.f46125c.f46208w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
