package xh;

import org.telegram.messenger.NotificationCenter;
public final class v6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f46198a;
    public final org.telegram.ui.ActionBar.h3[] f46199b;

    public v6(boolean[] zArr, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f46198a = zArr;
        this.f46199b = h3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.h3 h3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f46198a[0] && (h3Var = this.f46199b[0]) != null) {
            h3Var.dismiss();
        }
    }
}
