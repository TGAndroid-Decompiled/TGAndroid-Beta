package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f49922a;
    public final boolean f49923b;
    public final i4 f49924c;

    public c3(i4 i4Var, boolean z10, int i10) {
        this.f49922a = i10;
        this.f49924c = i4Var;
        this.f49923b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49922a) {
            case 0:
                if (!this.f49923b) {
                    this.f49924c.f50034y.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!this.f49923b) {
                    this.f49924c.f50032w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
