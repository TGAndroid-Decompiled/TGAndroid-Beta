package yh;

import org.telegram.messenger.NotificationCenter;
public final class m6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52901a;
    public final org.telegram.ui.ActionBar.f3[] f52902b;

    public m6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52901a = zArr;
        this.f52902b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52901a[0] && (f3Var = this.f52902b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
