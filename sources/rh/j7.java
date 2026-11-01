package rh;

import org.telegram.messenger.at;
import org.telegram.messenger.vs;
public final class j7 implements vs {
    public final boolean[] f47148a;
    public final org.telegram.ui.ActionBar.z2[] f47149b;

    public j7(boolean[] zArr, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.f47148a = zArr;
        this.f47149b = z2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.z2 z2Var;
        if (i10 == at.A3 && this.f47148a[0] && (z2Var = this.f47149b[0]) != null) {
            z2Var.dismiss();
        }
    }
}
