package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;
import yh.m6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f46540a = 1;
    public final int f46541b;
    public final NotificationCenter.NotificationCenterDelegate f46542c;

    public s(int i10, m6 m6Var) {
        this.f46541b = i10;
        this.f46542c = m6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46540a) {
            case 0:
                m0 m0Var = (m0) this.f46542c;
                PhotoViewer photoViewer = ((bu0) m0Var).f36434o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f46541b);
                return;
            default:
                NotificationCenter.getInstance(this.f46541b).removeObserver((m6) this.f46542c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f46542c = m0Var;
        this.f46541b = i10;
    }
}
