package yh;

import org.telegram.messenger.NotificationCenter;
public final class m6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52903a;
    public final org.telegram.ui.ActionBar.f3[] f52904b;

    public m6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52903a = zArr;
        this.f52904b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52903a[0] && (f3Var = this.f52904b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
