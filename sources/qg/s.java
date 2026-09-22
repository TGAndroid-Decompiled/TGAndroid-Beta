package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import yh.t6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41947a = 1;
    public final int f41948b;
    public final NotificationCenter.NotificationCenterDelegate f41949c;

    public s(int i10, t6 t6Var) {
        this.f41948b = i10;
        this.f41949c = t6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41947a) {
            case 0:
                n0 n0Var = (n0) this.f41949c;
                PhotoViewer photoViewer = ((au0) n0Var).f32177o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                n0Var.B0(this.f41948b);
                return;
            default:
                NotificationCenter.getInstance(this.f41948b).removeObserver((t6) this.f41949c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(n0 n0Var, int i10) {
        this.f41949c = n0Var;
        this.f41948b = i10;
    }
}
