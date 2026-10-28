package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class zq extends s4.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final mr G;

    public zq(mr mrVar) {
        this.G = mrVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f41508c.invalidate();
    }

    @Override
    public final void P(s4.e1 e1Var) {
        this.G.f41508c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47823p.isEmpty();
        boolean isEmpty2 = this.f47825r.isEmpty();
        boolean isEmpty3 = this.f47826s.isEmpty();
        boolean isEmpty4 = this.f47824q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
