package rh;

import org.telegram.messenger.us;
import org.telegram.messenger.zs;
public final class j7 implements us {
    public final boolean[] f47134a;
    public final org.telegram.ui.ActionBar.z2[] f47135b;

    public j7(boolean[] zArr, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.f47134a = zArr;
        this.f47135b = z2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.z2 z2Var;
        if (i10 == zs.A3 && this.f47134a[0] && (z2Var = this.f47135b[0]) != null) {
            z2Var.dismiss();
        }
    }
}
