package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f49906a;
    public final boolean f49907b;
    public final i4 f49908c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f49906a = i10;
        this.f49908c = i4Var;
        this.f49907b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49906a) {
            case 0:
                if (!this.f49907b) {
                    this.f49908c.f50018y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f49907b) {
                    this.f49908c.f50016w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
