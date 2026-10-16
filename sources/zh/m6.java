package zh;

import org.telegram.messenger.NotificationCenter;
public final class m6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f50838a;
    public final org.telegram.ui.ActionBar.e3[] f50839b;

    public m6(boolean[] zArr, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f50838a = zArr;
        this.f50839b = e3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.e3 e3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f50838a[0] && (e3Var = this.f50839b[0]) != null) {
            e3Var.dismiss();
        }
    }
}
