package org.telegram.ui.web;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y4;
import org.telegram.ui.qn;
public final class b0 implements Runnable {
    public final int f43803a;
    public final long f43804b;
    public final NotificationCenter.NotificationCenterDelegate f43805c;

    public b0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i9) {
        this.f43803a = i9;
        this.f43805c = notificationCenterDelegate;
        this.f43804b = j10;
    }

    @Override
    public final void run() {
        switch (this.f43803a) {
            case 0:
                c0 c0Var = (c0) this.f43805c;
                c0Var.getClass();
                c0Var.presentFragment(qn.R9(this.f43804b));
                return;
            case 1:
                qh.p pVar = (qh.p) this.f43805c;
                y4.M(pVar.f27493b.f30099b0.getParentActivity(), this.f43804b, new n5.a0(pVar, 13), pVar.f27492a);
                return;
            default:
                qh.x1 x1Var = (qh.x1) this.f43805c;
                y4.M(x1Var.getParentActivity(), this.f43804b, new m5.c0(x1Var, 21), x1Var.getResourceProvider());
                return;
        }
    }
}
