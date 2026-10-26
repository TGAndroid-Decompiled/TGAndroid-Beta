package org.telegram.ui;

import org.telegram.messenger.AnimationNotificationsLocker;
public final class xq extends s4.l {
    public final AnimationNotificationsLocker F = new AnimationNotificationsLocker();
    public final kr G;

    public xq(kr krVar) {
        this.G = krVar;
    }

    @Override
    public final void N() {
        this.F.unlock();
    }

    @Override
    public final void O() {
        this.G.f41010c.invalidate();
    }

    @Override
    public final void P(s4.e1 e1Var) {
        this.G.f41010c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47788p.isEmpty();
        boolean isEmpty2 = this.f47790r.isEmpty();
        boolean isEmpty3 = this.f47791s.isEmpty();
        boolean isEmpty4 = this.f47789q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.lock();
        }
        super.m();
    }
}
