package yh;

import org.telegram.messenger.NotificationCenter;
public final class t6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f48063a;
    public final org.telegram.ui.ActionBar.e3[] f48064b;

    public t6(boolean[] zArr, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f48063a = zArr;
        this.f48064b = e3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.e3 e3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f48063a[0] && (e3Var = this.f48064b[0]) != null) {
            e3Var.dismiss();
        }
    }
}
