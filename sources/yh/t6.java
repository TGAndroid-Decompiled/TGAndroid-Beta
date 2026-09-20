package yh;

import org.telegram.messenger.NotificationCenter;
public final class t6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f48083a;
    public final org.telegram.ui.ActionBar.f3[] f48084b;

    public t6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f48083a = zArr;
        this.f48084b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f48083a[0] && (f3Var = this.f48084b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
