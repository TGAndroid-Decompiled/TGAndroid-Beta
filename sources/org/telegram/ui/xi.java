package org.telegram.ui;
public final class xi implements Runnable {
    public final int f52028a;
    public final yi f52029b;

    public xi(yi yiVar, int i3) {
        this.f52028a = i3;
        this.f52029b = yiVar;
    }

    @Override
    public final void run() {
        switch (this.f52028a) {
            case 0:
                yi yiVar = this.f52029b;
                yiVar.W = null;
                wm wmVar = yiVar.X;
                if (wmVar.f51261ba != -1) {
                    wmVar.getNotificationCenter().j(wmVar.f51261ba);
                    wmVar.f51261ba = -1;
                }
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                yi yiVar2 = this.f52029b;
                yiVar2.W = null;
                wm wmVar2 = yiVar2.X;
                if (wmVar2.f51261ba != -1) {
                    wmVar2.getNotificationCenter().j(wmVar2.f51261ba);
                    wmVar2.f51261ba = -1;
                }
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
