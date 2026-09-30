package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
import yh.t6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41914a = 1;
    public final int f41915b;
    public final NotificationCenter.NotificationCenterDelegate f41916c;

    public s(int i10, t6 t6Var) {
        this.f41915b = i10;
        this.f41916c = t6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41914a) {
            case 0:
                n0 n0Var = (n0) this.f41916c;
                PhotoViewer photoViewer = ((st0) n0Var).f37863o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                n0Var.C0(this.f41915b);
                return;
            default:
                NotificationCenter.getInstance(this.f41915b).removeObserver((t6) this.f41916c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(n0 n0Var, int i10) {
        this.f41916c = n0Var;
        this.f41915b = i10;
    }
}
