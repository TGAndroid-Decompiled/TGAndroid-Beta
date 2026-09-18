package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import yh.s6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41891a = 1;
    public final int f41892b;
    public final NotificationCenter.NotificationCenterDelegate f41893c;

    public s(int i10, s6 s6Var) {
        this.f41892b = i10;
        this.f41893c = s6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41891a) {
            case 0:
                m0 m0Var = (m0) this.f41893c;
                PhotoViewer photoViewer = ((au0) m0Var).f32142o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.B0(this.f41892b);
                return;
            default:
                NotificationCenter.getInstance(this.f41892b).removeObserver((s6) this.f41893c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f41893c = m0Var;
        this.f41892b = i10;
    }
}
