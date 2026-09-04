package zh;

import org.telegram.messenger.NotificationCenter;
public final class s6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52589a;
    public final org.telegram.ui.ActionBar.f3[] f52590b;

    public s6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52589a = zArr;
        this.f52590b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52589a[0] && (f3Var = this.f52590b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
