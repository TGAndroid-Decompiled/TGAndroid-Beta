package yh;

import org.telegram.messenger.NotificationCenter;
public final class v6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f47917a;
    public final org.telegram.ui.ActionBar.f3[] f47918b;

    public v6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f47917a = zArr;
        this.f47918b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f47917a[0] && (f3Var = this.f47918b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
