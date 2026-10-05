package yh;

import org.telegram.messenger.NotificationCenter;
public final class x6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52239a;
    public final org.telegram.ui.ActionBar.f3[] f52240b;

    public x6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52239a = zArr;
        this.f52240b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52239a[0] && (f3Var = this.f52240b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
