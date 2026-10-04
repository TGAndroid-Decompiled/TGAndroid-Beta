package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vt0;
import yh.w6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f45318a = 1;
    public final int f45319b;
    public final NotificationCenter.NotificationCenterDelegate f45320c;

    public s(int i10, w6 w6Var) {
        this.f45319b = i10;
        this.f45320c = w6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45318a) {
            case 0:
                m0 m0Var = (m0) this.f45320c;
                PhotoViewer photoViewer = ((vt0) m0Var).f41815o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                m0Var.C0(this.f45319b);
                return;
            default:
                NotificationCenter.getInstance(this.f45319b).removeObserver((w6) this.f45320c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(m0 m0Var, int i10) {
        this.f45320c = m0Var;
        this.f45319b = i10;
    }
}
