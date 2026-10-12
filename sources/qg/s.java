package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;
import yh.m6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f46485a = 1;
    public final int f46486b;
    public final NotificationCenter.NotificationCenterDelegate f46487c;

    public s(int i10, m6 m6Var) {
        this.f46486b = i10;
        this.f46487c = m6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46485a) {
            case 0:
                m0 m0Var = (m0) this.f46487c;
                PhotoViewer photoViewer = ((cu0) m0Var).f36519o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f46486b);
                return;
            default:
                NotificationCenter.getInstance(this.f46486b).removeObserver((m6) this.f46487c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f46487c = m0Var;
        this.f46486b = i10;
    }
}
