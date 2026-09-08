package rg;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zt0;
import zh.s6;
public final class t implements DialogInterface.OnDismissListener {
    public final int f45513a = 1;
    public final int f45514b;
    public final NotificationCenter.NotificationCenterDelegate f45515c;

    public t(int i10, s6 s6Var) {
        this.f45514b = i10;
        this.f45515c = s6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45513a) {
            case 0:
                o0 o0Var = (o0) this.f45515c;
                PhotoViewer photoViewer = ((zt0) o0Var).f43542o2;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.u0();
                    photoViewer.F2.C();
                }
                o0Var.B0(this.f45514b);
                return;
            default:
                NotificationCenter.getInstance(this.f45514b).removeObserver((s6) this.f45515c, NotificationCenter.starSubscriptionsLoaded);
                return;
        }
    }

    public t(o0 o0Var, int i10) {
        this.f45515c = o0Var;
        this.f45514b = i10;
    }
}
