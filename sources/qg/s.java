package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.st0;
import yh.t6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f42013a = 1;
    public final int f42014b;
    public final NotificationCenter.NotificationCenterDelegate f42015c;

    public s(int i10, t6 t6Var) {
        this.f42014b = i10;
        this.f42015c = t6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42013a) {
            case 0:
                n0 n0Var = (n0) this.f42015c;
                PhotoViewer photoViewer = ((st0) n0Var).f37971o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                n0Var.B0(this.f42014b);
                return;
            default:
                NotificationCenter.getInstance(this.f42014b).removeObserver((t6) this.f42015c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(n0 n0Var, int i10) {
        this.f42015c = n0Var;
        this.f42014b = i10;
    }
}
