package yh;

import org.telegram.messenger.NotificationCenter;
public final class m6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f53107a;
    public final org.telegram.ui.ActionBar.e3[] f53108b;

    public m6(boolean[] zArr, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f53107a = zArr;
        this.f53108b = e3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.e3 e3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f53107a[0] && (e3Var = this.f53108b[0]) != null) {
            e3Var.dismiss();
        }
    }
}
