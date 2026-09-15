package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import yh.v6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41638a = 1;
    public final int f41639b;
    public final NotificationCenter.NotificationCenterDelegate f41640c;

    public s(int i10, v6 v6Var) {
        this.f41639b = i10;
        this.f41640c = v6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41638a) {
            case 0:
                p0 p0Var = (p0) this.f41640c;
                PhotoViewer photoViewer = ((au0) p0Var).f31957o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                p0Var.B0(this.f41639b);
                return;
            default:
                NotificationCenter.getInstance(this.f41639b).removeObserver((v6) this.f41640c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(p0 p0Var, int i10) {
        this.f41640c = p0Var;
        this.f41639b = i10;
    }
}
