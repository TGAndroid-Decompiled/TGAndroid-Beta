package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import yh.m6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f46651a = 1;
    public final int f46652b;
    public final NotificationCenter.NotificationCenterDelegate f46653c;

    public s(int i10, m6 m6Var) {
        this.f46652b = i10;
        this.f46653c = m6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46651a) {
            case 0:
                m0 m0Var = (m0) this.f46653c;
                PhotoViewer photoViewer = ((au0) m0Var).f36210o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f46652b);
                return;
            default:
                NotificationCenter.getInstance(this.f46652b).removeObserver((m6) this.f46653c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f46653c = m0Var;
        this.f46652b = i10;
    }
}
