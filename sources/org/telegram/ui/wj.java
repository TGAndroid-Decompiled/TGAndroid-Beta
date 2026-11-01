package org.telegram.ui;
public final class wj implements Runnable {
    public final int f43121a;
    public final xj f43122b;

    public wj(xj xjVar, int i10) {
        this.f43121a = i10;
        this.f43122b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f43121a) {
            case 0:
                xj xjVar = this.f43122b;
                xjVar.W = null;
                un unVar = xjVar.X;
                if (unVar.f41998aa != -1) {
                    unVar.getNotificationCenter().j(unVar.f41998aa);
                    unVar.f41998aa = -1;
                }
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f43122b;
                xjVar2.W = null;
                un unVar2 = xjVar2.X;
                if (unVar2.f41998aa != -1) {
                    unVar2.getNotificationCenter().j(unVar2.f41998aa);
                    unVar2.f41998aa = -1;
                }
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
