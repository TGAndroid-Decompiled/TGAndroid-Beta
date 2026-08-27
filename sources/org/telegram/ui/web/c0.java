package org.telegram.ui.web;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y4;
import org.telegram.ui.rn;

public final class c0 implements Runnable {

    public final int f43790a;

    public final long f43791b;

    public final NotificationCenter.NotificationCenterDelegate f43792c;

    public c0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i10) {
        this.f43790a = i10;
        this.f43792c = notificationCenterDelegate;
        this.f43791b = j10;
    }

    @Override
    public final void run() {
        switch (this.f43790a) {
            case 0:
                d0 d0Var = (d0) this.f43792c;
                d0Var.getClass();
                d0Var.presentFragment(rn.R9(this.f43791b));
                break;
            case 1:
                rh.p pVar = (rh.p) this.f43792c;
                y4.M(pVar.f34900b.f28635b0.getParentActivity(), this.f43791b, new o0.b(pVar, 16), pVar.f34899a);
                break;
            default:
                rh.x1 x1Var = (rh.x1) this.f43792c;
                y4.M(x1Var.getParentActivity(), this.f43791b, new n1.d(x1Var, 18), x1Var.getResourceProvider());
                break;
        }
    }
}
