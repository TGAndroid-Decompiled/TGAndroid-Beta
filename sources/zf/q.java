package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q extends AnimatorListenerAdapter {
    public final int f50667a;
    public final r f50668b;
    public final s f50669c;

    public q(s sVar, r rVar, int i9) {
        this.f50667a = i9;
        this.f50669c = sVar;
        this.f50668b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50667a) {
            case 0:
                this.f50668b.f50678f = null;
                s.a(this.f50669c);
                return;
            default:
                this.f50668b.f50678f = null;
                s.a(this.f50669c);
                return;
        }
    }
}
