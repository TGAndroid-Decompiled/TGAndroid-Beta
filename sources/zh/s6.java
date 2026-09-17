package zh;

import org.telegram.messenger.NotificationCenter;
public final class s6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f52621a;
    public final org.telegram.ui.ActionBar.f3[] f52622b;

    public s6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52621a = zArr;
        this.f52622b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f52621a[0] && (f3Var = this.f52622b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
