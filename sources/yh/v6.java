package yh;

import org.telegram.messenger.NotificationCenter;
public final class v6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f47945a;
    public final org.telegram.ui.ActionBar.g3[] f47946b;

    public v6(boolean[] zArr, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f47945a = zArr;
        this.f47946b = g3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.g3 g3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f47945a[0] && (g3Var = this.f47946b[0]) != null) {
            g3Var.dismiss();
        }
    }
}
