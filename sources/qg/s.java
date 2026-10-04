package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
import yh.w6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f45325a = 1;
    public final int f45326b;
    public final NotificationCenter.NotificationCenterDelegate f45327c;

    public s(int i10, w6 w6Var) {
        this.f45326b = i10;
        this.f45327c = w6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45325a) {
            case 0:
                m0 m0Var = (m0) this.f45327c;
                PhotoViewer photoViewer = ((vt0) m0Var).f41822o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f45326b);
                return;
            default:
                NotificationCenter.getInstance(this.f45326b).removeObserver((w6) this.f45327c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f45327c = m0Var;
        this.f45326b = i10;
    }
}
