package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
import yh.t6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41912a = 1;
    public final int f41913b;
    public final NotificationCenter.NotificationCenterDelegate f41914c;

    public s(int i10, t6 t6Var) {
        this.f41913b = i10;
        this.f41914c = t6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41912a) {
            case 0:
                n0 n0Var = (n0) this.f41914c;
                PhotoViewer photoViewer = ((st0) n0Var).f37863o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                n0Var.C0(this.f41913b);
                return;
            default:
                NotificationCenter.getInstance(this.f41913b).removeObserver((t6) this.f41914c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(n0 n0Var, int i10) {
        this.f41914c = n0Var;
        this.f41913b = i10;
    }
}
