package rh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class x0 implements NotificationCenter.NotificationCenterDelegate {
    public final long f43904a;
    public final NotificationCenter.NotificationCenterDelegate[] f43905b;
    public final int f43906c;
    public final w0 d;

    public x0(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, w0 w0Var) {
        this.f43904a = j10;
        this.f43905b = notificationCenterDelegateArr;
        this.f43906c = i10;
        this.d = w0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f43904a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f43905b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f43906c).addObserver(notificationCenterDelegateArr[0], i12);
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
