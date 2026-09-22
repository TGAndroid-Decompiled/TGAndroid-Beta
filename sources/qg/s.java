package qg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import yh.u6;
public final class s implements DialogInterface.OnDismissListener {
    public final int f41634a = 1;
    public final int f41635b;
    public final NotificationCenter.NotificationCenterDelegate f41636c;

    public s(int i10, u6 u6Var) {
        this.f41635b = i10;
        this.f41636c = u6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41634a) {
            case 0:
                p0 p0Var = (p0) this.f41636c;
                PhotoViewer photoViewer = ((au0) p0Var).f31940o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                p0Var.C0(this.f41635b);
                return;
            default:
                NotificationCenter.getInstance(this.f41635b).removeObserver((u6) this.f41636c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public s(p0 p0Var, int i10) {
        this.f41636c = p0Var;
        this.f41635b = i10;
    }
}
