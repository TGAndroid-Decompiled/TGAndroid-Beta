package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
import yh.x6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f45332a = 1;
    public final int f45333b;
    public final NotificationCenter.NotificationCenterDelegate f45334c;

    public s(int i10, x6 x6Var) {
        this.f45333b = i10;
        this.f45334c = x6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45332a) {
            case 0:
                m0 m0Var = (m0) this.f45334c;
                PhotoViewer photoViewer = ((vt0) m0Var).f41820o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f45333b);
                return;
            default:
                NotificationCenter.getInstance(this.f45333b).removeObserver((x6) this.f45334c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f45334c = m0Var;
        this.f45333b = i10;
    }
}
