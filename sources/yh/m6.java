package yh;

import org.telegram.messenger.NotificationCenter;
public final class m6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52970a;
    public final org.telegram.ui.ActionBar.e3[] f52971b;

    public m6(boolean[] zArr, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f52970a = zArr;
        this.f52971b = e3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.e3 e3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52970a[0] && (e3Var = this.f52971b[0]) != null) {
            e3Var.dismiss();
        }
    }
}
