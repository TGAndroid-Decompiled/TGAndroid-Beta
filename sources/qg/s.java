package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
import yh.t6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41913a = 1;
    public final int f41914b;
    public final NotificationCenter.NotificationCenterDelegate f41915c;

    public s(int i10, t6 t6Var) {
        this.f41914b = i10;
        this.f41915c = t6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41913a) {
            case 0:
                n0 n0Var = (n0) this.f41915c;
                PhotoViewer photoViewer = ((st0) n0Var).f37864o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                n0Var.C0(this.f41914b);
                return;
            default:
                NotificationCenter.getInstance(this.f41914b).removeObserver((t6) this.f41915c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(n0 n0Var, int i10) {
        this.f41915c = n0Var;
        this.f41914b = i10;
    }
}
