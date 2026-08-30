package rh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class y0 implements NotificationCenter.NotificationCenterDelegate {
    public final long f43852a;
    public final NotificationCenter.NotificationCenterDelegate[] f43853b;
    public final int f43854c;
    public final x0 d;

    public y0(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, x0 x0Var) {
        this.f43852a = j10;
        this.f43853b = notificationCenterDelegateArr;
        this.f43854c = i10;
        this.d = x0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f43852a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f43853b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f43854c).addObserver(notificationCenterDelegateArr[0], i12);
                    notificationCenterDelegateArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.run(webPage);
            }
        }
    }
}
