package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
import yh.s6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41951a = 1;
    public final int f41952b;
    public final NotificationCenter.NotificationCenterDelegate f41953c;

    public s(int i10, s6 s6Var) {
        this.f41952b = i10;
        this.f41953c = s6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41951a) {
            case 0:
                m0 m0Var = (m0) this.f41953c;
                PhotoViewer photoViewer = ((vt0) m0Var).f38703o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.B0(this.f41952b);
                return;
            default:
                NotificationCenter.getInstance(this.f41952b).removeObserver((s6) this.f41953c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f41953c = m0Var;
        this.f41952b = i10;
    }
}
