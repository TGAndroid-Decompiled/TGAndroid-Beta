package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tt0;
import yh.t6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41590a = 1;
    public final int f41591b;
    public final NotificationCenter.NotificationCenterDelegate f41592c;

    public s(int i10, t6 t6Var) {
        this.f41591b = i10;
        this.f41592c = t6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41590a) {
            case 0:
                p0 p0Var = (p0) this.f41592c;
                PhotoViewer photoViewer = ((tt0) p0Var).f37756o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                p0Var.C0(this.f41591b);
                return;
            default:
                NotificationCenter.getInstance(this.f41591b).removeObserver((t6) this.f41592c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(p0 p0Var, int i10) {
        this.f41592c = p0Var;
        this.f41591b = i10;
    }
}
