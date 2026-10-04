package yh;

import org.telegram.messenger.NotificationCenter;
public final class w6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52169a;
    public final org.telegram.ui.ActionBar.f3[] f52170b;

    public w6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52169a = zArr;
        this.f52170b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52169a[0] && (f3Var = this.f52170b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
