package yh;

import org.telegram.messenger.NotificationCenter;
public final class w6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52174a;
    public final org.telegram.ui.ActionBar.f3[] f52175b;

    public w6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52174a = zArr;
        this.f52175b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52174a[0] && (f3Var = this.f52175b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
