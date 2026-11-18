package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.RectF;
public final class su0 extends v4.k {
    public int F = -1;
    public final ProfileActivity G;

    public su0(ProfileActivity profileActivity) {
        this.G = profileActivity;
    }

    @Override
    public final long K(long j3, long j10, long j11) {
        return 0L;
    }

    @Override
    public final void N() {
        org.telegram.messenger.g0.g3(new ru0(this, 0));
    }

    @Override
    public final void P(v4.f1 f1Var) {
        RectF rectF = ProfileActivity.Z6;
        this.G.s5();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f59170p.isEmpty();
        boolean isEmpty2 = this.f59172r.isEmpty();
        boolean isEmpty3 = this.f59173s.isEmpty();
        boolean isEmpty4 = this.f59171q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a3(this, 24));
            ofFloat.setDuration(this.f59196e);
            ofFloat.start();
            this.F = this.G.getNotificationCenter().q(null, this.F, true);
        }
        super.m();
    }
}
