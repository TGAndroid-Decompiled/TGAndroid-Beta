package yh;

import org.telegram.messenger.NotificationCenter;
public final class s6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f48016a;
    public final org.telegram.ui.ActionBar.f3[] f48017b;

    public s6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f48016a = zArr;
        this.f48017b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f48016a[0] && (f3Var = this.f48017b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
