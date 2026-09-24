package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
import yh.t6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41898a = 1;
    public final int f41899b;
    public final NotificationCenter.NotificationCenterDelegate f41900c;

    public s(int i10, t6 t6Var) {
        this.f41899b = i10;
        this.f41900c = t6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41898a) {
            case 0:
                n0 n0Var = (n0) this.f41900c;
                PhotoViewer photoViewer = ((st0) n0Var).f37846o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                n0Var.C0(this.f41899b);
                return;
            default:
                NotificationCenter.getInstance(this.f41899b).removeObserver((t6) this.f41900c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(n0 n0Var, int i10) {
        this.f41900c = n0Var;
        this.f41899b = i10;
    }
}
