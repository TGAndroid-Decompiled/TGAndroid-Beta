package yh;

import org.telegram.messenger.NotificationCenter;
public final class u6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f47823a;
    public final org.telegram.ui.ActionBar.f3[] f47824b;

    public u6(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f47823a = zArr;
        this.f47824b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f47823a[0] && (f3Var = this.f47824b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
