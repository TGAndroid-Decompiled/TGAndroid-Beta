package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class uq extends s4.k {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final hr G;

    public uq(hr hrVar) {
        this.G = hrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f37725c.invalidate();
    }

    @Override
    public final void P(s4.b1 b1Var) {
        this.G.f37725c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f45984p.isEmpty();
        boolean isEmpty2 = this.f45986r.isEmpty();
        boolean isEmpty3 = this.f45987s.isEmpty();
        boolean isEmpty4 = this.f45985q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
