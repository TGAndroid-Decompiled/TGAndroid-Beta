package org.telegram.ui;
public final class wj implements Runnable {
    public final int f43323a;
    public final xj f43324b;

    public wj(xj xjVar, int i10) {
        this.f43323a = i10;
        this.f43324b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f43323a) {
            case 0:
                xj xjVar = this.f43324b;
                xjVar.W = null;
                un unVar = xjVar.X;
                if (unVar.f42188aa != -1) {
                    unVar.getNotificationCenter().j(unVar.f42188aa);
                    unVar.f42188aa = -1;
                }
                if (org.telegram.messenger.v2.f18448a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f43324b;
                xjVar2.W = null;
                un unVar2 = xjVar2.X;
                if (unVar2.f42188aa != -1) {
                    unVar2.getNotificationCenter().j(unVar2.f42188aa);
                    unVar2.f42188aa = -1;
                }
                if (org.telegram.messenger.v2.f18448a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
