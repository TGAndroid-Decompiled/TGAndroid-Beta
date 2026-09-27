package yh;

import org.telegram.messenger.NotificationCenter;
public final class s6 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f48078a;
    public final org.telegram.ui.ActionBar.g3[] f48079b;

    public s6(boolean[] zArr, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f48078a = zArr;
        this.f48079b = g3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.g3 g3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f48078a[0] && (g3Var = this.f48079b[0]) != null) {
            g3Var.dismiss();
        }
    }
}
