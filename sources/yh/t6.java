package yh;

import org.telegram.messenger.NotificationCenter;
public final class t6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f47754a;
    public final org.telegram.ui.ActionBar.f3[] f47755b;

    public t6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f47754a = zArr;
        this.f47755b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f47754a[0] && (f3Var = this.f47755b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
